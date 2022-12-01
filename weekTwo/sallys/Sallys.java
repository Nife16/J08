import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sallys {

    /*
     * You work for Sally now, sally want a program where you can
     * 1) Sign Up a User
     * 2) Purchase products
     * 3) Gain rewards for each purhase (1 point per dollar spent)
     * 
     * Application should not end until given the signal
     */

    static List<Sapp> sappList = new ArrayList<Sapp>();
    static int idCounter = 2;
    static List<Product> productList = new ArrayList<Product>();
    static Scanner scr = new Scanner(System.in);
    static Admin daBoss = new Admin(1, "Bossy McbOSSfACE", "admin");

    public static void main(String[] args) {

        Sapp mySapp1 = new Sapp(1, "bobby bouche", "water");
        Product lemonade = new Product(1, 20.00, "best damn lemonade", "best damn lemonade you ever had, guarenteed, no cap");
        Product soda = new Product(2, 10.00, "best damn soda", "best damn bubbly you ever had, guarenteed, no cap");
        sappList.add(mySapp1);
        productList.add(lemonade);
        productList.add(soda);
        Sapp loggedInSapp = null;
        
        System.out.println("Welcome to Sallys Shoppe");

        int choice;
        do {
            System.out.println("What would you like to do? ");
            System.out.println("1) Sign Up for an account ");
            System.out.println("2) Sign In ");
            System.out.println("3) View all accounts ");
            System.out.println("4) View all products ");
            System.out.println("5) View all bought products ");
            System.out.println("9) Exit for maintenance (Only sally should do this) ");
            choice = scr.nextInt();
            scr.nextLine();
            
            switch(choice) {
                case 1:
                signUp();
                break;
                case 2:
                loggedInSapp = signIn();
                break;
                case 3:
                viewAllSapps(daBoss);
                break;
                case 4:
                viewAllProducts(loggedInSapp);
                break;
                case 5:
                viewAllBoughtProducts(loggedInSapp);
                break;
            }
        } while(choice != 9);
        

    }

    public static void signUp() {

        System.out.println("What is your username: ");
        String username = scr.nextLine();
        System.out.println("What is your password: ");
        String password = scr.nextLine();

        Sapp newSapp = new Sapp(idCounter, username, password);
        idCounter++;

        sappList.add(newSapp);

        System.out.println("Thank you for signing up " + username);

    }

    public static Sapp signIn() {

        // STEP 1, GET THE USERNAME, GET THE PASSWORD

        System.out.println("What is your username: ");
        String username = scr.nextLine();
        System.out.println("What is your password: ");
        String password = scr.nextLine();

        // STEP 2, VERIFY THE COMBINATION EXISTS IN YOUR DATABASE

        for (int i = 0; i < sappList.size(); i++) {
            
            if(username.equals(sappList.get(i).getUsername()) 
            && password.equals(sappList.get(i).getPassword())) {
                return sappList.get(i);
            }

        }

        System.out.println("User not found, would you like to Sign Up or Go back");
        Integer choice = scr.nextInt();

        switch(choice) {
            case 1:
            signUp();
            break;
        }

        return null;
    }

    public static void viewAllSapps(Admin daBoss) {

        if(daBoss != null) { 

            for (int i = 0; i < sappList.size(); i++) {
                
                System.out.println(sappList.get(i).toString());

            }
        }
        System.out.println("YOU ARE NOT AUTHORIZED!!!!! BILLY");
    }
    

    public static void viewAllProducts(Sapp loggedInSapp) {

        for (int i = 0; i < productList.size(); i++) {
            
            System.out.println(productList.get(i).toString());

        }

        

        int choice;

        do{

            System.out.println("Which one would you like to purchase");
            System.out.println("1) Lemonade");
            System.out.println("2) Soda");

            choice = scr.nextInt();
            // stops your scanner from messing up
            scr.nextLine();

            if(choice == 1) {
                if(loggedInSapp != null) {
                    loggedInSapp.buyProduct(productList.get(0));
                }
                System.out.println("You bought lemonade!");
            } else if(choice == 2) {
                if(loggedInSapp != null) {
                    loggedInSapp.buyProduct(productList.get(1));
                }
                System.out.println("You bought soda!");
            } else {
                System.out.println("Give a valid input billy");
            }
        } while(choice != 1 || choice != 2);

    }

    public static void viewAllBoughtProducts(Sapp loggedInSapp) {
        
        for (int i = 0; i < loggedInSapp.getBoughtProducts().size(); i++) {
            
            System.out.println(loggedInSapp.getBoughtProducts().get(i).toString());

        }

    }

}
