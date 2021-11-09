package com.incomm.esb.chargeback;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.incomm.esb.util.Util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Util Tester")
class TestUtil {

	@Test
	void testGetPurgeDate() {
		assertNotNull(Util.getPurgeDate("40") );
	}
	
	@Test
	void testMaskAccountNumber() {
		//mask works for card starting with 4 only.
		assertEquals("410012******1234",Util.maskCardNumber("4100123412341234"));
		
		assertEquals("5100123412341234", Util.maskCardNumber("5100123412341234"));
	}

	
}
