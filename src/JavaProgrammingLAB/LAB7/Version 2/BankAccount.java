package org.example;

public class BankAccount {
    private int accNo;
    private double bal;
    private String custName;

    BankAccount() {
        accNo = 0;
        bal = 0;
        custName = "";
    }

    BankAccount(int a, double b, String n) {
        this.accNo = a;
        this.bal = b;
        this.custName = n;
    }

    BankAccount(double b) {
        this.accNo = 0;
        this.bal = b;
        this.custName = "";
    }

    public void print() {
        System.out.printf("%s%d\t\t%s%.2f\t\t%s%s%n", "Account Number: ", accNo, "Balance: ", bal, "Customer Name: ", custName);
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int a) {
        accNo = a;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double b) {
        bal = b;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String n) {
        custName = n;
    }

    public void withdraw(double m) {
        bal -= m;
    }

    public void deposit(double m) {
        bal += m;
    }

    public void reset() {
        bal = 0;
    }
}

class tester {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.print();
        BankAccount acc2 = new BankAccount(102, 10000, "John Smith");
        acc2.print();
        BankAccount acc3 = new BankAccount(10000);
        acc3.print();
        acc1.deposit(1000);
        acc2.deposit(1000);
        acc3.deposit(1000);
        acc1.withdraw(500);
        acc2.withdraw(200);
        acc3.setCustName("Jane Smith");
    }
}