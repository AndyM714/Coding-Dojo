
public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;

    private static int totalAccounts = 0;

    private static double bankAccountsTotal = 0;

    public BankAccount(double checkingBalance, double savingsBalance) {

        totalAccounts++;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;

        bankAccountsTotal += checkingBalance + savingsBalance;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public double addCheckingBalance(double addCheckingBalance) {
        this.checkingBalance += addCheckingBalance;
        bankAccountsTotal += addCheckingBalance;
        return this.checkingBalance;
    }

    public double addSavingsBalance(double addSavingsBalance) {
        this.savingsBalance += addSavingsBalance;
        bankAccountsTotal += addSavingsBalance;
        return this.savingsBalance;
    }

    public void withdrawalBalance(double withdrawalAmount) {
        if (this.checkingBalance - withdrawalAmount >= 0) {
            this.checkingBalance -= withdrawalAmount;
            bankAccountsTotal -= withdrawalAmount;
        } else {
            System.out.println("Sorry, you do not have enough funds to make this withdrawal!");
        }
    }

    public double displayAllBalances() {
        double accountBalance = this.checkingBalance + this.savingsBalance;
        return accountBalance;
    }

    public static void totalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
}