
package moneymanagementapplication;

import java.util.Scanner;


public class SavingsOrDebts {
    
    public static double totalIncome;
    public static double totalExpense;
    public static double savings;
    public static double debts;
    public static double totalNetWorth;
    public static double currentMoney; 
    public static double moneyToGive;
    public static double moneyToRecieve;
    
    // Takes individual income amounts and calculates total sum
    public static void findmonthlyincome(double incomeamount) {
        totalIncome = totalIncome+incomeamount;
    }
    
    
    // Takes individual expense amounts and calculates total sum
    public static void findmonthlyexpense(double expenseamount) {
        totalExpense = totalExpense+expenseamount;
    }
    
    
    // Finds if totalexpense greater or totalincome 
    // And finds if the user has savings or debts
    public static void findsavingsordebts() {
        
        System.out.println("\n_______________________________");
        System.out.println("Total Income  : "+totalIncome);
        System.out.println("Total Expense : "+totalExpense);
        System.out.println("________________________________");
        if (totalIncome > totalExpense){
            savings = totalIncome-totalExpense;
            System.out.println("Your savings :"+ savings);
        }
        
        else if (totalExpense > totalIncome){
            debts = totalExpense-totalIncome;
            System.out.println("Your debts :"+ debts);
        }
        
        else{
            System.out.println("Your total income and total expense is exactly same");
        }
        System.out.println("_________________________________________________________\n\n");
    }
    
    
    public static void networthcalculator(){
        
        Scanner input = new Scanner(System.in);

        System.out.println("\n\n========================");
        System.out.println("  NET WORTH CALCULATOR");
        System.out.println("========================");
        System.out.println("Enter your current money :");
        currentMoney = input.nextDouble();


        System.out.println("Enter amount of money you're liable to give :");
        moneyToGive = input.nextDouble();


        System.out.println("Enter amount of money to receive :");
        moneyToRecieve = input.nextDouble();
        
        totalNetWorth = currentMoney+moneyToRecieve-moneyToGive;
        System.out.println("\nTotal Net Worth : "+totalNetWorth);
        System.out.println("=====================================\n\n");
    }
    
    
}

