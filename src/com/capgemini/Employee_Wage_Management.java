package com.capgemini;

public class Employee_Wage_Management {
	public static final int Full_time = 1;
	public static final int Part_time = 2;
	public static final int Emp_Rate = 20;
	public static final int No_of_Days = 20;
	
	public static void main(String[] args) {
		int hours = 0;
		int Wage = 0;
		int Total_Wage = 0;
		for(int day = 1; day < No_of_Days + 1 ; day++) {
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
		Wage = hours*Emp_Rate;
		Total_Wage += Wage;
		System.out.println("On day " + day + " Employee wage will be " + Wage);
		}
		System.out.println("Total Wage = " + Total_Wage);
	}}