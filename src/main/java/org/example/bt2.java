package org.example;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        int size;

        Scanner sc= new Scanner(System.in);
        System.out.println("nhap kich thuc mang:");
        size =sc.nextInt();
        //khai bao mang int[]=new int[]
        htron[] arr=new htron[size];
        //nhap du lieu cho mang
        for (int i = 0; i <size ; i++) {
            System.out.println("hinh tron thu "+i);
            System.out.println("nhap ban kinh hinh tron");
            double bankinh=sc.nextDouble();

            arr[i]=new htron(bankinh);
        }
        sc.close();
        for (int i=0;i<size;i++)
        {
            System.out.println(arr[i].toString());

        }
        //In ra hình có chu vi lớn nhất

        double Max=arr[0].chuvi();
        double dtMin=arr[0].dientich();
        for(int i=0;i< arr.length;i++)
        {
            if(Max<arr[i].chuvi())
            {
                Max=arr[i].chuvi();

            }
            if(dtMin>arr[i].dientich())
            {
                dtMin=arr[i].chuvi();
            }

        }
        double tong=0;
        for (int i = 0; i < arr.length ; i++) {
            tong=tong+arr[i].chuvi();
        }
        double total=0;
        total=tong/ arr.length;
        System.out.println("hinh tron co chu vi lon nhat la la");
        System.out.println("chu vi max la " + Max);
        System.out.println("dien tich max la " + dtMin);
        System.out.println("tong trung binh " + total);

        int dem=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].chuvi()>total)
            {
                System.out.println(arr[i].chuvi());
                dem++;
            }
        }
        System.out.println("phan tu co gia tri lon hon gia tri trung binh"+dem);
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i].chuvi()>arr[j].chuvi())
                {
                    double tam=0;
                    htron h= arr[i];
                    arr[i]=arr[j];
                    arr[j]=h;

                }
            }

        }
        for (htron ht: arr
        ) {
            System.out.println(ht.getBankinh());

        }

    }
}
