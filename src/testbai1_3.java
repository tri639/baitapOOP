public class testbai1_3 {
    public static void main(String[] args) {

        bai1_3 r1 = new bai1_3(1.2f, 3.4f);
        System.out.println(r1);
        bai1_3 r2 = new bai1_3();
        System.out.println(r2);


        r1.setLength(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("length is: " + r1.getLength());
        System.out.println("width is: " + r1.getWidth());


        System.out.printf("area is: %.2f%n", r1.getArea());
        System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
    }
}