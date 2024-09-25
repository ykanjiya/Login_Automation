package com.Login.com.data.automation.api.Login_master.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.com.data.automation.api.Login_master.dao.TxtMasterRepository;
import com.Login.com.data.automation.api.Login_master.model.TxtMaster;

@Service
public class DropdownService {
    @Autowired
    private TxtMasterRepository txtMasterRepository;

    // Fetch unique application names
    public List<String> getApplications() {
        return txtMasterRepository.findAll().stream()
                .map(TxtMaster::getApplicationName)
                .distinct()
                .collect(Collectors.toList());
    }

    // Fetch unique IP or hostnames
    public List<String> getIpOrHostnames() {
        return txtMasterRepository.findAll().stream()
                .map(TxtMaster::getIpOrHostname)
                .distinct()
                .collect(Collectors.toList());
    }

    // Fetch unique usernames
    public List<String> getUsernames() {
        return txtMasterRepository.findAll().stream()
                .map(TxtMaster::getUsername)
                .distinct()
                .collect(Collectors.toList());
    }

    public TxtMaster findById(Long id) {
        return txtMasterRepository.findById(id).orElse(null);
    }
}
