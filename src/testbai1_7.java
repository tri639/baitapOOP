public class testbai1_7 {
    public static void main(String[] args) {
        bai1_7 d1 = new bai1_7(1, 2, 2014);
        System.out.println(d1);

        d1.setDay(9);
        d1.setMonth(12);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Day: " + d1.getDay());
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Year: " + d1.getYear());

        d1.setDate(3, 4, 2016);
        System.out.println(d1);
    }
}
