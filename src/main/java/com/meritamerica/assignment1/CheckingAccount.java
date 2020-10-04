/* Checking Account
Week 2 Partner Pair Assignment #1
 * @author Allana Gray
 * @Date October 3, 2020
 * Part 2
 */

package com.meritamerica.assignment1;

public class CheckingAccount extends MeritAmericaBankApp{
	
	
    // instance variable
	private double balance;
	
	
	
    /** Constructor for object of class CheckingAccount*/
	public CheckingAccount(double openingBalance) {
		balance = 100.00;
	}

	/** Get the balance, @return the balance*/
	public double getBalance() {
		return balance;
	}
	
	
	/** @return the interest rate*/
	public double getInterestRate() {
		double rate;
		return rate = 0.001;
		 	
		
	}
	

    /** Remove money from the balance, @param amount the amount to withdraw
    * @return true (success) or false (failure)*/
	public boolean setwithdraw (double amount) {
		if (balance - amount >= 0 ) {
			balance -= amount;
			return true;
		}else {
			return false;
	}
	}		
	
	 
	/** Add money to balance, @param amount the amount to deposit,* @void*/
	public void setDeposit(double amount) {
		balance = balance + amount;
		
	}
	
	public  double futureValue(int years) {
		return years;
		
		
	}
		
	
	
	//public String toStrings(){
		// return null;
	 }
	 
	
	
	
	
	
	