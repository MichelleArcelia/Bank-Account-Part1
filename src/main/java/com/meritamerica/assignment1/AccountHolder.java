/* Week 2 Partner Pair Assignment #1  
 * 
 * PART 1
 * 
Create the following classes with the following methods:
AccountHolder
AccountHolder() - default constructor
AccountHolder(String firstName, String middleName, String middleName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)

String getFirstName()
void setFirstName(String firstName)
String getMiddleName()
void setMiddleName(String middleName)
String getLastName()
void setLastName(String lastName)
String getSSN()
void setSSN(String ssn)
CheckingAccount getCheckingAccount()
SavingsAccount getSavingsAccount()
String toString()
Sample output:
Name: John James Doe
SSN: 123-45-6789
Checking Account Balance: $100
Checking Account Interest Rate: 0.0001
Checking Account Balance in 3 years: $100.03
Savings Account Balance: $1000
Savings Account Interest Rate: 0.01
Savings Account Balance in 3 years: $1030.03
 */

package com.meritamerica.assignment1;



public class AccountHolder {
	
// ***************** VARIABLES *****************
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	

// ***************** ACCOUNT HOLDER CONSTRUCTOR *****************

	
private AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
	
	this.firstName = firstName;
	this.middleName = middleName; 
	this.lastName = lastName; 
	this.ssn = ssn;
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance; 
	
} 

// ***************** GET & SET METHODS *****************
	
//FIRST NAME

public String getFirstName() {
	return firstName;
	}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}

//MIDDLE NAME


//@return - 

public String getMiddleName() {
	return middleName;
	}


public void setMiddleName(String middleName) {
	this.middleName = middleName;
}



// @Override
public String toString() {
	return "first Name" + firstName; 
}

 





public void statement() {
	System.out.println("Name:" + firstName + middleName + lastName);
	System.out.println("SSN:" + ssn);
	System.out.println("Checking Account Balance:" + checkingAccountOpeningBalance);
	System.out.println("Checking Account Interest Rate: 0.0001");
	System.out.println("Checking Account Balance in 3 years: **************");
	System.out.println("Savings Account Balance in 3 years: ***************");
	System.out.println("Savings Account Interest Rate: 0.01");
	System.out.println("Savings Account Balance in 3 years:");


*/



