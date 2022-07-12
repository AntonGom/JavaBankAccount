import java.util.Scanner;
public class Main {


    //Made by Antonio Gomez


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean repeat = false;
        boolean page1 = false;
        String password = "admin";
        String username = "admin";
        String usernameAttempt = "";
        String passwordAttempt = "";
        double balance=100;


        System.out.println("Welcome to Chase bank, what would you like to do?\n1: Log In\n2: Sign Up ");
        int ans = keyboard.nextInt();

        if (ans == 1) {
            do {


                System.out.print("PLease enter your username: ");
                usernameAttempt = keyboard.next();
                System.out.print("PLease enter your password: ");
                passwordAttempt = keyboard.next();

                if ((usernameAttempt.equals(username)) && (passwordAttempt.equals(password))) {
                    System.out.println("Logged In");
                    repeat = false;
                    page1 = false;
                    break;
                } else {
                    System.out.println("The username or password you entered is incorrect, please try again");
                    repeat = true;

                }

            } while (repeat = true);
        }
        if (ans == 2) {

            System.out.println("Thank you for choosing to sign up with us! ");
            System.out.print("Please create your username: ");
            username = keyboard.next();
            System.out.print("Please create your password: ");
            password = keyboard.next();
            System.out.print("Please enter your starting balance: $");
            balance = keyboard.nextDouble();

        }


        System.out.println("Welcome "+username+", your account balance is $"+balance+"\nWhat would you like to do today? \n1. Deposit\n2. Withdraw\n3. Exit");

        int page2Response=keyboard.nextInt();

        if (page2Response==1)
        {
            System.out.print("Enter the amount you wish to deposit: $");
            double depositAmount= keyboard.nextDouble();
            balance=balance+depositAmount;
            System.out.println("You now have a balance of $"+balance);

        }

        else if(page2Response==2)
        {
            System.out.print("Enter the amount of money you want to withdraw: $");
            double withdrawAmount = keyboard.nextDouble();
            while (withdrawAmount>balance)
            {
                System.out.println("You do not have enough funds to withdraw $"+withdrawAmount+" You only have a balance of $"+balance);
                System.out.print("Please enter a valid withdraw amount: $");
                withdrawAmount= keyboard.nextDouble();

            }

                 balance=balance-withdrawAmount;
                 System.out.println("Your new balance is now $"+balance);
                 System.out.println("Have a great day!");
        }


        else if (page2Response==3)
        {
            System.out.println("Have a good day, Goodbye!");
            System.exit(0);
        }

    }


}









