package com.incomm.esb.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.DatatypeConverter;

/**
 * This class provides filter for Basic authentication of REST API calls (used
 * while creating client) to VISA.
 * 
 * user and password would be configured in ACF or
 * visa-vrol-restclient.properties.
 * 
 * @author hahuja
 *
 */
@Provider
public class Authenticator implements ClientRequestFilter {

	private final String user;
	private final String password;

	public Authenticator(String user, String password) {
		this.user = user;
		this.password = password;
	}

	public void filter(ClientRequestContext requestContext) throws IOException {
		MultivaluedMap<String, Object> headers = requestContext.getHeaders();
		final String basicAuthentication = getBasicAuthentication();
		headers.add("Authorization", basicAuthentication);

	}

	private String getBasicAuthentication() {
		String token = this.user + ":" + this.password;
		try {
			return "Basic " + DatatypeConverter.printBase64Binary(token.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException ex) {
			throw new IllegalStateException("Cannot encode with UTF-8", ex);
		}
	}
}