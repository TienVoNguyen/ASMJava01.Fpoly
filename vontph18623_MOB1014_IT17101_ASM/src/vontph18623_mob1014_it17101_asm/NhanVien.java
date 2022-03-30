package vontph18623_mob1014_it17101_asm;

public class NhanVien {

    private String maNV, hoTen;
    private double luongCB;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, double luongCB) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCB = luongCB;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", luongCB=" + luongCB + '}';
    }

    public double getThuNhap() {
        double thunhap = luongCB;
        return thunhap;
    }

    public double thueThuNhap() {

        if (getThuNhap() < 9000000) {
            return 0;
        } else if (getThuNhap() < 15000000) {
            return (getThuNhap()-9000000) * 0.1;
        } else {
            return ((15000000-9000000) * 0.1)+((getThuNhap()-15000000) * 0.12);
        }
    }
    public void xuat(){
            System.out.printf("%-20s %-16s(HC) %20.2f %20.2f %20.2f \n"
                    ,maNV,hoTen,luongCB,getThuNhap(),thueThuNhap());
            }
}
