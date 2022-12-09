// See https://aka.ms/new-console-template for more information
using FIRSTAPP;

Console.WriteLine("Hello, World!");
IMetier metier=new MetierImpl();

Account account=new Account("kk",8000);

Account account2=new Account("TR",8000);

Account account3=new Account("Tn",8000);

metier.createAccount(account);
metier.createAccount(account2);
metier.createAccount(account3);

List<Account> accounts=metier.GetAccounts();

accounts.ForEach(acc=>{
    acc.tostring();
});
