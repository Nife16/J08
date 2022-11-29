package notes;

/* Classes are the bones of every program, you will have one class that has your main file,
 * but there will be many other classes you will need to make to make a full fledged program work
 * Classes are always denoted with a capital first letter, nothing other than a class Type should do so
 * The classes you will make should be named what they are, if its a dog your making call the class Dog
 */
public class Classes {
    
    public static void main(String[] args) {
        
    }
}

/* I am going to make some more classes here but Classes should always be made in their own seperate file
 * You may only have 1 class per file so my code here will have red lines in the IDE
 * 
 * 
 * Below is the Dog class, this is a class you would usually called a Domain Class
 * Domain classes make and describe the objects you will be  using in your program
 * Objects are when you create a variable with a class
 * ie: Dog goodBoy = new Dog(); goodBoy is the object of type Dog
 * Just like arrays, every object has its own identity and signature,
 * if you try to println them you will get mumbo jumbo, naturally if you want to see the data
 * in your object, create a toString() method like shown below and it will sout your data for that
 * particular object
 * Java Objects are ALWAYS pass by reference. Generally you won't set one object equal to another
 * Nor would you compare objects for equivalence, you should compare their variables instead.
 */

 public class Dog {
    
    /* The variables of Domain classes will describe what the class is
     * Variables here will be adjectives
     * The variables will generally depend on the application your are making and what you will need for it
     */
    private String breed;
    private Integer age;
    private String name;


    /* Constructors are what you use to initially build your object 
     * They must ALWAYS be public, and never have any other identifiers other than public
     * They must also ALWAYS HAVE THE SAME NAME AS THE CLASS
     * Multiple constructors can be given to a class (method overloading)
     * The first one here will create a Dog object will none of the variables being set
     * The second will create the dog and you will pass the constructor the variable values
     * ex: Dog suchaGoodBoy = new Dog("good boy", 12, "Fido"),
     * suchaGoodBoy now has breed "good boy", age 12, and name Fido
    */
    public Dog() {}
    public Dog(String breed, Integer age, String name) {
        /* The this key word is used in your class to denote that you are talking about the classes variables
         * As you see the names in the constructor's args are the exact same as the classes variable names
         * This is ok because a classes variables should always be refered to with the this keyword while inside of that class
         * if you were in another class using the variable off an object, there is no need to use this keyword
         * it will actually break because you wouldn't be in the class to refer to its variables
         */
        this.breed = breed;
        this.name = name;
        this.age = age;
    }
    /* You should have a get and a set for every variable in your class
     * These are used to access and mutate your private class variables (encapsulation)
     * get will return you an objects value and set will change an objects value
     * Just like the constructor, setters use the this keyword to differentiate the argument from the class variable
     */
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", age=" + age + ", name=" + name + "]";
    }

 }
