package lecture15_29Nov2022;

public class BankSystem {

	public static void main(String[] args) {
		// create objects
		BankAccount myAccount = new BankAccount();
		BankAccount nathanielsAcc = new BankAccount();
		BankAccount OtherAcc = new BankAccount();

		// use instance methods
		myAccount.setName2("Josh's Acc");
		myAccount.deposit(20.50);
		nathanielsAcc.setName("A very large one");
		nathanielsAcc.deposit(20000.75);
		nathanielsAcc.deposit(30000.75);
		
		myAccount.withdraw(10);
		nathanielsAcc.withdraw(10000);
		
		// can create array of bank account objects
		BankAccount[] accounts = new BankAccount[4];
		accounts[0] = myAccount;
		accounts[1] = nathanielsAcc;
		accounts[2] = OtherAcc;
		accounts[3] = new BankAccount(); //can put directly into array without naming
		
		for (BankAccount b: accounts) { //loop to print 
			//System.out.println(b.getName());//print instance variable name
			System.out.println(b.toString()); //used a autogenerated toString method in BankAccount class
		}
		
		myAccount.transfer(nathanielsAcc, 10);
		
		
		//print statements to see changes
		System.out.println("My account name: "+myAccount.getName());
		System.out.println("My account balance: "+myAccount.getBalance());
		System.out.println("Nathaniels account name: "+nathanielsAcc.getName());
		System.out.println("Nathaniels account balance: "+nathanielsAcc.getBalance());
		System.out.println("Other bank account name: "+OtherAcc.getName());//returns null as not set and defaults
		System.out.println("Other account balance: "+OtherAcc.getBalance());//returns 0.0 as not set and defaults
		
		
		
	}

	
}