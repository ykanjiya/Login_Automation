package com.Login.com.data.automation.api.Login_master.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Login.com.data.automation.api.Login_master.service.DropdownService;
import com.Login.com.data.automation.utils.Logger;


@Controller
public class DropdownController {

    @Autowired
    private DropdownService dropdownService;

    @GetMapping("/")
    public String showPopup() {
        return "popup.html";  // Serve the popup.html page
    }

    @GetMapping("/api/applications")
    @ResponseBody
    public ResponseEntity<List<String>> getApplications() {
        return ResponseEntity.ok(dropdownService.getApplications());
    }

    @GetMapping("/api/ip-or-hostnames")
    @ResponseBody
    public ResponseEntity<List<String>> getIpOrHostnames() {
        return ResponseEntity.ok(dropdownService.getIpOrHostnames());
    }

    @GetMapping("/api/usernames")
    @ResponseBody
    public ResponseEntity<List<String>> getUsernames() {
        return ResponseEntity.ok(dropdownService.getUsernames());
    }

    @PostMapping("/api/connect")
    @ResponseBody
    public ResponseEntity<?> connect(@RequestBody Map<String, String> requestData) {
        String applicationName = requestData.get("applicationName");
        String ipOrHostname = requestData.get("ipOrHostname");
        String username = requestData.get("username");
        Logger.info("application name      "+applicationName);
        Logger.info("ipORHostname    "+ipOrHostname);
        Logger.info("username    "+username);

        try {
            // Run the Python script with the selected values
            ProcessBuilder pb = new ProcessBuilder("python3", "scripts/connect_script.py", applicationName, ipOrHostname, username);
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                return ResponseEntity.ok("Success: " + output.toString());
            } else {
                return ResponseEntity.status(500).body("Error executing script: " + output.toString());
            }
        } catch (IOException | InterruptedException e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}
