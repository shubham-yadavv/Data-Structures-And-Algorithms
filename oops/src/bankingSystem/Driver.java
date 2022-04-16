package bankingSystem;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int choice;

        do {
            choice = menu(s);
            System.out.println();

            if(choice == 1) {
                System.out.println("acc created");
            } else if(choice == 2) {
                System.out.println("deposit made");
            } else if(choice == 3) {
                System.out.println("withdraw made");
            } else {
                System.out.println("exit!");
            }
            System.out.println();
        } while(choice != 4);

    }


    public static int menu(Scanner s) {
        System.out.println("Bank Account ");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit ");
        System.out.println("3. Withdraw ");
        System.out.println("4. Quit");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = s.nextInt();
        } while(choice < 1 || choice > 5);

        return choice;
    }

}
