public class bai1_2 {
    private double radius;

    public bai1_2() {
        radius = 1.0;
    }
    public bai1_2(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "bai1_2[radius= " + radius + "]";
    }

}
