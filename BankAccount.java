
/**
 * Class for a bank account, to handle deposit, withdrawl, interest, and support for 
 * whole number or going to the decimals.
 *
 * @author Jacob Ricketts
 * @version 1.0
 * @since 10/18/2026
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;
    /**
     * Creates a bank account with monthly interest of 4.4% annually
     */
    public BankAccount()
    {
        // initialise instance variables
        monthlyIntRate = 0.044/12;
    }
    /**
     * Creates a bank account using whole-dollars for a balance and has an annual interest rate.
     * 
     * @param inBalance the starting account balance in whole dollars
     * @param intRate the annual interest rate
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate/100/12;
    }
    
    /**
     * Creates a bank account with support for cents and has an annual interest rate.
     * 
     * @param inBalance the starting account balance with support for cents
     * @param intRate the annual interest rate
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = intRate/100/12;
    }
    
    /**
     * Adds money to the account as a double and tracks the amount deposited
     * @param add the amount of money to be deposited and added to the balance
     */
    public void makeDeposit(double add) {
        deposit += add;
        balance += add;
    }
    
    /**
     * Adds money to the account in whole dollars and tracks the amount deposited.
     * @param add the amount of money to be added in whole dollars and added to the balance.
     */
    public void makeDeposit(int add) {
        deposit += add;
        balance += add;
    }
    
    /**
     * Withdraws money from the account, subtracts from the balance and tracks the total amount withdrawn
     * @param sub the amount of money to be withdrawn from the account balance
     */
    public void makeWithdraw(double sub) {
        withdraw += sub;
        balance -= sub;
    }
    
    /**
     * Withdraws money from the account in whole dollars, subtracts from the balance and tracks the total amount withdrawn
     * @param sub the amount of money to be withdrawn from the account balance in whole dollars
     */
    public void makeWithdraw(int sub) {
        withdraw += sub;
        balance -= sub;
    }
    
    /**
     * Calculates the interest to be added to the account, adds it to the balance and tracks the total amount of interest added over time
     * 
     */
    public void calcInterest() {
        if (balance >0) {
            double monthlyInterest = balance * monthlyIntRate;
            balance += monthlyInterest;
            interest += monthlyInterest; 
        }
    }
    
    /**
     * Returns the balance
     * 
     * @return the total balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Returns the deposit
     * 
     * @return the total deposited into the account
     */
    public double getDeposit() {
        return deposit;
    }
    
    /**
     * Returns the withdrawl
     * 
     * @return the total withdrawn by the account
     */
    public double getWithdraw() {
        return withdraw;
    }
    
    /**
     * Returns the interset
     * 
     * @return the total interest gained
     */
    public double getInterest() {
        return interest;
    }
    
    


}