package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeChange {
	 public static final String timeStampToStringDate(String timeStamp){
		 timeStamp = timeStamp.replaceAll("-","");
		 System.out.println(timeStamp );
	    	String ret = "";
			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd",Locale.US);
			java.util.Date dstring=null;
			Date d=null;
			if(timeStamp!=null){
				try {
					dstring = df.parse(timeStamp.substring(0,8));
					//System.out.println(dstring.toString());
					d = new Date(dstring.getTime());
					//System.out.println(d.toString());
					ret = dateToString(d);
				} catch (ParseException  e) {
					System.out.println("error aya");
					ret = "";
				}
			}
	    	return ret;
	    }

		public static String dateToString(Date date){
			//System.out.println("date"+date);
			SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy",Locale.US);
			String ret="";
			if (date!=null) {
				ret = df.format(date);
			}
			return ret;

		}

		public static void main(String args[]){
			String aaa = "2013-01-01 00:00:00.0";
			aaa = aaa.replaceAll("-", "");
			String date123 = timeStampToStringDate(aaa);

			System.out.println(date123);
		}
}
