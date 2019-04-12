package com.md.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UidUtil {
	private static Random random=new Random();
	public static String getUid(){
		int i = random.nextInt(10000);
		String s = String.valueOf( LocalDateTime.now().toInstant(ZoneOffset.of("+8")).getEpochSecond());
		
		return s+String.valueOf(i);
	}
	
	public static void main(String[] args) {
		//时间转字符串格式化
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
		 Timestamp t = Timestamp.valueOf(dateTime);
		 long time = t.getTime()+86400000;
		 Timestamp ss = new Timestamp(time);
		 System.out.println(ss);
		//字符串转时间
		String dateTimeStr = "2018-07-28 14:11:15";
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime ttt = LocalDateTime.parse(dateTimeStr, df);
	}
}
