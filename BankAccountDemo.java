import java.util.Scanner;

/**
 * A savings bank account that uses classes in order to handle the deposits, withdrawls, calculations, and options of whether
 * to use whole dollars or to include cents
 * 
 * @author Jacob Ricketts
 * @version 1.0
 * @since 10/18/2026
 */
public class BankAccountDemo
{
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int response;
        System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
        response = keyboard.nextInt();
        if ((response != 1) && (response != 2)) {
            System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
            response = keyboard.nextInt(); }
        if (response == 1) {
                useWholeDollarMode();
        }
        if (response == 2) {
                useCurrencyMode();
        }
        
        
    //Create necessary code that forces a 1 or 2 input
    //if user selects 1, call useWholeDollarMode()
    //else call useCurrencyMode()
    }

    //used for menu option 1
    /**
     * useWholeDollarMode asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useWholeDollarMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  //creates new BankAccount object to use BankAccount methods
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    } //end useWholeDollarMode()

    //used for menu option 2
    /**
     * useCurrencyMode asks the user for the starting balance, the interest, and the number of months to
     * process.  A BankAccount object is created with balance and interest rates as args.
     * A loop runs based on number of months to process.  For each month deposits, withdraws,
     * and interest rate is calculated.  After the loop processes, ending balance, total deposits,
     * total withdraws, and total interest is displayed.  
     */
    public static void useCurrencyMode(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");   //formatting
        BankAccount bankAccount = new BankAccount(balance, intRate);  //creates new BankAccount object to use BankAccount methods
        for(int i=1;i<=counter;i++){
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f",bankAccount.getBalance()); 
        System.out.printf("\nTotal deposits: $%,.2f",bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f",bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f",bankAccount.getInterest());
    }//end useCurrencyMode()

}//end class
