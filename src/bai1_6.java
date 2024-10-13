public class bai1_6 {
    private String id;
    private String name;
    private int balance = 0;

    public bai1_6(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public bai1_6(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(bai1_6 another, int amount) {
        if (amount <= balance) {
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
       public String toString() {
           return "Account[id= " + id + ", name= " + name + ", balance= " + balance + "]";
        }
    }



