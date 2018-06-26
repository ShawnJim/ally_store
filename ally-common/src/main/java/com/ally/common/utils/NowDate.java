package com.ally.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

public class NowDate {
	
	public static String NowDateFormat() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
	    return df.format(new Date());// new Date()为获取当前系统时间
	}
	
	public static void main(String[] args) {
		
		//Timestamp time1 = new Timestamp(System.currentTimeMillis());
		Timestamp time2 = new Timestamp(new Date().getTime());
		Timestamp time3 = new Timestamp(Calendar.getInstance().getTimeInMillis());
		Date time=new Date();   
		Timestamp timestamp =new Timestamp(time.getTime()); 
		System.out.println(timestamp);
	}
	
}
