package notes.Inheritance;


/* This class will function as the Parent that is going to be extended form */
public class Parent {

    private Integer bank = 1000000000;


    public Parent() {}


    public Integer getBank() {
        return bank;
    }


    public void setBank(Integer bank) {
        this.bank = bank;
    }


    @Override
    public String toString() {
        return "Parent []" + this.bank;
    }

    
    
}
