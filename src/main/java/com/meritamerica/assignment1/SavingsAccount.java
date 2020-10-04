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
	 
	 
	 double savingsBalance;
	 

	 
	 double amount; 
	 boolean withdraw;
	 boolean deposit1;
	

// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	public SavingsAccount(double savingsAccountOpeningBalance) {	
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
		savingsBalance = 100.00;
	}
	
// ***************** GET METHODS *****************

	
// ***** BALANCE *****
	
	public double getBalance() {
		return savingsAccountOpeningBalance;
	}
		
// ***** INTEREST RATE *****
	
	public double getInterestRate() {
		return savingAccountInterestRate = 0.01;
	}

// ***** WITHDRAW *****
	
	public boolean withdraw (double amount) {
		if (savingsBalance - amount >= 0) {
			savingsBalance = savingsBalance - amount;
			return true;	
		}
		else {
			return false;
		}
	}
	
// ***** DEPOSIT *****
	
	public boolean deposit1 (double amount) {
	
		if (amount >= 0) {
			savingsBalance = savingsBalance + amount;
			return true;	
		}
		else {
			return false;
		}
	}
	
	
// ***** FUTURE VALUE *****
	
	double futureValue(int years) {
		return years;

		}
	
	
	
// ***** STRING TO STRING *****
	
	// OUTPUT
		public String toString() {
			return "\n Savings Account Balance: " + savingsAccountOpeningBalance +
					"\n Savings Account Interest Rate: " +
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