package day4b.tinhkethua.hinhchunhat;

public class hinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public hinhChuNhat() {
    }

    public hinhChuNhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    @Override
    public String toString() {
        return "HinhChuNhat[" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + tinhChuVi() +
                ", dienTich=" + tinhDienTich() +
                ']';
    }
}
