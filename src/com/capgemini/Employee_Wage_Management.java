package com.capgemini;

public class Employee_Wage_Management {
	public static final int Full_time = 1;
	public static final int Part_time = 2;
	public static final int Emp_Rate = 20;
	public static final int No_of_Days = 20;
	public static final int No_of_Hours = 100;
	
	public static void main(String[] args) {
		int hours = 0;
		int wage_hour = 0;
		int wage_days = 0;
		int Total_Wage = 0;
		while (wage_hour <= No_of_Hours && wage_days <= No_of_Days - 1) {
			wage_days++;
			int empCheck = (int) Math.floor(Math.random()*10)%3;
			switch (empCheck) {
			case Full_time:
				hours = 8;
				break;
			case Part_time:
				hours = 4;
				break;
			default: 
				hours = 0;
			}
			wage_hour += hours;
			System.out.println("Day"+ wage_days + " Emp hour "+ hours);
			}
	Total_Wage = wage_hour*Emp_Rate;
	System.out.println("Total Employee wage: " + Total_Wage);
	}}