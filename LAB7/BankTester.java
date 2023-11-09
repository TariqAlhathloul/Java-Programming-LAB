package JavaProgrammingLAB.LAB7;

/*
|----------------------------------|
|DATE: week 11 | 2023 Nov 9 | LAB 7|
|----------------------------------|
*/

public class BankTester {
    //long accountNumber, long balance, String customerName
    public void Main() {
        BankAccount account1 = new BankAccount();


        System.out.println("Account Number: " + account1.getAccountNumber()+ ", " +
                "Balance: " +       account1.getBalance() + ", " +
                "Customer Name: " + account1.getCustomerName());



        BankAccount account2 = new BankAccount(10203050,700, "Mohammed" );
        System.out.println("Account Number: " +account2.getAccountNumber()+ ", " +
                "Balance: " +       account2.getBalance() + ", " +
                "Customer Name: " + account2.getCustomerName());

       BankAccount account3 = new BankAccount(500);
       account1.deposit(1000);
        account2.deposit(1000);
        account3.deposit(1000);
        account1.withdraw(500);
        account2.withdraw(200);
        account3.setCustomerName("Hassan");

    }
}
