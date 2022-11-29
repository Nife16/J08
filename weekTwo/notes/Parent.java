package notes;

public class Parent {

    private static Integer bank;


    public Parent(Integer bank) {
        this.bank = bank;
        System.out.println("Parent constructor");
    }


    public Integer getBank() {
        return bank;
    }


    public void setBank(Integer bank) {
        Parent.bank = bank;
    }


    @Override
    public String toString() {
        return "Parent []" + this.bank;
    }

    
    
}
