package com.incomm.esb.chargeback;

import com.incomm.esb.util.Util;

/**
 * POJO class which will get data from input feed file.
 * 
 * @author hahuja
 *
 */
public class ChargebackInputData {

	private String acctNumber;
	private String tranID;
	private String amount;
	private String partialInd;
	private String exceptionInd;
	private String partialCHBElaborationText;

	public String getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
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

	public String getPartialInd() {
		return partialInd;
	}

	public void setPartialInd(String partialInd) {
		this.partialInd = partialInd;
	}

	public String getExceptionInd() {
		return exceptionInd;
	}

	public void setExceptionInd(String exceptionInd) {
		this.exceptionInd = exceptionInd;
	}

	public String getPartialCHBElaborationText() {
		return partialCHBElaborationText;
	}

	public void setPartialCHBElaborationText(String partialCHBElaborationText) {
		this.partialCHBElaborationText = partialCHBElaborationText;
	}

	public String toString() {
		return "acctNumber=" + Util.maskAccountNumber(acctNumber) + ",tranID=" + tranID + ",amount=" + amount
				+ ",partialInd=" + partialInd + ",exceptionInd=" + exceptionInd + ",partialCHBElaborationText=" + partialCHBElaborationText;
	}

}
