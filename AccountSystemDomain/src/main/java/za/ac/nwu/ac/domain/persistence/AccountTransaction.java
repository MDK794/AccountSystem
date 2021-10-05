package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "MORNE")
public class AccountTransaction implements Serializable {
    private static final long serialVersionUID = -7567273665973956818L;

    private Long transactionId;
    private AccountType accountType;
    private Long memberId;
    private Long amount;
    private LocalDate transactionDate;

    public AccountTransaction(){
    }
    public AccountTransaction(Long transactionId, AccountType accountType, Long amount, LocalDate transactionDate)
    {
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.memberId = memberId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }



    @Id
    @SequenceGenerator(name = "MORNE_GENERIC_SEQ", sequenceName = "MORNE.MORNE_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MORNE_GENERIC_SEQ")

    @Column(name = "TX_ID")
    public Long getTransactionId() {
        return transactionId;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public AccountType getAccountType() {
        return accountType;
    }

    @Column(name = "MEMBER_ID")
    public Long getMemberId() {
        return memberId;
    }


    @Column(name = "AMOUNT")
    public Long getAmount() {
        return amount;
    }

    @Column(name = "TX_DATE")
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountTransaction)) return false;
        AccountTransaction that = (AccountTransaction) o;
        return Objects.equals(getTransactionId(), that.getTransactionId()) && Objects.equals(getAccountType(), that.getAccountType()) && Objects.equals(getMemberId(), that.getMemberId()) && Objects.equals(getAmount(), that.getAmount()) && Objects.equals(getTransactionDate(), that.getTransactionDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTransactionId(), getAccountType(), getMemberId(), getAmount(), getTransactionDate());
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountType=" + accountType +
                ", memberId=" + memberId +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
