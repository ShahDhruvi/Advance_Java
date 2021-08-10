package com.phoenix.enums;

public enum WeekDay {

	MONDAY(6,"mon"),TUESDAY(20),WEDNESDAY,THRUSDAY(5,"thru"),FRIDAY,SATURDAY,SUNDAY;
	
	private int dayNo;
	private String shortName;
	
	private WeekDay() {
		//dayNo = -1;
		System.out.println("No-Arg Constructor ");
	}
	
	WeekDay(int dayNo) {
		this.dayNo  = dayNo;
		System.out.println("Parameterized Constructor of single value");
	}
	
	WeekDay(int dayNo, String shortName){
		this.dayNo = dayNo;
		this.shortName = shortName;
		System.out.println("Parameterized Constructor of double value");
	}
	
	
	public int getDayNo()
	{
		return dayNo;
	}
	
	public String getShortName() {
		return shortName;
	}
}
