package notes;

public class Loops {
    
    public static void main(String[] args) {
        
        /* Loops
         * There are 3 main loops, while, do while and for
         * loops are like ifs but a bit more special
         * there are parenthesis for their condition but they will run their block until the condition is false
         * the code in the parenthesis still must be evaluated to a boolean
         */

        /* while
         * if the condition is true, it will run the block statement
         * over and over until something changes it to false.
         * because of this its natural to use a counter or have somethin set your
         * condition to false so you do not have an endless loop
         */
        int count = 1;
        while(count < 10) {
            // do stuff
            count++; // this will make sure your condition will eventually be false so your loop will end
        }

        /* do while
         * the do while works similarly to the while but will run your block of code first
         * it comes in handly when you want to show something to your user before you do any logic
         */

        do {
            // this will run first, before the first check for your condition
        } while(count < 0); // even though count starts off greater than 0, it will still run once

        /* for
        * for loops are great for indexing arrays, they allow you do 
        * initlalize a variable to count with, and give the bounds of how long to loop for
        * Arrays will always have a last index of their length-1 so for loops naturally index them from  start to finish
        */
        int[] intArray = new int[10];

        //  counter    < arr.length or <= arr.length-1 so no out of bounds indexing
        for (int index = 0; index < intArray.length; index++) {
            // will run this code until i is out of bounds of the arrays indexes
        }

        /* The for each loop is a special for loop that will
         * naturally loop an array without going out of index
         * for each loops do not let you access the index value but
         * will let you get the value of each index in an array
         */
        for (int i : intArray) {
            // do stuff with each number represented as i
        }
    }
}
