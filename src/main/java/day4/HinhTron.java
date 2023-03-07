package day4;

public class HinhTron {
    private double banKinh=1;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh>0)
            this.banKinh = banKinh;
        else
            System.out.println("ban kinh khong hop le");
    }

    public double chuVi()
    {
        return Math.PI*2;
    }
    public double dienTich()
    {
        return Math.PI*2;
    }
}
