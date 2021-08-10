package com.phoenix.enums.main;

import com.phoenix.enums.Color;
import com.phoenix.enums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Color.BLUE);
		System.out.println("ordinal :" +Color.BLUE.ordinal());
	
		for(Color color: Color.values())
			System.out.println(color);
		
		for(WeekDay day: WeekDay.values())
			System.out.println(day);
		System.out.println(WeekDay.THRUSDAY);
		System.out.println("Ordinal: "+WeekDay.THRUSDAY.ordinal());
		System.out.println("Day No: "+WeekDay.THRUSDAY.getDayNo());
		System.out.println("Short Name: "+WeekDay.THRUSDAY.getShortName());
		
		WeekDay today = WeekDay.TUESDAY;
		System.out.println(today);
		System.out.println("Day No: "+today.getDayNo());
		System.out.println("Short Name: "+today.getShortName());

		WeekDay whichDay = WeekDay.MONDAY;
		switch (whichDay) {
		case MONDAY:
			System.out.println("Go to Office");
			break;
		case TUESDAY:
			System.out.println("Meeting with Team");
			break;
		case SATURDAY:
			System.out.println("Weekend");
			break;
		case SUNDAY:
			System.out.println("Rest");
			break;
		default:
			System.out.println("Sorry! Wrong choice");
		}

	}
}
