package com.incomm.esb.util;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

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

@JsonIgnoreProperties(ignoreUnknown = true)
public class Status {
	 @JsonProperty("Code")
	public String code;
	 @JsonProperty("Message")
	public String message;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
