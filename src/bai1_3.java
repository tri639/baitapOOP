public class bai1_3 {
    private float length;
    private float width;

    public bai1_3() {
        length = 1.0f;
        width = 1.0f;
    }
    public bai1_3(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return (length + width) * 2;
    }
    public String toString() {
        return "bai1_3[length= " + length + ", width= " + width + "]";
    }

}
