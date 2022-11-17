import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice {
    
    public static void main(String[] args) {

        // Take three numbers from the user and print the greatest number.
        
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;



    }


    public static void biggestNumber(int num1, int num2, int num3) {

        if((num1 > num2) && (num1 > num3)) {
            System.out.println(num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }

    public static double inchesToMeters(int inches) {

        double meters = inches*.0254;

        return meters;
    }




    public static int findProductOfTwoNumbers(int num1, int num2) {

        return num1*num2;

    }

}
