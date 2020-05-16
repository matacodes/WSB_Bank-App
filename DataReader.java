package io;
import model.CustomerBank;
import java.util.Scanner;

public class DataReader {

    private Scanner reader = new Scanner(System.in);

    public CustomerBank readAndCreateAccount(){
        System.out.println("Imię: ");
        String name = reader.nextLine();
        System.out.println("Nazwisko: ");
        String surname = reader.nextLine();
        System.out.println("PIN: ");
        int pin = reader.nextInt();

        return new CustomerBank(name, surname, pin);

    }

    public  int getInt(){
        int number = reader.nextInt();
        reader.nextLine();
        return number;
    }
    public void close (){
        reader.close();
    }
}
