package notes.Inheritance;

public class Main {
    public static void main(String[] args) {

        
        /*
         * Inheritance is when you can extend the functionality from one class to another
         * The class that is having its code extended down is called the Parent Class
         * The class gaining the functionality from the Parent is called the Child
         * 
         * The 'extends' keyword is what tells you where the inheritance is happening
         * Extends will be put on the child class and next will be the name of the parent class (shown in other files)
         */


         Parent mom = new Parent();
         Child child = new Child();
         GrandChild lilOne = new GrandChild();

         // Here child is using the method getBank that was made in Parent
         // through inheritance. Even though it doesn't have the method getBank on its own class
         // it can use the Parents method
         System.out.println(child.getBank());

        /*
         * Here you can see even a child of the child class can inherit and the functionality
         * of the Parent class is passed down through the Child to the GrandChild class
         * This is called multilevel Inheritance
         */
         System.out.println(lilOne.getBank());

    }
    
}
