import java.util.Scanner;

public class LabFour {
    

    public static void main(String[] args) {
        
        findXX();



    }

    public static int getSumDigits() {
        // Given 2 non-negative ints, a and b, return their sum, 
        // so long as the sum has the same number of digits as a. 
        // If the sum has more digits than a, just return a without b.

        Scanner scr = new Scanner(System.in);

        int num1, num2;

        num1 = scr.nextInt();
        num2 = scr.nextInt();

        int sum = num1+num2;

        int lengthOfSum = Integer.toString(sum).length();
        int lengthOfNum1 = Integer.toString(num1).length();

        scr.close();

        if(lengthOfSum == lengthOfNum1) {
            return sum;
        } else {
            return num1;
        }

        

    }

    public static boolean squirrels() {
        // The squirrels in Palo Alto spend most of the day playing.
        // In particular, they play if the temperature is between 60 and 90 (inclusive).
        // Unless it is summer, then the upper limit is 100 instead of 90.
        // Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

        Scanner scr = new Scanner(System.in);

        int temperature;

        temperature = scr.nextInt();

        boolean isSummer = scr.nextBoolean();


        scr.close();

        if(isSummer) {
            if(temperature >= 60 && temperature <= 100) {
                return true;
            } else {
                return false;
            }
        } else {
            if(temperature >= 60 && temperature <= 90) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static void lotto() {
        // You have a green lottery ticket, with ints a, b, and c on it. 
        // If the numbers are all different from each other, the result is 0. 
        // If all of the numbers are the same, the result is 20. 
        // If two of the numbers are the same, the result is 10.

        Scanner scr = new Scanner(System.in);

        int num1, num2, num3;

        num1 = scr.nextInt();
        num2 = scr.nextInt();
        num3 = scr.nextInt();

        if(num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("Bummer: " + 0);
        } else if(num1 == num2 && num1 == num3 && num2 == num3) {
            System.out.println("Yatzee!!: 20");
        } else {
            System.out.println("GO again: 10");
        }
    }

    public static void findXX() {
        // Count the number of "xx" in the given string. 
        // We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


        Scanner scr = new Scanner(System.in);

        String word;

        word = scr.nextLine();

        int count = 0;

        for (int i = 0; i < word.length()-1; i++) {
            
            if(word.charAt(i) == 'x' && word.charAt(i+1) == 'x') {
                count++;
            }
        }

        System.out.println(count);
    }

}
