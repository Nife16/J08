package notes;

public class Child extends Parent {

    private Integer bank;
    
    public Child(Integer bank){
        super(bank);
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }


    
}
