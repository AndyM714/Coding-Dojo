
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(7500, 45000);

        bankAccount1.addCheckingBalance(350);
        System.out.printf("Checking Balance: %.2f%n", bankAccount1.getCheckingBalance());

        bankAccount1.withdrawalBalance(10000);
        System.out.printf("Current Balance: %.2f%n", bankAccount1.getCheckingBalance());

        bankAccount1.displayAllBalances();
        System.out.printf("Amount for all account balances: %.2f%n", bankAccount1.displayAllBalances());

        BankAccount.totalAccounts();
    }
}