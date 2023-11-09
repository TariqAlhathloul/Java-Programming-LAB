package JavaProgrammingLAB.LAB7;

/*
|----------------------------------|
|DATE: week 11 | 2023 Nov 9 | LAB 7|
|----------------------------------|
*/

public class BankAccount {

    /*attributes*/
    private long accountNumber;
    private double balance;
    private String customerName;
    /*constructor without parameters*/
    public BankAccount() {
        accountNumber = 0;
        balance = 0.0;
        customerName = "";
    }

    /*constructor with three parameters to initialize all the attributes*/
    public BankAccount(long accountNumber, double balance, String customerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }


    /*setter methods*/
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /*getter methods*/
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void deposit (double amount) {
        if(amount <= 0) {
            System.out.println("Error! Try Again.");
        }else {
            this.balance += amount;
           System.out.println("New Balance = " + this.balance + " For Account Name " + this.getCustomerName());
        }

    }
    public void withdraw(double amount) {
        if(amount > balance)
        {
            System.out.println("Can't withdraw More Than"+ this.getBalance() + "Error! Try Again." + " For Account Name " + this.getCustomerName());
        }else {
            this.balance -= amount;
            System.out.println("New Balance = " + this.balance + " For Account Name " + this.getCustomerName());
        }

    }

    public void reset () {
        this.balance = 0.0;
        System.out.println("Balance Reset To Zero." + " For Account Name " + this.getCustomerName());
    }
}
