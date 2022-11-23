import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //  Write a Java program to find a missing number in an array. 
        //assume its sorted in ascending order
        
        Scanner scanner = new Scanner(System.in);

        int[] randomArr = new int[50];
        for (int i = 0; i < args.length; i++) {
            randomArr[i] = (int)(Math.random()*randomArr.length);
        }
        
        findMissingNum(new int[]{1,4,5,6,7,8});

    }

    public static void findMissingNum(int[] numArray) {

        int lowestNumer = numArray[0];
        int secondLowestNumber = numArray[1];
        int firstIncrement = secondLowestNumber - lowestNumer;
        int secondIncr = numArray[2] - numArray[1];
        int thirdIncr = numArray[3] - numArray[2];
        int correctIncrement;

        if(firstIncrement == secondIncr) {
            correctIncrement = firstIncrement;
        } else if(secondIncr == thirdIncr) {
            correctIncrement = secondIncr;
        } else {
            correctIncrement = thirdIncr; // or the first
        }


        for (int i = 0; i < numArray.length-1; i++) {
            if(numArray[i] != numArray[i+correctIncrement]-1) {
                if(i == 0) {
                    
                    System.out.println(numArray[i] + correctIncrement);

                }
                System.out.println(numArray[i] + correctIncrement);
            }
        }

    }

}
