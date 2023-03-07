package day4b.tinhkethua.hinhchunhat;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        hinhChuNhat hcn = new hinhChuNhat();
        hcn.setChieuDai(4);
        System.out.println(hcn);

        hinhvuong hv = new hinhvuong();
        hv.setCanh(5);

        hv.setChieuRong(10);
        hv.setChieuDai(8);

        System.out.println(hv);
    }
}
