

package moneymanagementapplication;

import java.util.Scanner;


public class MoneyManagementApplication {
    static int totalIncomeSourceCount; 
    static int totalExpenseSourceCount;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\n");
        System.out.println("  ______         __       __        __       __ ");
        System.out.println(" /      \\       |  \\     /  \\      |  \\     /  \\");
        System.out.println("|  $$$$$$\\      | $$\\   /  $$      | $$\\   /  $$");
        System.out.println("| $$___\\$$      | $$$\\ /  $$$      | $$$\\ /  $$$");
        System.out.println(" \\$$    \\       | $$$$\\  $$$$      | $$$$\\  $$$$");
        System.out.println(" _\\$$$$$$\\      | $$\\$$ $$ $$      | $$\\$$ $$ $$");
        System.out.println("|  \\__| $$      | $$ \\$$$| $$      | $$ \\$$$| $$");
        System.out.println(" \\$$    $$      | $$  \\$ | $$      | $$  \\$ | $$");
        System.out.println(" \\$$    $$      | $$  \\$ | $$      | $$  \\$ | $$");
        System.out.println("  \\$$$$$$        \\$$      \\$$       \\$$      \\$$");
        
        System.out.println("\n            ~ SMART MONEY MANAGER ~ \n");
        
        System.out.println("|-----------------------------------------|");
        System.out.println("|     CHOOSE A PROGRAM MODULE TO RUN      |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|  [1] Income & Expense Analyzer          |");
        System.out.println("|  [2] Net Worth Calculator               |");
        System.out.println("|  [3] Simple Interest Calculator         |");
        System.out.println("|  [4] Compound Interest Calculator       |");
        System.out.println("|  [5] Appreciation/Depriciation Analyzer |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|              [9] About                  |");
        System.out.println("|              [0] Exit                   |");
        System.out.println("|-----------------------------------------|");
        
        
        int mainMenuOption = sc.nextInt();
        switch (mainMenuOption) {
            case 1 -> {
                incomeExpenseAnalyzer();
                extras.asker(args);
            }
            
            case 2 -> {
                SavingsOrDebts.networthcalculator();
                extras.asker(args);
            }
            
            case 3 -> {
                interestCalculator.simpleinterestcalculator();
                extras.asker(args);
            }
            
            case 4 -> {
                interestCalculator.compoundinterestcalculator();
                extras.asker(args);
            }
            
            case 5 -> {
                appreciationordepreciation.appreciationOrDepreciationAsker(args);
                extras.asker(args);
            }
            
            case 9 -> {
                extras.about(args);
                extras.asker(args);
            }
            
            case 0 -> {
                System.out.println("\n\n*****************************");
                System.out.println("Thanks for using our program.");
                System.out.println("*****************************\n\n");
                System.exit(0);
            }
            
            default -> {
                
                System.out.println("\n\n*******************************************");
                System.out.println("|           INVALID OPTION                |");
                System.out.println("*******************************************");
                main(args);
                   
            }
        }
        
    }
    
    
    public static void incomeExpenseAnalyzer(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n====================================================");
        System.out.println("            INCOME AND EXPENSE ANALYZER");
        System.out.println("====================================================");
        System.out.println("\nEnter the number of your income sources monthly :");
        System.out.println("---------------------------------------------------");
        totalIncomeSourceCount = sc.nextInt();  
        
        if (totalIncomeSourceCount==0){
            System.out.println("You have to enter at least 1 income source");
            
        }
        
        String[] incomeSourceName = new String[totalIncomeSourceCount];
        double[] incomeMoney      = new double[totalIncomeSourceCount];  
        
        // Asks income source names with their worth
        for (int i = 0; i <= totalIncomeSourceCount-1; i++) {
            sc.nextLine();
            
            int p = i+1;
            
            System.out.println("\nIncome Source Name ["+p+"]");
            incomeSourceName[i] = sc.nextLine();
            
            System.out.println("Income source worth "+"["+p+"]");
            incomeMoney[i] = sc.nextDouble();
        }
        
        

        System.out.println("\nEnter the number of your expense sources monthly:");
        System.out.println("------------------------------------------------");
        totalExpenseSourceCount = sc.nextInt();
        
        String[] expenseSourceName = new String[totalExpenseSourceCount];
        double[] expenseMoney      = new double[totalExpenseSourceCount];
        
        //Asks expense source names with their worth
        for (int i = 0; i <= totalExpenseSourceCount-1; i++) {
            sc.nextLine();

            int p = i+1;
            
            System.out.println("\nExpense Source Name ["+p+"]");
            expenseSourceName[i] = sc.nextLine();
            
            System.out.println("Expense source worth "+"["+p+"]");
            expenseMoney[i] = sc.nextDouble();   
        }
        
        
        // prints invidual sources along with their worth
        System.out.println("\n\n_________________________________________________________");
        System.out.println("Monthly Income");           
        System.out.println("--------------"); 
        for (int i = 0; i <= totalIncomeSourceCount-1; i++){
            System.out.println(incomeSourceName[i]+" :"+" "+incomeMoney[i]);
        }
        
        
        // prints invidual sources along with their worth
        System.out.println("\nMonthly Expense");     // print individual sources and show
        System.out.println("----------------");
        for (int i = 0; i <= totalExpenseSourceCount-1; i++){
            System.out.println(expenseSourceName[i]+" :"+" "+expenseMoney[i]);    
        }
        
        // sends individual source worth to another method for total sum
        for (int i = 0; i <= totalIncomeSourceCount-1; i++){     
        SavingsOrDebts.findmonthlyincome(incomeMoney[i]);
        }
        
        // sends individual source worth to another method for total sum
        for (int i = 0; i <= totalExpenseSourceCount-1; i++){       
        SavingsOrDebts.findmonthlyexpense(expenseMoney[i]);
        }

        //Find if which of totalincome and totalexpense is higher
        SavingsOrDebts.findsavingsordebts();
        
        
        
    
    }
}
