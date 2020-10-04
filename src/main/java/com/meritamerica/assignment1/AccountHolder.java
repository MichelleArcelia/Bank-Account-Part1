/* Week 2 Partner Pair Assignment #1  
 * @author Michelle Neptune
 * @date October 3, 2020
 * PART 1
 */

package com.meritamerica.assignment1;

public class AccountHolder extends MeritAmericaBankApp{
	
// ***************** VARIABLES *****************
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	
	double openingBalance;

// ***************** ACCOUNT HOLDER CONSTRUCTOR *****************
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName; 
		this.lastName = lastName; 
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
	} 

// ***************** GET & SET METHODS *****************
	
// ***** FIRST NAME ***** 

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

// ***** MIDDLE NAME ***** 

	public String getMiddleName() {
		return middleName;
	}
		
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

// ***** LAST NAME ***** 

	public String getLastName() {
		return lastName;
	}
		
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

// ***** SSN ***** 

	public String getSSN() {
		return ssn;
	}
		
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

//***** CHECKING ACCOUNT ***** 
	
	public double getCheckingAccount() {
		return checkingAccountOpeningBalance;
	}

//***** SAVINGS ACCOUNT ***** 

		public double getSavingsAccount() {
			
			return openingBalance;
		}

// OUTPUT
	public String toString() {
		return "\n Name: " + firstName + " " + middleName + " " + lastName + 
		"\n SSN:" + ssn +
		"\n Checking Account Balance:" + openingBalance +
		"\n Checking Account Interest Rate: 0.0001" + 
		"\n Checking Account Balance in 3 years: **************"; 
		
		//FIX THIS!!!!!!!!!!!!!!
	}

}
 


//@Override ???
//@return - explain what happens at return

/*public void statement() {
	System.out.println("Name:" + firstName + middleName + lastName);
	System.out.println("SSN:" + ssn);
	System.out.println("Checking Account Balance:" + checkingAccountOpeningBalance);
	System.out.println("Checking Account Interest Rate: 0.0001");
	System.out.println("Checking Account Balance in 3 years: **************");
	System.out.println("Savings Account Balance in 3 years: ***************");
	System.out.println("Savings Account Interest Rate: 0.01");
	System.out.println("Savings Account Balance in 3 years:");


*/



