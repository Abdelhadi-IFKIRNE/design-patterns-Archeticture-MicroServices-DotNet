package metier;

public class Account {
    private Long code;
    private double balance;

    public Long getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Account{" +
                "code=" + code +
                ", balance=" + balance +
                '}';
    }

    public Account() {
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(Long code, double balance) {
        this.code = code;
        this.balance = balance;
    }
}
