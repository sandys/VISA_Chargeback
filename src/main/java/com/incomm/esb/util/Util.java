package com.incomm.esb.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;

/**
 * General Utility methods in this class.
 * 
 * @author hahuja
 *
 */

public class Util {

	private final static Logger logger = Logger.getLogger(Util.class);

	
	/**
	 * Utility method to convert java.util.Date to XMLGeorgianCalendar(JAXB
	 * generated code is using this)
	 * 
	 * @return XMLGregorianCalendar
	 * @throws DatatypeConfigurationException
	 */
	public static XMLGregorianCalendar getXMLGeorgianCalendarFromDate(Date date) throws DatatypeConfigurationException {
		logger.debug("getXMLGeorgianCalendarFromDate >> Date=" + date);
		String FORMATER = "yyyy-MM-dd";

		DateFormat format = new SimpleDateFormat(FORMATER);

		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(date));
		logger.debug("getXMLGeorgianCalendarFromDate >> XMLGregorianCalendar=" + date2);
		return date2;
	}

	/**
	 * Utility method to convert XMLGeorgianCalendar(JAXB generated code is
	 * using this) to java.util.Date
	 * 
	 * @return Date
	 * @throws DatatypeConfigurationException
	 */

	public static Date getDateFromXMLGeorgianCalendar(XMLGregorianCalendar date) throws DatatypeConfigurationException {
		XMLGregorianCalendar xcal = date;
		Date dt = xcal.toGregorianCalendar().getTime();
		return dt;
	}

	/**
	 * Utility method to get Date from today's date after days specified using
	 * dayRange.
	 * 
	 * @param dayRange
	 *            - Number of days.
	 * @return Date
	 * @throws DatatypeConfigurationException
	 */
	public static String getPurgeDate(String dayRange) {
		logger.debug("getPurgeDate >> dayRange = " + dayRange);
		Date todayDate = new Date();
		int intDayRange = Integer.parseInt(dayRange);

		String FORMATER = "yyyy-MM-dd";

		DateFormat format = new SimpleDateFormat(FORMATER);

		// Following block gets PurgeDate by adding DayRange passed.
		Calendar cal = Calendar.getInstance();
		cal.setTime(todayDate);
		cal.add(Calendar.DATE, intDayRange);
		return format.format(cal.getTime());
	}

	/**
	 * Utility method to mask 7-12 digit of Account Number.
	 * 
	 * @param acctNumber
	 *            -16 digit account number.
	 * @return maskedAcctNumber
	 * 
	 */
	public static String maskAccountNumber(String acctNumber) {
		if (acctNumber.length() == 16) {
			return acctNumber.substring(0, 6) + "******" + acctNumber.substring(12);
		} else {
			return "Acctnumber is not 16 digit";
		}
	}

	/**
	 * subtract days to date in java
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date subtractDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, -days);

		return cal.getTime();
	}

	public static String maskCardNumber(String text) {
		final String MASKCARD = "$1$2******$3";
		
		 final Pattern PATTERNCARD =
		 Pattern.compile("\\b([4]{1})([0-9]{5})[0-9]{6}([0-9]{4})\\b");
		 
		//final Pattern PATTERNCARD = Pattern.compile("([0-9]{4})[0-9]{0,9}([0-9]{4})");
		Matcher matcher = PATTERNCARD.matcher(text);
		if (matcher.find()) {
			return matcher.replaceAll(MASKCARD);
		}
		return text;

	}
}
