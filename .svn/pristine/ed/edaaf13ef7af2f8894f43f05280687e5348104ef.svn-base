package com.incomm.esb.fraudreporting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestVisaFraudReportingAPIUtils {
	static FraudReportingInputData inputData =null;
	
	@BeforeAll
	static void createInputdata() {
		inputData = new FraudReportingInputData();
		inputData.setAcctnumber("4847181234567540");
		inputData.setJIRA("123456");
	}
	
	@Test
	void testCreateSubmitTIRequest() throws DatatypeConfigurationException {
		assertEquals("4847181234567540", VisaFraudReportingAPIUtil.createSubmitTIRequest(inputData).getRequestData().getCardNumber());
	}
	
	@Test
	void testCreateCaseFromTransaction() {
		assertEquals(40672122,VisaFraudReportingAPIUtil.createCaseFromTransaction(40672122l,inputData.getJIRA()).getRequestData().getRolTransactionId());
	}
	
	@Test
	void testCreateSubmitFraud() {
		assertEquals(1047966626l,VisaFraudReportingAPIUtil.createSubmitFraud(1047966626l, new BigDecimal("100.00")).getRequestData().getVisaCaseNumber().longValue());
	}
}
