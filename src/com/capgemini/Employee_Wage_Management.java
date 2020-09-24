package com.capgemini;

public class Employee_Wage_Management {

	public static void main(String[] args) {
		int Full_time = 1;
		int Part_time = 2;
		int Emp_Rate = 20;
		int hours = 0;
		int Wage = 0;
		double empCheck = Math.floor(Math.random()*10)%3;
		if (empCheck == Full_time) {
			hours = 8;
			System.out.println("Employee was present full time and therefore wage for 8 hours will be provided");
		}
		else if (empCheck == Part_time) {
			hours = 4;
			System.out.println("Employee was present part time and therefore wage for 4 hours will be provided");
		}
		else { 
			hours = 0;
			System.out.println("Employee was Absent therefore no wage will be provided");
		}
		Wage = hours*Emp_Rate;
		System.out.println("Employee wage for the day is " + Wage);
}}