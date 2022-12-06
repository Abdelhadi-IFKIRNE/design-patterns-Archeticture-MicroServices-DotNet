package metier;

import java.util.HashMap;
import java.util.Map;

public class MetierImpl implements IMetier {
    private Map<Long,Account> map=new HashMap();
    @Override
    public void addAccount(Account account) {
       map.put(account.getCode(),account);
    }

    @Override
    public void verser(Long code, double balance) {
          Account account=map.get(code);
          account.setBalance(account.getBalance()+balance);
    }

    @Override
    public void retirer(Long code, double balance) {
        Account account=map.get(code);
        account.setBalance(account.getBalance()-balance);
    }

    @Override
    public Account getAccount(Long code) {
        return map.get(code);
    }
}
