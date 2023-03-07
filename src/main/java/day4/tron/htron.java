package day4.tron;

public class htron {
    private double radius=1.0;
    private String color="red";

    public htron() {
    }

    public htron(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>0)
        this.radius = radius;
        else
            System.out.println("du lieu nguoi dung nhap vao k hop le");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String dt()
    {
        double dt=radius*2*Math.PI;
        return String.valueOf(dt)+" color: "+color;
    }
}
