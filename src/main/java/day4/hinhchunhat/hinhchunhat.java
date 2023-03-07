package day4.hinhchunhat;

public class hinhchunhat {
    private double chieuDai=1;
    private double chieuRong=1;

    //tao construter
    public hinhchunhat() {
    }

    public hinhchunhat(double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Cạnh phải là số dương");
            System.out.println("Kích thước mặc định 1x1");
        }else {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;}
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if (chieuDai>0)
        {
            this.chieuDai = chieuDai;
        }else
        System.out.println("chieu dai khong hop le");
    }


    public void setChieuRong(double chieuRong) {
        if(chieuRong>0)
        this.chieuRong = chieuRong;
        else
            System.out.println("chieu rong khong hop le");
    }
    public double chuVi()
    {
        return (chieuDai+chieuRong)*2;
    }
    public double dienTich()
    {
        return chieuRong*chieuDai;
    }

    @Override
    public String toString() {
        return "hinhchunhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
