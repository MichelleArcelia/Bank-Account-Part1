package com.meritamerica.assignment1;

	
public class MeritAmericaBankApp {

	public static void main(String[] args) {
		
		AccountHolder Holder1 = new AccountHolder("Luna", "the", "cat", "123-45-6789", 50, 10);
	
		System.out.println("-----------------------------------------");
	    System.out.println("   Welcome to Merit America Bank App!");
	    System.out.println("    Your account details are below:");
	    System.out.println("-----------------------------------------");
	
	
	    System.out.println("Full Name: " + Holder1.firstName + " " + Holder1.middleName + " " + Holder1.lastName);
	    
	    System.out.println("Account Balance :"+ " " + Holder1.checkingAccountOpeningBalance);
	    
	    System.out.println("Saving Balance :"+ " " + Holder1.savingsAccountOpeningBalance);
	    
	    
        System.out.println("-----------------------------------------");
        System.out.println("         Transaction Complete");
        System.out.println("-----------------------------------------");
	    
	    
	    
	}

}


