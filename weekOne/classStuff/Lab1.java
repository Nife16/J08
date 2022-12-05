package classStuff;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        // middle3(42,7,6);
        // xor(true, false);
        // isFactor(3, 43);

        Scanner scr = new Scanner(System.in);
        //
        // System.out.println("Hi mom, enter in a random number to see if it is prime:
        // ");
        //
        // int userInput = scr.nextInt();
        //
        //
        // isFactor(userInput);

        // findDupesHarder("atyuiohjkla,./");



        int dayOfWeek = scr.nextInt();


        if(dayOfWeek == 1) {
            System.out.println("SUNDAY");
        }
        switch(dayOfWeek) {
            case 1:
            System.out.println("SUNDAY");
            break;
            case 2:
            System.out.println("monday");
            break;
            default:
            System.out.println("GO AWAY BILLY");
        }
        

        scr.close();

    }

    public static void findDupesHarder(String string) {

        String dupes = "";

        for (int i = 0; i < string.length() - 1; i++) {

            for (int j = i + 1; j < string.length(); j++) {

                if (string.charAt(i) == string.charAt(j)) {

                    dupes = dupes.concat(Character.toString(string.charAt(j)));
                    break;

                }

            }

        }

    }

    public static boolean isPrime(int userInput) {

        for (int index = 2; index < userInput; index++) {

            if (isFactor(index, userInput)) {
                System.out.println("NOT PRIME");
                return false;
            }
        }
        System.out.println("PRIME");
        return true;

    }

    public static void isPerfect(int userInput) {

        int totalOfFactors = 0;
        for (int i = 1; i < userInput; i++) {

            if (isFactor(i, userInput)) {

                totalOfFactors += i;
            }
        }

        if (totalOfFactors == userInput) {
            System.out.println("isPerfect");
        } else {
            System.out.println("not perfect");
        }

    }

    public static boolean isFactor(int denomenator, int numerator) {

        if (numerator % denomenator == 0) {
            System.out.println("Is a factor, True");
            return true;
        } else {
            System.out.println("IS NOT!!!!!, FALSE!!!!");
            return false;
        }

    }

    public static void xor(boolean bool1, boolean bool2) {

        if (bool1 ^ bool2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void middle3(int num1, int num2, int num3) {

        int total = num1 + num2 + num3;

        int maxNum = maxNumber(num1, num2, num3);
        int minNum = minNumber(num1, num2, num3);

        System.out.println("Middle Number: " + (total - maxNum - minNum));

    }

    public static int minNumber(int num1, int num2, int num3) {

        int minNum;

        if (num1 < num2 && num1 < num3) {
            minNum = num1;
        } else if (num2 < num1 && num2 < num3) {
            minNum = num2;
        } else {
            minNum = num3;
        }

        System.out.println("Min Number: " + minNum);
        return minNum;
    }

    public static int maxNumber(int num1, int num2, int num3) {

        int maxNum;

        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else {
            maxNum = num3;
        }

        System.out.println("Max Number: " + maxNum);
        return maxNum;

    }

}
