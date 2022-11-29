package notes;

public class DataTypes {

    public static void main(String[] args) {
        

        // This file will go through each data type you can have in java

        /* int
         * int's are whole numbers
         * they can store numbers from -2147483647 to 2147483647
         * most practical use of non decimal numbers when writing code
         */

         int myInt = 2147483647;

        /* double
         * doubles's are decimal numbers
         * they can store numbers from -2147483647 to 2147483647 like int,
         * but also keep track of significant figures up to 16.
         * most practical use of decimal numbers when writing code
         */

        double myDuhble = .9999999999999999;

        /* boolean
         * booleans are either true or false
         * they are used with conditionals like if statements and while loops often
         * their purpose it to control the flow of your program.
         */

        boolean bool = true; // or can be false

        /* char
         * a char is short for character, char's are a single letter or symbol
         * char's use single quotes: 'a', not to be confused with double quotes ("") from strings
         * char's can never be more than 1 character long,  and can not be empty, has to be exactly 1 char, even empty space
         * every letter on the keyboard has a number value, so sometimes char's can be used as a number
         */

        char letter = 'l';

        /* Strings
         * Strings are a collection of characters to make up a word or phrase or longer.
         * Strings are surrounded by double quotes: "the quick brown fox"
         * Strings are a special datatype used for char arrays
         */

         String myString = "This is an example of a string";

        /* Arrays
         * Arrays are a collection of any datatype (int, long, String, boolean, etc)
         * Instead of having to make 50 variables of numbers, you can store 50 numbers in 1 variable array
         * Arrays are pass by reference, so every array has its own memory space allocated on initialization
         */
        //Declaring an array
        String[] myStringArray;

        //Initializing an array, *** YOU MUST GIVE AN ARRAY ITS SIZE UPON INITIALIZATION ***
        myStringArray = new String[10];
        //All the values of an array are default to 0 for numbers, "" for Strings, ' ' for chars

        // Arrays can be hard coded with values like such
        int[] numArray = {1,2,3,4,5,6}; 

    }
    
}
