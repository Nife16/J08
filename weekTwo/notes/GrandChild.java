package notes;

public class GrandChild  extends Child {

    private Integer bank;
    
    public GrandChild(Integer bank){
        super(bank);
        this.bank = bank;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }
    
}
