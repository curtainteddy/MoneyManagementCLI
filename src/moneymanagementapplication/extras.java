
package moneymanagementapplication;

import java.util.Scanner;


public class extras {
    
    public static void about(String args[]){
        System.out.println("\n\n");
        System.out.println("********************************************************");
        System.out.println("|                                                      |");
        System.out.println("|    A small command line program which consists of    |");
        System.out.println("|   small yet useful and functional finance related    |");
        System.out.println("|  modules for keeping track and managing your money.  |");
        System.out.println("|                                                      |");
        System.out.println("|                                                      |");
        System.out.println("|                ~ Created by ~                        |");
        System.out.println("|                                                      |");
        System.out.println("|           hiddenhiddenhiddenhidden                   |");
        System.out.println("|           hiddenhiddenhiddenhidden                   |");
        System.out.println("|           hiddenhiddenhiddenhidden                   |");
        System.out.println("|           hiddenhiddenhiddenhidden                   |");
        System.out.println("|           hiddenhiddenhiddenhidden                   |");
        System.out.println("|                                                      |");
        System.out.println("|           ---For ITS63304 OOP Project---             |");
        System.out.println("|                                                      |");
        System.out.println("********************************************************");
        System.out.println("\n\n");
        extras.asker(args);
    }
    
    
    public static void asker(String args[]){
        System.out.println("\n|-----------------------------------------|");
        System.out.println("|              [9] Main Menu              |");
        System.out.println("|              [0] Exit                   |");
        System.out.println("|-----------------------------------------|");
        Scanner sc = new Scanner(System.in);
        int menuOption = sc.nextInt();
        
        switch (menuOption) {
            case 9 -> {
                MoneyManagementApplication.main(args);
            }
            
            case 0 -> {
                System.out.println("\n\n*****************************");
                System.out.println("Thanks for using our program.");
                System.out.println("*****************************\n\n");
                System.exit(0);
            }
            
            default -> {
                System.out.println("|           INVALID OPTION                |");
                asker(args);
                   
            }
            
        }
    }
}
