package day4b.tinhkethua.hinhchunhat;

public class hinhvuong extends hinhChuNhat{
    private double canh = 1;

    public hinhvuong()
    {}

    public hinhvuong(double canh)
    {
        super(canh,canh);
        this.canh=canh;

    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
        if(canh <= 0){
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }
    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
