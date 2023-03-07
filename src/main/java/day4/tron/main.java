package day4.tron;

import day4.HinhTron;

public class main {
    public static void main(String[] args) {
        htron h= new htron(10,"xanh");
//        HinhTron h=new HinhTron();
//        h.setRadius(-12.0);
//        h.setColor("do");
        System.out.println("The circle has radius of "
                + h.getRadius() + " and area of " + h.dt());
    }
}
