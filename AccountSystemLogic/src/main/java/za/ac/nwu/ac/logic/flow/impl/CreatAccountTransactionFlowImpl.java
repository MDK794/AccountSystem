package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.logic.flow.CreateAccountTransactionFlow;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

@Component
public class CreatAccountTransactionFlowImpl implements CreateAccountTransactionFlow {
    private final AccountTransactionTranslator accountTransactionTranslator;
    private final FetchAccountTypeFlow fetchAccountTypeFlow;
    public CreatAccountTransactionFlowImpl(AccountTransactionTranslator accountTransactionTranslator, FetchAccountTypeFlow fetchAccountTypeFlow)
    {
        this.accountTransactionTranslator = accountTransactionTranslator;
        this.fetchAccountTypeFlow = fetchAccountTypeFlow;
    }
  /*  public AccountTransactionDto create(AccountTrasactionDto accountTrasactionDto)
    {

    }*/
}
