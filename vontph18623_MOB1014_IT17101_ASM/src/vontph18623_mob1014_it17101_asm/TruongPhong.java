package vontph18623_mob1014_it17101_asm;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(double trachNhiem, String maNV, String hoTen, double luongCB) {
        
        super(maNV,hoTen,luongCB);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    @Override
    public double getThuNhap() {
        double thunhap = super.getLuongCB() + trachNhiem;
        return thunhap;
    }
     @Override
    public void xuat(){
            System.out.printf("%-20s %-16s(TP) %20.2f %20.2f %20.2f \n"
                    ,super.getMaNV(),super.getHoTen(),super.getLuongCB(),getThuNhap(),thueThuNhap());
            }
}
