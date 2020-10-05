/* Checking Account
Week 2 Partner Pair Assignment #1
 * @author Allana Gray
 * @Date October 3, 2020
 * Part 2
 */

package com.meritamerica.assignment1;

public class CheckingAccount extends MeritAmericaBankApp{
	
	
    // instance variable
	private static double interestRate = 0.0001;
	
	double checkingBalance;
	
	
    //Constructor of objects of class CheckingAccount
	public CheckingAccount(double openingBalance) {
		this.checkingBalance = openingBalance;
	}

	//Balance
	public double getBalance() {
		return checkingBalance;
	}
	
	
	//Interest Rate
	public double getInterestRate() {
		return interestRate;
		 	
		
	}
	

    //Withdraw
	public boolean withdraw (double amount) {
		if (checkingBalance < amount) {
			System.out.println ("Sorry, there isn't enough money in your account");
			return false;
	}	
		else { checkingBalance =checkingBalance - amount;
		System.out.println ("Congrats take your withdrawn amount of:" + amount);
		return true;
		}
	}
	
	 
	//Deposit
	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println ("Sorry, your negative amount of " + amount + "can not be deposited");
			return false;
		
		}
		else { checkingBalance = checkingBalance + amount;
		System.out.println ("Congrats we have received your deposit: " + amount);
		
		return true;
		}
	}
		
		
	
	// Future Value
	public  double futureValue(int years) {
		double FV = checkingBalance * Math.pow(1 + interestRate,years);
		return FV;
		
		
	}
		
	//StringtoStringOutput
	public String toString() {
		
		return ("\n After your transaction here is your Checking Account in Detail: \n" +
				"\n Checking Account Balance: " + getBalance()+
				"\n Checking Account Interest Rate:" + getInterestRate()+
				"\n Checking Account Balance in 3 years:" + futureValue(3)); 
				
	
	}
	
}
	

	 

	
	
	
	
	
	