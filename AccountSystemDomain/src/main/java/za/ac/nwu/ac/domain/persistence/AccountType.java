package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DEMO_ACCOUNT_TYPE", schema = "MORNE")
public class AccountType implements Serializable {

    private static final long serialVersionUID = 2087455355257716368L;



    private Long accountTypeId;
    private Long mnemonic;
    private Long accountTypeName;
    private LocalDate creationDate;
    private Set<AccountTransaction> accountTransactions;

    public AccountType() {
    }
    public AccountType(Long accountTypeId, Long mnemonic, Long accountTypeName, LocalDate creationDate) {
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;

    }
    @Id
    @SequenceGenerator(name = "MORNE_GENERIC_SEQ", sequenceName = "MORNE.MORNE_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MORNE_GENERIC_SEQ")
    @Column(name = "ACCOUNT_TYPE_ID")
    public Long getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Long accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Column(name = "MNEMONIC")
    public Long getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(Long mnemonic) {
        this.mnemonic = mnemonic;
    }

    @Column(name = "ACCOUNT_TYPE_NAME")
    public Long getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(Long accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    @Column(name = "CREATION_DATE")
    public LocalDate getCreationDate() {
        return creationDate;
    }

    @OneToMany(targetEntity = AccountTransaction.class, fetch = FetchType.LAZY, mappedBy = "accountType", orphanRemoval = true, cascade = CascadeType.PERSIST)
    public Set<AccountTransaction> getAccountTransactions(){
        return accountTransactions;
    }
    public void setAccountTransactions(Set<AccountTransaction> accountTransactions){
        this.accountTransactions = accountTransactions;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountType)) return false;
        AccountType that = (AccountType) o;
        return Objects.equals(getAccountTypeId(), that.getAccountTypeId()) && Objects.equals(getMnemonic(), that.getMnemonic()) && Objects.equals(getAccountTypeName(), that.getAccountTypeName()) && Objects.equals(getCreationDate(), that.getCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountTypeId(), getMnemonic(), getAccountTypeName(), getCreationDate());
    }

    @Override
    public String toString() {

        return "AccountType{" +
                "accountTypeId=" + accountTypeId +
                ", mnemonic=" + mnemonic +
                ", accountTypeName=" + accountTypeName +
                ", creationDate=" + creationDate +
                '}';
    }
}
