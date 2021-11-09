package com.incomm.esb.chargeback;

import javax.xml.datatype.DatatypeConfigurationException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestVisaChargebackAPIUtil {
	static ChargebackInputData chbInputData =null;
	
	@BeforeAll
	static void createInputdata() {
		chbInputData = new ChargebackInputData();
		chbInputData.setAcctNumber("4847181234567540");
		chbInputData.setTranID("017257672030015");
		chbInputData.setPartialInd("N");
		chbInputData.setExceptionInd("N");
		chbInputData.setAmount("110.01");
		chbInputData.setPartialCHBElaborationText("Not Authorized");
	}
	
	@Test
	void testCreateSubmitTIRequest() throws DatatypeConfigurationException {
		assertEquals("4847181234567540", VisaChargebackAPIUtil.createSubmitTIRequest(chbInputData).getRequestData().getCardNumber());
	}
	
	@Test
	void testCreateCaseFromTransaction() throws DatatypeConfigurationException {
		assertEquals(40672122,VisaChargebackAPIUtil.createInitiateDisputeFromTransactionOrCaseRequest(40672122l,chbInputData).getRequestData().getRolTransactionId().longValue());
	}
	
	@Test
	void testCreateDisputeQuestionnaire() {
		assertEquals(1047966626l,VisaChargebackAPIUtil.createSubmitDisputeQuestionnaire(1047966626l, 12345l, chbInputData, false,false).getRequestData().getVisaCaseNumber().longValue());
	}
	

}
