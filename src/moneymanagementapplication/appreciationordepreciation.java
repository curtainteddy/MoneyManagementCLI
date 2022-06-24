
package moneymanagementapplication;

import java.util.Scanner;


public class appreciationordepreciation {
    
    public static double finalValue;
    public static double previousValue;
    public static double rate;
    public static double timeInYears;
    public static double appreciatedAmount;
    public static double depreciatedAmount;
    
    
    public static void appreciationOrDepreciationAsker(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n    CHOOSE ONE OF THE MODULES");
        System.out.println("==================================|");
        System.out.println("|   [1] Appreciation Calculator   |");
        System.out.println("|   [2] Depreciation Calculator   |");
        System.out.println("==================================|");
        
        int menuOption = sc.nextInt();
        
        switch (menuOption) {
            case 1 -> {
                appreciationCalculator();
                extras.asker(args);
            }
            
            case 2 -> {
               depreciationCalculator();
                extras.asker(args);
            }
            
            default -> {
                System.out.println("|           INVALID OPTION                |");
                appreciationOrDepreciationAsker(args);
            }
            
        }
        
        
    }
    
    public static void appreciationCalculator(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=================================");
        System.out.println("    APPRECIATION CALCULATOR");
        System.out.println("==================================");
        
        System.out.println("Enter initial value of the asset");
        previousValue = sc.nextDouble();
        
        System.out.println("Enter rate of appreciation per annum");
        rate = sc.nextDouble();
        
        System.out.println("Enter time in years");
        timeInYears = sc.nextDouble();
        
        
        
        finalValue = previousValue * Math.pow(1 + (rate / 100), timeInYears);
        appreciatedAmount = finalValue-previousValue;
        
        System.out.println("\n\nFinal Value        : "+finalValue);
        System.out.println("Appreciated Amount :"+appreciatedAmount);
        System.out.println("----------------------------------------------");
    }
    
    
    
    public static void depreciationCalculator(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=================================");
        System.out.println("     DEPRECIATION CALCULATOR");
        System.out.println("==================================");
        
        
        System.out.println("Enter initial value of the asset");
        previousValue = sc.nextDouble();
        
        System.out.println("Enter rate of depriciation per annum");
        rate = sc.nextDouble();
        
        System.out.println("Enter time in years");
        timeInYears = sc.nextDouble();
        
        
        
        
        finalValue = previousValue * Math.pow(1 - (rate / 100), timeInYears);
        depreciatedAmount = previousValue-finalValue;
        
        System.out.println("\nFinal Value        : "+finalValue);
        System.out.println("Depreciated Amount : "+depreciatedAmount);
        System.out.println("-------------------------------------------------");
    
    }
}
