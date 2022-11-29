package notes;

public class Conditionals {
    public static void main(String[] args) {

        /* Conditional Operators
         *  > greater than, < less than
         *  >= greater than or equal to, <= less than or equal to
         *  == equal to
         *  && (and, lets you say if both this and that are true, both must be true for condition to be true)
         *  || (or, lets you say if this or that is true, if 1 is true condition is true)
         *  ^ (xor, if one is true and one is false, its true, if they are both true or both false then its false)
         */

        boolean bool = true;
        boolean anotherBool = true;
        
        /* Conditionals help you control the flow of your program, sometimes you are
         * faced with decision to do either one thing or another, conditions solve this
        */

        /* If statments
         * You can decided wether to do something based on if something is true or false
         * the boolean condition goes inside fo your parenthesis ()
         * Whatever is inside the parens must evaulate to either true or false, so if you can set whats inside equal to a boolean it wont work
         * if the parenthesis evaluate to true, the code in the block will run, if false nothing
         */

        if(bool /* -> some condition that will be true or false, can be multiple conditions */) {

            /* The code that will run in the case of true */
        }

        // Chaining if statements, you can have multiple if's chained together to run one after another as one
        // if the first is false, then immediately it will check for the second,
        // if both are false, it will run the else statement

        if(bool) {
            /* The code that will run in the case of true */
        } else if(anotherBool) {
            /* This code that will run in the first case is false and the second if is true */
        } else {
            /* if both the above if cases are false, then the else will run in the case
             * that no other if statements are true
             */
        }

        /* Switch cases are like a special if statement
         * you give it a variable in the parenthesis
         * and it will check if that variable is equal to each case
         * basically if statements that are ==
         */
        
        int choice = 1;
        switch(choice) {
            case 1:
            //will do this case if choice == 1
            // must have a break at end of each case or it will go to the next case by default
            break;
            case 2:
            // if choice == 2, it will run your code you put here
            break;
            default:
            // in the case choice doesnt == any of the cases, it will go to this default
            // no need for a break in the default since its the last one
        }

    }
}
