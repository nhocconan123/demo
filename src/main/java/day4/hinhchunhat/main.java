package day4.hinhchunhat;

import day4.HinhTron;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hinhchunhat[] arr=new hinhchunhat[2];

        for(int i=0;i<2;i++)
        {
            System.out.println("hinh chu nhat thu"+i);
            System.out.println("chieu dai: ");
            double chieudai=sc.nextDouble();
            System.out.println("chieu rong");
            double chieurong=sc.nextDouble();
            arr[i]=new hinhchunhat(chieudai,chieurong);

        }
        sc.close();
        for (hinhchunhat ht : arr) {
            System.out.println(ht.chuVi());
            System.out.println(ht.dienTich());
        }


    }
}
