
public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Projekt ePortfel");

	}

}

// Class of bank account including four methods (deposit, withdraw, last transaction and menu) and one object (BankAccount)
class BankAccount {
    int balance; // Amount of money on customer's account
    int lastTransaction; // Amount of money that can be withdrawn or deposited during last transaction
    String customerID; // Customer ID
    String customerName; // Customer Name

    // Object of bank account
    BankAccount(String custid, String custname) {
        customerID = custid;
        customerName = custname;
    }
    
    // Method of deposit
    void deposit(int amount) {
        if (amount != 0) {
            lastTransaction = amount;
            balance = balance + lastTransaction;
        }
    }

    
    // Method of withdraw
    
    
    // Method of showing last transaction on the account


    
    
    
}