package com.pankaj.staticc;

public class Account {
	
	int acc_no;
	String name;
	int balence;
	static double interest;
	
	public void print()
	{
		System.out.println(" interest is : "+interest);
		// we can write it directly 
	}
	
	public static void setInterest(double in)
	{
		interest = in;
	}
	
	
	public Account(int acc_no, String name, int balence) {
		super();
		this.acc_no = acc_no;
		this.name = name;
		this.balence = balence;
		
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalence() {
		return balence;
	}
	public void setBalence(int balence) {
		this.balence = balence;
	}
	public double getInterest() {
		return interest;
	}
	
	

}
