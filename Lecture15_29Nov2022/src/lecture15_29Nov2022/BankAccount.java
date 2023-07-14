/**
 * 
 */
package lecture15_29Nov2022;

/**
 * @author joshm
 *
 */
public class BankAccount {

	// instance variables go at the top - global
	private String name;
	private double balance;
	private String accNo;
	// getter and setters are so common there are auto complete options
	// either mouse over instance vars to getter /setter auto complete
	// or go to whitespace, right click, go to source
	// click on generate getter / setter

	// methods
	/**
	 * get the name
	 * 
	 * @return
	 */
	public String getName() { // template for getter
		return name;
	}

	/**
	 * set the name
	 * 
	 * @param name
	 */
	public void setName(String passedInName) { // purpose is to set the instance variable above
		name = passedInName;
	}

	/**
	 * Alternative set Name method using instance variable in built method
	 * 
	 * @param name
	 */
	public void setName2(String name) { // purpose is to set the instance variable above
		this.name = name; // use of instance variable method to distinguish between name vars
	}

	/**
	 * Autocompleted getter
	 * 
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * Autocompleted setter
	 * 
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * Autocompleted getter No setter as logic shouldn't allow
	 * 
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Update balance by adding balance amount
	 * 
	 * @param amount - the value to be deposited
	 */
	public void deposit(double amount) {
		this.balance += amount;
	}
/**
 * method to withdraw from account
 * @param amount - to be taken out of bank acc
 */
	public double withdraw(double amount) {
		if (balance >= amount) {
			this.balance -= amount;
			return amount;
		} else {
			System.err.println("Insufficent funds in Acc " + name);
			return -1;
		}
		
	}
	/**
	 * Transfer money from this account to the receiver(toAccount)
	 *  Need to solve the method logic
	 * @param amount - to transfer
	 * @param toAccount - receiver
	 */
	public void transfer(BankAccount toAccount, double amount) {
		double withdrawl = this.withdraw(amount);
		if(withdrawl !=-1) {
			toAccount.deposit(amount);
		} else {
			System.out.println("Insufficient transfer funds");
		}
		
	}

@Override
public String toString() {
	return "BankAccount [name=" + name + ", balance=" + balance + ", accNo=" + accNo + "]";
}
	
}
