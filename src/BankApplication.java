import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Projekt ePortfel");
		
		//Creating new bank account with specific cust ID and name 
		BankAccount account1 = new BankAccount("1234", "Kowalski");
        account1.menu();


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
    void withdraw(int amount) {
        if (amount != 0) {
            lastTransaction = -amount;
            balance = balance + lastTransaction;
        }
    }

    
    // Method of showing last transaction on the account
    void getLastTransaction() {
        if (lastTransaction > 0) {
            System.out.println("Zdeponowano: " + lastTransaction);
        } else if (lastTransaction < 0) {
            System.out.println("Wyp³acono: " + Math.abs(lastTransaction));
        } else {
            System.out.println("Brak tranzakcji na koncie");
        }
    }

    // Method of showing menu
    void menu() {
        char option = '0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Klient: " + customerName);
        System.out.println("ID Klienta: " + customerID);
        System.out.println("");
        System.out.println("1. Sprawdz balans konta");
        System.out.println("2. Wplata");
        System.out.println("3. Wyplata");
        System.out.println("4. Ostatnia tranzakcja");
        System.out.println("5. Koniec");

        do {
            System.out.println("** Wprowadz numer menu **");
            option = scanner.next().charAt(0);
            System.out.println();

            switch (option) {

            case '1':
                System.out.println("Balans: " + balance);
                System.out.println();
                break;

            case '2':
                System.out.println("Wprowadz kwotê, któr¹ chcesz wp³aciæ:");
                int amount = scanner.nextInt();
                deposit(amount);
                System.out.println();
                break;

            case '3':
                System.out.println("Wprowadz kwotê, któr¹ chcesz wyp³aciæ:");
                int amount1 = scanner.nextInt();
                withdraw(amount1);
                System.out.println();
                break;

            case '4':
                getLastTransaction();
                System.out.println();
                break;

            case '5':
                System.out.println("Koniec.");
                break;
                
            default:
                System.out.println("Wprowadzono b³êdn¹ opcjê, spróbuj jeszcze raz.");
                break;
            }
        } while (option != '5');
        System.out.println("Dziêkujemy za korzystanie z naszego serwisu ePortfel. Do zobaczenia ponownie!");

    }



    
    
    
}