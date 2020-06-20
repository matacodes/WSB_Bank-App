package model;
import io.DataReader;
import model.CustomerBank;
        
public class Account {

    private static final int MAX_ACCOUNT = 10;
    private Account[] accounts = new Account[MAX_ACCOUNT];
    private int accountNumber = 0;

    public static void addAccount(CustomerBank customerBank) {
    }

    public void addAccount(Account account) {
        if (accountNumber < MAX_ACCOUNT) {
            accounts[accountNumber] = account;
            accountNumber++;
        } else {
            System.out.println("Maksymalna liczba zostałą osiągnięta");
        }

    }

    public void printAccount() {
        if (accountNumber == 0) {
            System.out.println("Brak kont w systemie");
        }
        for (int i = 0; i < accountNumber; i++) {
            accounts[i].printInfo();
        }
    }

    private void printInfo() {
    }
}
