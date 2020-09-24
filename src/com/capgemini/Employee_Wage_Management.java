package com.capgemini;

public class Employee_Wage_Management {

	public static void main(String[] args) {
		int Full_time = 1;
		int Part_time = 2;
		int Emp_Rate = 20;
		int hours = 0;
		int Wage = 0;
		int empCheck = (int) Math.floor(Math.random()*10)%3;
		switch (empCheck) {
		case 1:
			hours = 8;
			System.out.println("Employee was present full time and therefore wage for 8 hours will be provided");
			break;
		case 2:
			hours = 4;
			System.out.println("Employee was present part time and therefore wage for 4 hours will be provided");
			break;
		default: 
			hours = 0;
			System.out.println("Employee was Absent therefore no wage will be provided");
		}
			
		Wage = hours*Emp_Rate;
		System.out.println("Employee wage for the day is " + Wage);
		}}