package day4.bai1_6;

public class Account {
    private String id;
    private String name;
    private int Balance=0;

    public Account() {
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        Balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return Balance;
    }

    public int credit(int amount)
    {
        return Balance=Balance+amount;
    }
    public int debit(int amount)
    {
        if(amount<=Balance)
        {
            Balance= Balance-amount;
        }else {
            System.out.println("amount exceeded balance");
        }
        return Balance;
    }
    public int transferTo(Account another,int amount)
    {
        if(this.Balance<amount)
        {
            System.out.println("amount exceeded balance");
        }else
        {
            //tru amount trong tai khoan hien tai
            this.Balance=this.Balance-amount;
            //tang amount trong tai khoan con lai
            another.Balance=another.Balance+amount;
        }
        return this.Balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
