package com.persistence.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static Date getDateTimeForAccessManagement(String date) {
		Date objDate = null;
		DateFormat dateFormat = null;
		try {
			dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			objDate = (java.util.Date) dateFormat.parse(date);
			
		} catch (ParseException pe) {
			pe.printStackTrace();
		}
		return objDate;
	}
	
	
}
