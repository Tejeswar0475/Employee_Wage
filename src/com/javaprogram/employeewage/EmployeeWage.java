package com.javaprogram.employeewage;

import java.util.*;

public class EmployeeWage {

	private static final int present=1;
	private static final int absent=0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage computation program");
		Random random=new Random();
		int attendace=random.nextInt(2);
		if(attendace == present)
		{
			System.out.println("Present "+attendace);
		}
		else
		{
			System.out.println("absent "+attendace);
		}
			
	}

}
