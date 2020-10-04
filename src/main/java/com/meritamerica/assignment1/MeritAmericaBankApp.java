/* Week 2 Partner Pair Assignment #1  
 * @date October 3, 2020
 * PART 3
 */


package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String[] args) {

// *************** PROGRAM PRINT FILES ***************
		

//  ============= RUNNING TESTS ON ACCOUNT HOLDER ============= 	          
        
        System.out.println("******************************************");
	    System.out.println("   Welcome to Merit America Bank App!");
	    System.out.println("    Your account details are below:");
        System.out.println("******************************************");
        
        
		AccountHolder Holder1 = new AccountHolder("Luna", "the", "cat", "123-45-6789", 100, 5000);
		
		System.out.println(Holder1.toString());	
		
		Holder1.updatedSavings.withdraw(20);
		
		System.out.println("NEW Savings Information: " + Holder1.updatedSavings.toString());
		
		

        
        
        //System.out.println("-----------------------------------------");
       // System.out.println("          Checking Transactions");	    
       // System.out.println("-----------------------------------------");
	    

//  ============= RUNNING TESTS ON CHECKING ============= 	    
	  
        
	    
      // CheckingAccount lunaChecking1 = new CheckingAccount(500);
	    
      //  lunaChecking1.setwithdraw(50);
		
      //  lunaChecking1.setDeposit(100);
	    
	  //  System.out.println(lunaChecking1.toString());
	    
	    
	    
     /*   System.out.println("-----------------------------------------");
        System.out.println("          Savings Transactions");
        System.out.println("-----------------------------------------");
	    
//  ============= RUNNING TESTS ON SAVINGS ============= 	
        

	    

	    
        System.out.println("******************************************");
        System.out.println("         Transaction Complete");
        System.out.println("******************************************");
	    
	    */
	    
	}

}




/*SavingsAccount lunaSavings1 = new SavingsAccount(500);

lunaSavings1.withdraw(1);

lunaSavings1.deposit(90);

System.out.println(lunaSavings1.toString());


*/
