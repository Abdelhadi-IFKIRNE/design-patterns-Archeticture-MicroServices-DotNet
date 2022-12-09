namespace FIRSTAPP;

class Account{
    private string id {set; get; }
    private double balance {set; get; }

    public Account(string id, double balance ){
        this.id=id;
        this.balance=balance;
    }

    public void tostring(){
        Console.WriteLine(id);
        Console.WriteLine(balance);
    }
}