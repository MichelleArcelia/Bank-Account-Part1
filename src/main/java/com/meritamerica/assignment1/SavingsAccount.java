/* Week 2 Partner Pair Assignment #1  
 * 
 * PART 3
 */

package com.meritamerica.assignment1;

public class SavingsAccount extends MeritAmericaBankApp{
	
	
// ***************** VARIABLES *****************
	
	 double savingAccountRate;
	 double savingsAccountOpeningBalance; 
	 double savingsBalance;
	 double amount; 
	

// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	public SavingsAccount(double savingsAccountOpeningBalance) {	
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
	}
	
// ***************** GET METHODS *****************

	public double getBalance() {
		return savingsBalance;
	}
		

	public double getInterestRate() {
		return savingAccountRate;
	}
	
	public boolean withdraw (double amount) {
		
		double amount = double savingsAccountOpeningBalance - boolean withdraw;
		return amount;
	
	}
	
	
	public boolean deposit (double amount) {
	
		if (amount > 0) {
			savingsAccountOpeningBalance = savingsAccountOpeningBalance + amount;
			
			return amount;
		}
	}
}
	
	
	
	
	




/* double getBalance()
double getInterestRate()
boolean withdraw(double amount)
boolean deposit(double amount)
double futureValue(int years)
String toString()
*/