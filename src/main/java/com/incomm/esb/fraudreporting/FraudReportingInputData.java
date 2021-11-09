package com.incomm.esb.fraudreporting;

import com.incomm.esb.util.Util;

/**
 * POJO class which will get data from input feed file.
 * 
 * @author hahuja
 *
 */
public class FraudReportingInputData {
	
	private String Acctnumber;
	private String JIRA;
	
	public String getAcctnumber() {
		return Acctnumber;
	}
	public void setAcctnumber(String acctnumber) {
		Acctnumber = acctnumber;
	}
	public String getJIRA() {
		return JIRA;
	}
	public void setJIRA(String jIRA) {
		JIRA = jIRA;
	}
	
	public String toString(){
		return "Acctnumber="+Util.maskAccountNumber(Acctnumber)+",JIRA="+JIRA;
	}
}
