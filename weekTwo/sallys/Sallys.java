import java.util.List;
import java.util.Scanner;

public class Sallys {
    

    List<Person> phoneBook = new ArrayList<Person>();

    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.getPhoneBook().add

        System.out.println("Welcome to Sallys Lemonade Stand!!! Buy somthin!");


        Scanner scr = new Scanner(System.in);
        
        Product lemonade = new Product(8.00, "Sunshine Lemonade", "So good make you wanna slap yo mamma!");
        Product sallysPop = new Product();


        lemonade.getNumList().add(10);

        sallysPop.setPrice(5.50);
        
        System.out.println(sallysPop.toString());

        System.out.print("What is the price for the pop");
        Double someDuble = scr.nextDouble();
        scr.nextLine();
        System.out.print("What is the name for the pop");
        String name = scr.nextLine();
        System.out.print("What is the description for the pop");
        String descrip = scr.nextLine();
        sallysPop.setName(name);
        sallysPop.setPrice(someDuble);
        sallysPop.setDescription(descrip);

        System.out.println(lemonade.toString());
        System.out.println(sallysPop.toString());


        
         

    }


    public void doStuff() {

    }

    public void doStuff(int num) {

    }

}
