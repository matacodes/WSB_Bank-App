package App;

public class BankApp {
        private static final String APP_NAME = "BANK v0.1";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        BankControl bankControl = new BankControl();
        bankControl.controlLop();
    }

    }
