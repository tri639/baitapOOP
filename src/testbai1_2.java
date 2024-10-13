public class testbai1_2 {
    public static void main(String[] args) {

        bai1_2 c1 = new bai1_2(1.1);
        System.out.println(c1);
        bai1_2 c2 = new bai1_2();
        System.out.println(c2);


        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());


        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
