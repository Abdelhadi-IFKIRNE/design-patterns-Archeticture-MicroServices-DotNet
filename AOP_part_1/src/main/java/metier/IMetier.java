package metier;

public interface IMetier {
    void addAccount(Account account);
    void verser(Long code,double balance);
    void retirer(Long code,double balance);
    Account getAccount(Long code);
}
