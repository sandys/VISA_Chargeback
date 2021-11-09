package com.incomm.esb;

import java.io.IOException;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.ResponseProcessingException;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;

import com.incomm.esb.util.Util;

/**
 * This class is REST client for VISA API's.
 * 
 * @author hahuja
 *
 */

public class RESTClient {

	private final static Logger logger = Logger.getLogger(RESTClient.class);

	/**
	 * 
	 * Generic JAX-RS client method for POSTing requests to Visa
	 * 
	 * @param target
	 *            - URL for the request
	 * @param request
	 *            - JAXB Request object
	 * @param responseClass
	 *            - class of JAXB response
	 * @return Object - representing response.
	 * @throws DatatypeConfigurationException
	 * 
	 */

	public static Object postByObjectToJasonTransformation(WebTarget target, Object request, Class<?> responseClass)
			throws WebApplicationException, ResponseProcessingException {

		Object resp = null;
		logger.debug("postByObjectToJasonTransformation >> Target = " + target.getUri().toString());
		ObjectMapper mapper = new ObjectMapper();

		// Object to JSON in String
		String jsonInString = null;
		try {
			// Removes null keys/values from JSON
			mapper.setSerializationInclusion(Inclusion.NON_NULL);
			// Pretty prints JSON in logs
			mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);

			// Use toString() of Enum during de-serialization
			// mapper.enable(DeserializationConfig.Feature.READ_ENUMS_USING_TO_STRING);

			jsonInString = mapper.writeValueAsString(request);
		} catch (IOException e) {
			logger.debug("IOEXception during conversion of request to JSON ", e);
		}

		// Request logging with masking of cardNumbers.
		logger.debug(Util.maskCardNumber(jsonInString));

		// REST API call to VISA
		resp = target.request(MediaType.APPLICATION_JSON).post(Entity.json(jsonInString), responseClass);

		// Response logging with masking of cardNumbers.
		try {
			logger.debug("postByObjectToJasonTransformation Respone="
					+ (resp != null ? Util.maskCardNumber(mapper.writeValueAsString(resp)) : null));
		} catch (JsonGenerationException e) {
			logger.debug("JsonGenerationException during conversion of response to JSON " + e.getMessage());
		} catch (JsonMappingException e) {
			logger.debug("JsonMappingException during conversion of response to JSON " + e.getMessage());
		} catch (IOException e) {
			logger.debug("IOEXception during conversion of response to JSON " + e.getMessage());
		}

		return resp;

	}

	public static Object postWithMultipartAttachement(WebTarget target, Object request, Class<?> responseClass)
			throws WebApplicationException, ResponseProcessingException {

		Object resp = null;
		logger.debug("postWithMultipartAttachement >> Target = " + target.getUri().toString());
		ObjectMapper mapper = new ObjectMapper();

		// Object to JSON in String
		String jsonInString = null;
		try {
			// Removes null keys/values from JSON
			mapper.setSerializationInclusion(Inclusion.NON_NULL);
			// Pretty prints JSON in logs
			mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);

			// Use toString() of Enum during de-serialization
			// mapper.enable(DeserializationConfig.Feature.READ_ENUMS_USING_TO_STRING);

			jsonInString = mapper.writeValueAsString(request);
		} catch (IOException e) {
			logger.debug("IOEXception during conversion of request to JSON ", e);
		}

		// Request logging with masking of cardNumbers.
		logger.debug(Util.maskCardNumber(jsonInString));

		MultipartFormDataOutput output = new MultipartFormDataOutput();
		output.addFormData("request", jsonInString, MediaType.APPLICATION_JSON_TYPE);

		resp = target.request().post(Entity.entity(output, MediaType.MULTIPART_FORM_DATA),responseClass);

		
		// Response logging with masking of cardNumbers.
		try {
			logger.debug("postWithMultipartAttachement Respone="
					+ (resp != null ? Util.maskCardNumber(mapper.writeValueAsString(resp)) : null));
		} catch (JsonGenerationException e) {
			logger.debug("JsonGenerationException during conversion of response to JSON " + e.getMessage());
		} catch (JsonMappingException e) {
			logger.debug("JsonMappingException during conversion of response to JSON " + e.getMessage());
		} catch (IOException e) {
			logger.debug("IOEXception during conversion of response to JSON " + e.getMessage());
		}

		return resp;

	}

}
