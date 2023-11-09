package JavaProgrammingLAB.LAB7;

/*
|----------------------------------|
|DATE: week 11 | 2023 Nov 9 | LAB 7|
|----------------------------------|
*/

public class BankTester {
    //long accountNumber, long balance, String customerName
    public void Main() {
        BankAccount account1 = new BankAccount(10203040, 1000, "Tariq");
        account1.deposit(1000);
        account1.withdraw(500); //1500
        account1.reset(); //0

        BankAccount account2 = new BankAccount();
        account2.setCustomerName("Mohammed");
        account2.setAccountNumber(10203050);
        account2.setBalance(700);
        account2.deposit(1000);
        account2.withdraw(200);

        BankAccount account3 = new BankAccount(10203060, 5000, "Omer");
        account3.deposit(1000);
        account3.setCustomerName("Amar");

        System.out.println("Account Number: " + account1.getAccountNumber()+ ", " +
                            "Balance: " +       account1.getBalance() + ", " +
                            "Customer Name: " + account1.getCustomerName());

        System.out.println("Account Number: " +account2.getAccountNumber()+ ", " +
                           "Balance: " +       account2.getBalance() + ", " +
                           "Customer Name: " + account2.getCustomerName());

        System.out.println("Account Number: " + account3.getAccountNumber()+ ", " +
                            "Balance: " +       account3.getBalance() + ", " +
                            "Customer Name: " + account3.getCustomerName());

    }
}
