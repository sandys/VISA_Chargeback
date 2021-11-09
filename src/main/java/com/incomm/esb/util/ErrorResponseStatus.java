package com.incomm.esb.util;

/**
 * This class provide Java object for deserialization of Error Status.
 * 
 * An example error Status that we can get from VISA is
 * 
 * { "Status" : [ { "Code" : "E-300300051", "Message" :
 * "No matching transactions found." } ] }
 * 
 * @author hahuja
 *
 */
public class ErrorResponseStatus {
	private Status[] status;

	public Status[] getStatus() {
		return status;
	}

	public void setStatus(Status[] status) {
		this.status = status;
	}

}
