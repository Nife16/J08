import java.util.Scanner;

public class LabTwo {
    

    public static void main(String[] args) {
        
        doubleAsWhole();

    }

    public static void circle() {
        // Write a method to prompt the user to enter the radius of the circle
        // then calculate the area and circumference of the circle.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the radius -> ");
        int radius = scanner.nextInt();

        double pi = 3.14;

        double area = (radius*radius)*pi;

        double circumference = 2*pi*radius;

        System.out.println("Area: " + area + ", Circumferencee: " +  circumference);
        
    }

    public static void triangle() {
        // Write a method to prompt the user for base-width and height of a triangle,
        // then calculate the area of the Triangle.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the base -> ");
        int base = scanner.nextInt();
        System.out.print("What is the height -> ");
        int height = scanner.nextInt();

        int area = (base*height)/2;

        System.out.println("Area -> " + area);
    }

    public static void evenOrOdd() {
        // Write a method to prompt the user for a number
        // then display check if the number is Even or Odd.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the number -> ");
        int number = scanner.nextInt();

        if(number%2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void oneDecimal() {
        // Write a method to prompt the user for an Integer 
        // then display the same value with one decimal place.
        // eg user enter "15 " result is: "You entered 15, the new value is 15.0"

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the number -> ");
        int number = scanner.nextInt();

        double oneDecimalNumber = Math.round(number*10)/10;

        System.out.println("Wan Decimuh: " +  oneDecimalNumber);
    }

    public static void letterAsASCII() {
        //  Write a method to prompt the user for 
        // a letter of the alphabet and display it's ascii value.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the number -> ");
        String stringLetter = scanner.nextLine();

        char letter = stringLetter.charAt(0);

        int ascii = (int) letter;
        System.out.println(ascii);
    }

    public static void doubleAsWhole() {
        // Write a method to prompt the user for a double
        // then display the value as a whole number.
        // eg user enter "15.8" result is: "You entered 15.8, the new value is 16". 
        // eg user enter "15.4" result is: "You entered 15.4, the new value is 15".

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the double -> ");
        double dubuhl = scanner.nextDouble();

        int wholeNumbuh = (int) Math.round(dubuhl);

        System.out.println("Whole number is -> " + wholeNumbuh);
        
    }
}
