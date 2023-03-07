package org.example;

public class htron {
    double bankinh;

    public htron(double bankinh){
        this.bankinh=bankinh;
    }
    public double chuvi()
    {
        return (bankinh*2*Math.PI);
    }
    public double dientich()
    {
        return Math.pow(bankinh,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "htron{" +
                "bankinh=" + bankinh +
                '}';
    }

    public double getBankinh() {
        return bankinh;
    }
}
