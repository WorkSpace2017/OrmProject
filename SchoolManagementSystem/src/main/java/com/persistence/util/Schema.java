package com.persistence.util;

import org.hibernate.cfg.DefaultNamingStrategy;

public class Schema extends DefaultNamingStrategy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String EMR_DB;
	 @Override
	   public  String tableName(String tableName) {
		 String result="";
		 if(!tableName.substring(0,5).equals("QS36F")){
			 result= EMR_DB+"."+tableName;
		 }
		 else{
			 result=tableName;
		 }
		 return result;
	   }
	public static String getEMR_DB() {
		return EMR_DB;
	}
	public static void setEMR_DB(String eMR_DB) {
		EMR_DB = eMR_DB;
	}
	 
	
}
