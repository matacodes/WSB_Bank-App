package model;
import io.DataReader;
import model.Account;
public class CustomerBank {

    private String name;
    private String surname;
    private String login;
    private int pin;

    public CustomerBank(String name, String surname, int pin) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.pin = pin;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getLogin() { return login; }

    public void setLogin(String login) { this.login = login; }

    public int getPin() { return pin; }

    public void setPin(int pin) { this.pin = pin; }

}
