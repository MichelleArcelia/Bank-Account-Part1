/* Week 2 Partner Pair Assignment #1  
 * @author Michelle Neptune
 * @date October 3, 2020
 * PART 3
 */

package com.meritamerica.assignment1;

public class SavingsAccount extends MeritAmericaBankApp{
	
	
// ***************** VARIABLES *****************
	
	 private static double interestRate = 0.01;
	 
	 double savingsBalance;
	

// ***************** SAVING ACCOUNT CONSTRUCTOR *****************
	
	public SavingsAccount(double openingBalance) {	
		this.savingsBalance = openingBalance; 
	}
	
// ***************** GET METHODS *****************

	
// ======= BALANCE ======= 
	
	public double getBalance() {
		return savingsBalance;
	}
		
// ======= INTEREST RATE ======= 
	
	public double getInterestRate() {
		
		return interestRate;
	}

// =======  WITHDRAW ======= 
	
	public boolean withdraw (double amount) {
		
	    if (savingsBalance < amount) {
		      
		      System.out.println("Sorry, there isn't enough money in your account");
		      return false; 
		    } 
	    
	    else {
	    	
		      
	    	savingsBalance = savingsBalance - amount;
	    	System.out.println("Congrats take your withdrawn amount of: " + amount);
		  
		      return true;
		    }
		  }
		
	
// ======= DEPOSIT ======= 
	
	public boolean deposit (double amount) {
	
	    if (amount < 0) {
		      
		      System.out.println("Sorry, your negative amount of " + amount + " can not be deposited");
		      return false;
		      
		    } else {
		      
		    	savingsBalance = savingsBalance + amount;
		    	System.out.println("Congrats we have recieved your deposit of: " + amount );
		    	
		      return true;
		    }
		  }
	
	
// ======= FUTURE VALUE ======= 
	
	double futureValue(int years) {
		
		double FV = savingsBalance * Math.pow(1 + interestRate, years);
		return FV;
		}
	
	
// =======  STRING TO STRING - OUTPUT TP BANK APP======= 
	
		public String toString() {

			
			return ("\n After your Tranactions here is your Savings Account In Detail: \n " + 
					"\n Savings Account Balance: " + getBalance() +
					"\n Savings Account Interest Rate: " + getInterestRate() +
					"\n Savings Account Balance in 3 years: " + futureValue(3)); 

		}

}
	
	
	
	
	


