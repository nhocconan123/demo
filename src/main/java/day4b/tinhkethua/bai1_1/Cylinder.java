package day4b.tinhkethua.bai1_1;

public class Cylinder {
    private double height=1;
    private final Circle circle;

    public Cylinder() {
        circle=new Circle();
    }

    public Cylinder(double height, Circle circle) {
        this.height = height;
        this.circle = circle;
    }

    public Cylinder(double height,double radius) {
        this.height = height;
        this.circle = new Circle(radius);
    }
    public Cylinder(double height, double radius, String color){
        if(height <= 0){
            throw new RuntimeException("Error");
        }
        this.height = height;
        this.circle = new Circle(radius, color);
    }
}
