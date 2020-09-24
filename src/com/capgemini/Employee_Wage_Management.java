package com.capgemini;

public class Employee_Wage_Management {

	public static void main(String[] args) {
		int Full_time = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == Full_time)
			System.out.println("Employee is present");
		else 
			System.out.println("Employee is Absent");
	}
} 

