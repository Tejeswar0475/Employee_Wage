package com.javaprogram.employeewage;

import java.util.*;

public class EmpWageBuilderObject {


	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
	{
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void computeEmpWage()
	{
		int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
		Random random=new Random();
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck=random.nextInt(3);
				//(int) Math.floor(Math.random() * 10)%3;
			switch(empCheck)
			{
			case IS_PART_TIME:
					empHrs=4;
					break;
			case IS_FULL_TIME:
					empHrs=8;
					break;
			default:
					empHrs=0;
		}
			totalEmpHrs+=empHrs;
			System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
		}
	 	totalEmpWage=totalEmpHrs*empRatePerHour;
	}

	public String toString()
	{
		return "Total Emp Wage for Company: "+company+" is "+totalEmpWage;
	}
	public static void main(String[] args)
	{
		EmpWageBuilderObject dMart=new EmpWageBuilderObject("DMart", 20, 15, 55);
		EmpWageBuilderObject reliance=new EmpWageBuilderObject("Reliance", 20, 10, 40);

		dMart.computeEmpWage();
		System.out.println(dMart);


		reliance.computeEmpWage();
		System.out.println(reliance);

	}
}
