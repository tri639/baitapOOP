public class bai1_1 {
    private double radius;
    private String color;

    public bai1_1() {
        radius = 1.0;
        color = "red";
    }
    public bai1_1(double r) {
        radius = r;
        color = "red";
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
