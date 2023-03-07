package day4b.tinhkethua.bai4;

public class Cylinder extends  Circle{
    private double height;

    public Cylinder() {
        super();        // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super();        // call superclass no-arg constructor Circle()
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    public Cylinder(double radius,double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return getArea()*height;
    }
}
