package partsList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ComputerPart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // было AUTO
    private int id;
    private String name;
    private int amount;
    private Boolean mustHave;

    public ComputerPart() {
    }

    public ComputerPart(String name, int amount, Boolean mustHave) {
        this.name = name;
        this.amount = amount;
        this.mustHave = mustHave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Boolean getMustHave() {
        return mustHave;
    }

    public void setMustHave(Boolean mustHave) {
        this.mustHave = mustHave;
    }
}
