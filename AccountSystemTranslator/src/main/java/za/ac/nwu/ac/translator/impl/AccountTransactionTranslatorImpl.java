package za.ac.nwu.ac.translator.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

import java.util.List;

@Component
public class AccountTransactionTranslatorImpl implements AccountTransactionTranslator {
//private AccountTransactionRepository repo;
    @Override
    public AccountTransaction save(AccountTransaction accountTransaction) {
        return null;
    }

    @Override
    public List<AccountTransaction> getAllAccountTransactions() {
        return null;
    }

    @Override
    public AccountTransaction getAccountTransactionByPk(Long TransactionId) {
        return null;
    }
}
