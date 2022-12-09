namespace FIRSTAPP;

class MetierImpl : IMetier
{
    private List<Account> accounts=new List<Account>();
    public void createAccount(Account account)
    {
        this.accounts.Add(account);
    }

    public List<Account> GetAccounts()
    {
        return accounts;
    }
}