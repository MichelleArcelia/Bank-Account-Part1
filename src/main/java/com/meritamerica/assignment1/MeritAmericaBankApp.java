/* Week 2 Partner Pair Assignment #1  
 * @date October 3, 2020
 * PART 3
 */


package com.meritamerica.assignment1;

	
public class MeritAmericaBankApp {

	public static void main(String[] args) {
		
		
// *************** RUNNING TESTS	 ***************	
		
		//AccountHolder Holder1 = new AccountHolder("Luna", "the", "cat", "123-45-6789", 100, 1000);
		
	
		
		SavingsAccount lunaSavings1 = new SavingsAccount(50);
	    


		
		
// *************** PROGRAM PRINT FILES ***************
	
		System.out.println("-----------------------------------------");
	    System.out.println("   Welcome to Merit America Bank App!");
	    System.out.println("    Your account details are below:");
	    System.out.println("-----------------------------------------");
	
	
	   // System.out.println(Holder1.toString());
	    
	    
	    
	    
	    
		lunaSavings1.withdraw(1);
		
		lunaSavings1.deposit(90);
	    
	    System.out.println(lunaSavings1.toString());
	    


	
	    
        System.out.println("-----------------------------------------");
        System.out.println("         Transaction Complete");
        System.out.println("-----------------------------------------");
	    
	    
	    
	}

}


