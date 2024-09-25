package com.Login.com.data.automation.commanresponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Data
@Getter
@Setter
public class SuccessResponse {

    @JsonProperty("success")
    private int success;

    @JsonProperty("error")
    private ArrayList<String> error;

    @JsonProperty("data")
    private Object data;

    public SuccessResponse(int success, ArrayList<String> error, Object data) {
        this.success = success;
        this.error = error;
        this.data = data;
    }
}
