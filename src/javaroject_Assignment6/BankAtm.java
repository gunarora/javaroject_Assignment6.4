package javaroject_Assignment6; //Package declaration is mandatory


public class BankAtm {
	//Declare variables
	int atmId; 
	String bankName;
	String location; 
	double balance;
	
	//Parameterized Constructor
	public BankAtm(int atmId, String bankName, String location, int balance) {							
		this.atmId = atmId;																				
		this.bankName = bankName;																		
		this.location = location;																		
		this.balance = balance;																			
		System.out.println("***********" );						
		System.out.println("ATM ID                     : " +this.atmId );								
		System.out.println("Bank Name                  : " +this.bankName );							
		System.out.println("Location                   : " +this.location );							
		System.out.println("Balance                    : " +this.balance );								
		System.out.println("***********" );
		}								
	
	/*Withdraw method  should check the available balance in the ATM before
	deducting the amount from the balance. If the balance is less than 10000 the
	withdrawal should not be allowed and a user-defined exception
	BankATMException should be thrown. The withdrawal should also not be allowed
	if the amount to be withdrawn is greater than balance.*/
	public void withdraw(double amount)throws BankATMException{	
		//Print the amount to be withdraw
		System.out.println("Amount Withdraw : " +amount );		
		//if amount > balance then show exception otherwise deduct amount from balance and print new balance
		if(balance < 10000){																				
			throw new BankATMException("Balance is less than 10000. You Cannot withdraw");
		}		
		else if (amount>balance)
		{
			throw new BankATMException("You Cannot withdraw Amount. Balance is low.");
		}
		else {																							
			balance=balance-amount;
			System.out.println("New Balance After Withdraw : "+balance);}								
	}	
	
	//Deposit amount and print new amount
	public void deposit(double amount)throws BankATMException {											
		System.out.println("Amount Deposit             : " +amount );									
		if(amount<=0.0){																				
			throw new BankATMException("Cannot deposit Money. Amount entered is incorrect.");											
	}else{																								
		balance =balance+amount;																		
		System.out.println("New Balance After Deposit  : "+balance+"\n");								
		System.out.println("---------End of the Statement-----------\n");}								
	}
	
	//Main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BankAtm batm1=new BankAtm(1, "Kotak Bank", "Mumbai", 15000);		
	   	try {																	
	   		batm1.withdraw(2000);											
	   		batm1.deposit(-225);												
			}catch(Exception e) {												
				System.out.println("Exception occurred "+e);}					
		
	   	BankAtm batm2=new BankAtm(2, "Citi Bank", "Mumbai", 15000);		
	   	try {																	
	   		batm2.withdraw(16000);											
	   		batm2.deposit(4250);												
			}catch(Exception e) {												
				System.out.println("Exception occurred "+e);}					

	   	BankAtm batm3=new BankAtm(3, "HDFC Bank", "DELHI", 9000);	
	   	try {																	
	   		batm3.withdraw(10500);											
	   		batm3.deposit(500);												
	   		}catch(Exception e) {												
				System.out.println("Exception occurred "+e);}	

	}

}
