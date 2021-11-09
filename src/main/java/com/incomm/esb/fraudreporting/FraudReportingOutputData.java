package com.incomm.esb.fraudreporting;

/**
 * POJO class for output of Fraud Reporting process.
 * 
 * @author hahuja
 *
 */
public class FraudReportingOutputData {
	
	private String maskedAcctNumber;
	private String visacaseNumber;
	private String fraudReportID;
	private String tranID;
	private String amount;
	private String JIRA;
	private String responseCode;
	private String responseMessage;
	private String appResponseCode;
	private String appResponseMessage;
	private String durationTime;
	
	
	public String getAppResponseCode() {
		return appResponseCode;
	}
	public void setAppResponseCode(String appResponseCode) {
		this.appResponseCode = appResponseCode;
	}
	public String getAppResponseMessage() {
		return appResponseMessage;
	}
	public void setAppResponseMessage(String appResponseMessage) {
		this.appResponseMessage = appResponseMessage;
	}
	public String getDurationTime() {
		return durationTime;
	}
	public void setDurationTime(String durationTime) {
		this.durationTime = durationTime;
	}
	public String getJIRA() {
		return JIRA;
	}
	public void setJIRA(String jIRA) {
		JIRA = jIRA;
	}
	public String getMaskedAcctNumber() {
		return maskedAcctNumber;
	}
	public void setMaskedAcctNumber(String maskedAcctNumber) {
		this.maskedAcctNumber = maskedAcctNumber;
	}
	public String getVisacaseNumber() {
		return visacaseNumber;
	}
	public void setVisacaseNumber(String visacaseNumber) {
		this.visacaseNumber = visacaseNumber;
	}
	public String getFraudReportID() {
		return fraudReportID;
	}
	public void setFraudReportID(String fraudCaseID) {
		this.fraudReportID = fraudCaseID;
	}
	public String getTranID() {
		return tranID;
	}
	public void setTranID(String tranID) {
		this.tranID = tranID;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	public String toString() {
		return maskedAcctNumber + "," + visacaseNumber + "," + tranID + "," + amount + "," +JIRA+","+appResponseCode+","+appResponseMessage;
	}

}
