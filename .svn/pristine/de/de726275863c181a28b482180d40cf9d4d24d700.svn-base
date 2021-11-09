package com.incomm.esb.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * GetDateRangeFromTranID provides helper methods to get
 * startDate and endDate from JulianDate which is derived from
 * TransID in feed file (4 digits starting from 3rd digit).
 * 
 * Used by SubmitTransInquiry API call.
 * 
 *  
 * @author hahuja
 *
 */
public class GetDateRangeFromTranID {

	private final static Logger logger = Logger.getLogger(GetDateRangeFromTranID.class);

	protected Date startDate = null;
	protected Date endDate = null;

	
	
	/**
	 * Method to get startDate and endDate from TransID and dayRange
	 *
	 *@param - tranID - from feed file.
	 *@param - dayRange - from constants loaded from ACF/visa-vrol-restclient.properties.
	 *  
	 * @return Map<String, String> - StartDate and endDate.
	 * 
	 */

	public Map<String, String> getStartAndEndDate(String tranID, String dayRange) {
		
		logger.debug("getStartAndEndDate >> TranId=" + tranID + ",dayRange=" + dayRange);
		
		String FORMATER = "yyyy-MM-dd";

	    DateFormat format = new SimpleDateFormat(FORMATER);
		
		Map<String, String> dateMap = new HashMap<String, String>();

		String inputDate = "";

		Date todayDate = new Date();

		// get 4 digits from TransactionID starting from Digit 3.
		inputDate = tranID.substring(2, 6);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		// append to get 7 digit Julain date, First 4 are year and last 3
		// are days in year.
		if(inputDate.charAt(0) == '9' && (currentYear == 2020 || currentYear == 2030 || currentYear == 2040)){
			inputDate = (Integer.parseInt(getFirst3DigitsOfCurrentYear()) - 1) + inputDate;
		}else {
			inputDate = getFirst3DigitsOfCurrentYear() + inputDate;
		}

		int intDayRange = Integer.parseInt(dayRange);
		// gets Date based on 7 digits Julian Date
		Date dateFromJulian = getDateFromJulian(inputDate);

		// Following block gets StartDate by subtracting DayRange passed.
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateFromJulian);
		cal.add(Calendar.DATE, -intDayRange);
		startDate = cal.getTime();

		// Following block gets EndDate by adding DayRange passed.
		cal.setTime(dateFromJulian);
		cal.add(Calendar.DATE, intDayRange);
		endDate = cal.getTime();

		// if calculated EndDate is after Today's Date then EndDate is replaced
		// with today's Date
		if (endDate.after(todayDate))
			endDate = todayDate;
		
		dateMap.put(Constants.MAP_KEY_START_DATE, format.format(startDate));
		dateMap.put(Constants.MAP_KEY_END_DATE, format.format(endDate));

		logger.debug("getStartAndEndDate Start and EndDate >>" + dateMap);

		return dateMap;
	}

	/**
	 * Helper Method for getting first 3 digit of current Year.
	 * the 3 digits are prepended to inputDate derived from TransID 
	 * to get Julian Date.
	 *  
	 * @return String - first 3 digit of current year.
	 * 
	 */
	private static String getFirst3DigitsOfCurrentYear() {
		String strFirst3DigitOfYear = Constants.JULIAN_DATE_YEAR_PREFIX_DEFAULT;
		try {
			int year = Calendar.getInstance().get(Calendar.YEAR);
			strFirst3DigitOfYear = String.valueOf(year).substring(0, 3);
		} catch (Exception e) {
			logger.error("Exception in getFirst3DigitsOfCurrentYear" + e.getMessage());
			logger.error("Return strFirst3DigitOfYear=" + strFirst3DigitOfYear);
		}
		logger.debug("getFirst3DigitsOfCurrentYear >> strFirst3DigitOfYear=" + strFirst3DigitOfYear);
		return strFirst3DigitOfYear;
	}
	
	/**
	 * Helper Method to get Date from Julian Date.
	 *  
	 * @return julianDate - derived from first 3 digit of current year + four digits from TransID.
	 * 
	 */
	public static Date getDateFromJulian(String julianDate) {
		Date datefromTranID = null;
		try {
			datefromTranID = new SimpleDateFormat("yyyyD").parse(julianDate);
		} catch (ParseException e) {
			logger.error("ParseException while parsing julianDate >> " + e.getMessage());
		}
		return datefromTranID;
	}
}