/* Week 2 Partner Pair Assignment #1  
 * @author Michelle Neptune
 * @date October 3, 2020
 * PART 3
 */

package com.meritamerica.assignment1;

public class SavingsAccount extends MeritAmericaBankApp{
	
	
// ***************** VARIABLES *****************
	
	 double savingAccountInterestRate;
	 double savingsAccountOpeningBalance; 
	 
	 double newBalance;
	 
	 
	// double savingsBalance;
	 
	 double openingBalance = 100; 
	 
	 double amount; 
	 boolean withdraw;
	 boolean deposit1;
	 String getInterestRate;
	

// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	public SavingsAccount(double openingBalance) {	
		this.savingsAccountOpeningBalance = openingBalance; 
		openingBalance = 100.00;
	}
	
// ***************** GET METHODS *****************

	
// ***** BALANCE *****
	
	public double getBalance() {
		return openingBalance;
	}
		
// ***** INTEREST RATE *****
	
	public double getInterestRate() {
		
		
		
		return savingAccountInterestRate = 0.01;
	}

// ***** WITHDRAW *****
	
	public boolean withdraw (double amount) {
		if (openingBalance - amount >= 0) {
			openingBalance = openingBalance - amount;
			return true;	
		}
		else {
			return false;
		}
	}
	
// ***** DEPOSIT *****
	
	public boolean deposit (double amount) {
	
		if (amount <= 0) {
			
			System.out.println("CAN NOT DEPOSIT A NEGATIVE AMOUNT");
			
			return false; 
				
		}
		else {
			openingBalance = openingBalance + amount;
			
			System.out.println(openingBalance);
			
			return true;
			
		}
	}
	
	
// ***** FUTURE VALUE *****
	
	double futureValue(int years) {
		
		
		
		return Math.pow(openingBalance, years);

		}
	
	
	
// ***** STRING TO STRING *****
	
	// OUTPUT
		public String toString() {

			return "\n Savings Account Balance: " + openingBalance +
					"\n Savings Account Interest Rate: " + savingAccountInterestRate +
					"\n Savings Account Balance in 3 years: "; 
			
		}
	
	
}
	
	
	
	
	




/* double getBalance()
double getInterestRate()
boolean withdraw(double amount)
boolean deposit(double amount)
double futureValue(int years)
String toString()
*/