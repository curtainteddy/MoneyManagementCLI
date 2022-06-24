
package moneymanagementapplication;

import java.util.Scanner;

public class interestCalculator {
    
    static double principal;
    static double time;
    static double rate;
    static double compoundcount;
    static double simpleinterest;
    static double compoundinterest;
    
    public static void simpleinterestcalculator(){
    Scanner sc = new Scanner(System.in);
        
        System.out.println("\n==================================");
        System.out.println("     SIMPLE INTEREST CALCULATOR");
        System.out.println("===================================");
    
        System.out.println("\nEnter principal amount");
        principal = sc.nextDouble();
        
        System.out.println("Enter rate in percentage");
        rate = sc.nextDouble();
        
        System.out.println("Enter time in years");
        time = sc.nextDouble(); 
        
        simpleinterest = (principal*time*rate)/100;
        System.out.println("\n\nSimple Interest : "+simpleinterest);
        System.out.println("----------------------------------------------");
    }
    
    public static void compoundinterestcalculator(){
    Scanner sc = new Scanner(System.in);
        
        System.out.println("\n=====================================");
        System.out.println("     COMPOUND INTEREST CALCULATOR");
        System.out.println("======================================");
    
        System.out.println("\nEnter principal amount");
        principal = sc.nextDouble();
        
        System.out.println("Enter rate in percentage");
        rate = sc.nextDouble();
        
        System.out.println("Enter time in years");
        time = sc.nextDouble(); 
        
        System.out.println("Enter number of times the interest is compounded per year");
        compoundcount = sc.nextDouble(); 
        
        compoundinterest = principal * Math.pow(1 + (rate / 100), compoundcount * time)-principal;
        System.out.println("\n\nCompound Interest : "+compoundinterest);
        System.out.println("--------------------------------------------------");
    }
 
    
    

}
