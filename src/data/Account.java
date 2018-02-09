import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "holder")
    private String holder;

    @Column(name = "bank")
    private String bank;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "remarks")
    private String remarks;

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.amount, amount) == 0 &&
                Objects.equals(holder, account.holder) &&
                Objects.equals(bank, account.bank) &&
                Objects.equals(purpose, account.purpose) &&
                Objects.equals(remarks, account.remarks);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, amount, holder, bank, purpose, remarks);
    }
}
