package com.Login.com.data.automation.commanresponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@JsonIgnoreProperties({ "validationMessage", "checkValidationFailed", "checkForUnAuthorized" })
public class CommonAPIDataResponse {


	//@JsonProperty("validationMessage")
	private String validationMessage;

	//@JsonProperty("checkValidationFailed")
	private boolean checkValidationFailed;

	//@JsonProperty("checkForUnAuthorized")
	private boolean checkForUnAuthorized;

	//@JsonInclude(JsonInclude.Include.NON_EMPTY)
	//@JsonProperty("message")
	private String message;

	public String getValidationMessage() {
		return validationMessage;
	}

	public void setValidationMessage(String validationMessage) {
		this.validationMessage = validationMessage;
	}

	public boolean isCheckValidationFailed() {
		return checkValidationFailed;
	}

	public void setCheckValidationFailed(boolean checkValidationFailed) {
		this.checkValidationFailed = checkValidationFailed;
	}

	public boolean isCheckForUnAuthorized() {
		return checkForUnAuthorized;
	}

	public void setCheckForUnAuthorized(boolean checkForUnAuthorized) {
		this.checkForUnAuthorized = checkForUnAuthorized;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
