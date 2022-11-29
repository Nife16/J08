package notes;

public class Functions {
    
    /* The main
     * the main is the entry point to every java application, there is only 1 main per program
     * the main is a special function that will run your code you write in it from top to bottom
     * public - open for other files in the program to see
     * static - makes a function available on the class level
     * void - returns nothing
     */
    public static void main(String[] args) {
        
    }

    /* functions
     * everything function must start with its identifiers to show how it works
     * public or private first, to say if the function is mean to be seen in other files or not
     * static (optional) - to  say if the function is to be used as a general purpose func
     * return type - every function must say if its its going to return a value, and if so the datatype of that value
     * void (no return), or int (returns an int datatype)
     * inside the parenthesis go the arguments (if applicable) 
     * not all functions have arguments but that depends on the logic of how you make it
     */

    public static int addNumbers(int num1, int num2) {
        return num1+num2;
    }
    public static int addNumbersNoArgs() {
        int num1 = 1; // if args are not passed through, values must be gotten or given in the function
        int num2 = 3;
        return num1+num2;
    }
}
