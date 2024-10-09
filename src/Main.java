import java.util.Scanner;

public class Main {

    static class ATM {
        private int balance;
        private final int PIN = 9898;
        private Scanner sc;

        public ATM() {
            sc = new Scanner(System.in);
            System.out.println("Enter PIN:");
            int enteredPIN = sc.nextInt();

            if (enteredPIN == PIN) {
                while (true) {
                    System.out.println("Enter The Option");
                    System.out.println("1. Withdraw Money");
                    System.out.println("2. Check bank balance");
                    System.out.println("3. Add Amount");
                    System.out.println("4. Exit");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            withdraw();
                            break;
                        case 2:
                            check();
                            break;
                        case 3:
                            add();
                            break;
                        case 4:
                            return; // Exit the constructor and terminate the program
                        default:
                            System.out.println("Invalid Option. Please enter a valid option.");
                            break;
                    }
                }
            } else {
                System.out.println("Invalid PIN. Exiting...");
            }
        }

        public void withdraw() {
            System.out.println("Enter amount to be withdrawn:");
            int am = sc.nextInt();
            if (am <= balance) {
                balance -= am;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }

        public void check() {
            System.out.println("Total Balance: " + balance);
        }

        public void add() {
            System.out.println("Enter amount to add:");
            int s = sc.nextInt();
            balance += s;
            System.out.println("Amount added successfully. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        ATM a = new ATM();
    }
}
