public class testbai1_6 {
    public static void main(String[] args) {
        bai1_6 a1 = new bai1_6("A101", "Tan Ah Teck", 88);
        System.out.println(a1);
        bai1_6 a2= new bai1_6("A102", "Kumar");
        System.out.println(a2);

        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transferTo(a2,100);
        System.out.println(a1);
        System.out.println(a2);
    }
}
