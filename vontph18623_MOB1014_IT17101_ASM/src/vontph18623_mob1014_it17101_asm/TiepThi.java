package vontph18623_mob1014_it17101_asm;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hoaHong;

    public TiepThi() {
    }

    public TiepThi(double doanhSo, double hoaHong, String maNV, String hoTen, double luongCB) {
        super(maNV,hoTen,luongCB);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        double thuNhap = super.getLuongCB() + hoaHong * doanhSo;
        return thuNhap;
    }
    @Override
    public void xuat(){
            System.out.printf("%-20s %-16s(TT) %20.2f %20.2f %20.2f \n"
                    ,super.getMaNV(),super.getHoTen(),super.getLuongCB(),getThuNhap(),thueThuNhap());
            }
}
