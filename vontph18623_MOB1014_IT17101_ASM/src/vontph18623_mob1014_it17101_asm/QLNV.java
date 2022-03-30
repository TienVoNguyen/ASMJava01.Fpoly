package vontph18623_mob1014_it17101_asm;

import java.util.ArrayList;
import java.util.Scanner;

public class QLNV {

    static Scanner sc = new Scanner(System.in);
    private static ArrayList<NhanVien> lstNV = new ArrayList<>();

    ////////////nhập
    public void nhap() {
        int i = 1;
        while (true) {
            sc = new Scanner(System.in);
            System.out.println("---------------Nhập thông tin nhân viên---------------");
            System.out.printf("Nhập mã nhân viên thứ %d: ", i);
            String maNV;
            String remaNV = "[A-Z]{2}\\d{4,6}";
        while (true) {   
            sc = new Scanner(System.in);
            maNV = sc.nextLine();
            if(maNV.matches(remaNV)){
                break;
            }else{
                System.out.println("Mã nhân viên gồm 2 kí tự đầu viết hoa và 4-6 số nguyên ngẫu nhiên. Ví dụ: PH0000");
                System.out.print("Mời bạn nhập lại mã nhân viên: ");
            }}
            System.out.printf("Nhập họ tên nhân viên có mã %s: ", maNV);
            String hoTen;
             String reTenNV = "[a-zA-Z ]+";
        while (true) {   
            sc = new Scanner(System.in);
            hoTen = sc.nextLine();
            if(hoTen.matches(reTenNV)){
                break;
            }else{
                System.out.print("Tên chỉ dùng alphabet và kí tự trắng mời nhập lại: ");
            }
        }
            System.out.printf("Nhập lương cơ bản của nhân viên %s: ", hoTen);
            double lCB;
            while (true) {
                try {
                    lCB = Double.parseDouble(sc.nextLine());
                    if (lCB > 6000000) {
                        break;
                    } else {
                        System.out.print("Lương cơ bản phải lớn hơn 6 triệu đồng: ");
                    }
                } catch (Exception e) {
                    System.out.print("Lương phải là số thực mời bạn nhập lại: ");
                }
            }
            String nhanVien;
            while (true) {
                System.out.print("Đây là nhân viên hành chính(1), nhân viên tiếp thị(2) hay trưởng phòng(3):  ");
                nhanVien = sc.nextLine();
                if (nhanVien.equalsIgnoreCase("1")) {
                    lstNV.add(new NhanVien(maNV, hoTen, lCB));
                    break;
                } else if (nhanVien.equalsIgnoreCase("2")) {
                    System.out.printf("Mời nhập doanh số của nhân viên %s: ", hoTen);
                    double doanhSo;
                    while (true) {
                        try {
                            doanhSo = Double.parseDouble(sc.nextLine());
                            if (doanhSo >= 0) {
                                break;
                            } else {
                                System.out.print("Doanh số phải lớn hơn hoặc bằng 0: ");
                            }
                        } catch (Exception e) {
                            System.out.print("Doanh số phải là số thực mời bạn nhập lại: ");
                        }
                    }
                    System.out.printf("Mời nhập hoa hồng của nhân viên %s: ", hoTen);
                    double hoaHong;
                    while (true) {
                        try {
                            hoaHong = Double.parseDouble(sc.nextLine());
                            if (hoaHong > 0) {
                                break;
                            } else {
                                System.out.print("Hoa hồng phải lớn hơn 0: ");
                            }
                        } catch (Exception e) {
                            System.out.print("Hoa hồng phải là số thực mời bạn nhập lại: ");
                        }
                    }
                    lstNV.add(new TiepThi(doanhSo, hoaHong, maNV, hoTen, lCB));
                    break;
                } else if (nhanVien.equalsIgnoreCase("3")) {
                    System.out.printf("Mời nhập Lương trách nhiệm của %s: ", hoTen);
                    double lTN;
                    while (true) {
                        try {
                            lTN = Double.parseDouble(sc.nextLine());
                            if (lTN > 0) {
                                break;
                            } else {
                                System.out.print("Lương trách nhiệm phải lớn hơn 0: ");
                            }
                        } catch (Exception e) {
                            System.out.print("Lương trách nhiệm phải là số thực mời bạn nhập lại: ");
                        }
                    }
                    lstNV.add(new TruongPhong(lTN, maNV, hoTen, lCB));
                    break;
                } else {
                    System.out.println("Nhập sai mời nhập lại");
                }
            }
            System.out.println("-----------------------------------------------------");
            System.out.print("Bạn có muốn tiếp tục nhập: Y or N? ");
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            }
            i++;
        }

    
    }
    ///////////////////////
    //////////////Xuất
    public void xuat() {
        System.out.println("Danh sách nhân viên");
        System.out.printf("%-20s %-20s %20s %20s %20s \n",
                "Mã nhân viên", "Họ Tên", "Lương cơ bản", "Thu Nhập", "Thuế Thu Nhập");
        for (NhanVien nv : lstNV) {
//            if (nv.getClass() == TruongPhong.class) {
//                TruongPhong tp = (TruongPhong) nv;
//                tp.xuat();
//            } else if (nv.getClass() == NhanVien.class) {
//                NhanVien nv1 = (NhanVien) nv;
//                nv1.xuat();
//            } else {
//                TiepThi tt = (TiepThi) nv;
//                tt.xuat();
//            }
            nv.xuat();
        }
    }

    /////////////////////////
    public void khoiTao() {
        lstNV.add(new NhanVien("PH00001", "Lu Bo", 56000000));
        lstNV.add(new NhanVien("Ph00002", "Tu Ma Y", 85000000));
        lstNV.add(new NhanVien("Ph00003", "Trieu Tu Long", 63000000));
        lstNV.add(new TiepThi(30, 2000000, "Ph00005", "Han Tuyet", 15000000));
        lstNV.add(new TiepThi(20, 2000000, "Ph00004", "Trinh Sieu", 25000000));
        lstNV.add(new TiepThi(40, 2000000, "Ph00006", "Han Tin", 35000000));
        lstNV.add(new TruongPhong(50000000, "Ph00007", "Luu Bi", 100000000));
        lstNV.add(new TruongPhong(40000000, "Ph00008", "Tao Thao", 90000000));
        lstNV.add(new TruongPhong(30000000, "Ph00009", "Ngo Quyen", 80000000));
    }

    /////////////////////
    public void timCode() {
        String maNV;       
        System.out.print("Mời nhập mã nhân viên cần tìm: ");        
         String remaNV = "[A-Z]{2}\\d{4,6}";
        while (true) {   
            sc = new Scanner(System.in);
            maNV = sc.nextLine();
            if(maNV.matches(remaNV)){
                break;
            }else{
                System.out.println("Mã nhân viên gồm 2 kí tự đầu viết hoa và 4-6 số nguyên ngẫu nhiên. Ví dụ: PH0000");
                System.out.print("Mời bạn nhập lại mã nhân viên cần tìm: ");
            }}
        ArrayList<NhanVien> lstTimCode = new ArrayList<>();
        int dem = 0;
        for (NhanVien nv : lstNV) {
            if (maNV.equalsIgnoreCase(nv.getMaNV())) {
                lstTimCode.add(nv);
                dem++;
            }
        }
        if (dem > 0) {
            System.out.printf("Danh sách nhân viên có mã %s: \n", maNV);
            System.out.printf("%-20s %-20s %20s %20s %20s \n",
                    "Mã nhân viên", "Họ Tên", "Lương cơ bản", "Thu Nhập", "Thuế Thu Nhập");
            for (NhanVien nv : lstTimCode) {
                nv.xuat();
            }
        } else {
            System.out.println("Không tìm thấy nhân viên có mã bạn nhập: "+maNV);
        }
    }
    
    ////////////////////////
    public static void xoaCode() {
        String maNV;
        sc = new Scanner(System.in);
        System.out.print("Mời nhập mã nhân viên cần xoá: ");
        String remaNV = "[A-Z]{2}\\d{4,6}";
        while (true) {   
            sc = new Scanner(System.in);
            maNV = sc.nextLine();
            if(maNV.matches(remaNV)){
                break;
            }else{
                System.out.println("Mã nhân viên gồm 2 kí tự đầu viết hoa và 4-6 số nguyên ngẫu nhiên. Ví dụ: PH0000");
                System.out.print("Mời bạn nhập lại mã nhân viên cần xoá: ");
            }}
        ArrayList<NhanVien> lstTimCode = new ArrayList<>();
        int dem = 0;
        for (NhanVien nv : lstNV) {
            if (maNV.equalsIgnoreCase(nv.getMaNV())) {
                lstTimCode.add(nv);
                dem++;
            }
        }
        if (dem > 0) {           
                lstNV.removeAll(lstTimCode);            
            System.out.printf("Đã tìm thấy và xoá %d nhân viên có mã %s  \n", dem,maNV);
        } else {
            System.out.println("Không tìm thấy mã nhân viên cần xoá: " +maNV);
        }
    }

    ///////////////////////
    public void capNhatCode() {
        String maNV;
        sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần cập nhật thông tin: ");
        String remaNV = "[A-Z]{2}\\d{4,6}";
        while (true) {   
            sc = new Scanner(System.in);
            maNV = sc.nextLine();
            if(maNV.matches(remaNV)){
                break;
            }else{
                System.out.println("Mã nhân viên gồm 2 kí tự đầu viết hoa và 4-6 số nguyên ngẫu nhiên. Ví dụ: PH0000");
                System.out.print("Mời bạn nhập lại mã nhân viên cần cập nhật: ");
            }}
        int dem = 0;
        for (int i = 0; i < lstNV.size(); i++) {
            if (maNV.equalsIgnoreCase(lstNV.get(i).getMaNV())) {
                System.out.println("Mời cập nhật thông tin nhân viên có mã: " + lstNV.get(i).getMaNV());
                System.out.printf("Nhập họ tên nhân viên có mã %s: ", lstNV.get(i).getMaNV());
                String tenNV;
                 String reTenNV = "[a-zA-Z ]+";
        while (true) {   
            sc = new Scanner(System.in);
            tenNV = sc.nextLine();
            if(tenNV.matches(reTenNV)){
                break;
            }else{
                System.out.print("Tên chỉ dùng alphabet và kí tự trắng mời nhập lại: ");
            }
        }
                System.out.printf("Nhập lương cơ bản của nhân viên %s: ", tenNV);
                double lCB;
                while (true) {
                    try {
                        lCB = Double.parseDouble(sc.nextLine());
                        if (lCB > 6000000) {
                            break;
                        } else {
                            System.out.print("Lương cơ bản phải lớn hơn 6 triệu đồng: ");
                        }
                    } catch (Exception e) {
                        System.out.print("Lương phải là số thực mời bạn nhập lại: ");
                    }
                }
                String nhanVien;
                while (true) {
                    System.out.print("Đây là nhân viên hành chính(1), nhân viên tiếp thị(2) hay trưởng phòng(3): ");
                    nhanVien = sc.nextLine();
                    if (nhanVien.equalsIgnoreCase("1")) {
                        lstNV.set(i, new NhanVien(lstNV.get(i).getMaNV(), tenNV, lCB));
                        break;
                    } else if (nhanVien.equalsIgnoreCase("2")) {
                        System.out.printf("Mời nhập doanh số của nhân viên %s: ", tenNV);
                        double doanhSo;
                        while (true) {
                            try {
                                doanhSo = Double.parseDouble(sc.nextLine());
                                if (doanhSo >= 0) {
                                    break;
                                } else {
                                    System.out.print("Doanh số phải lớn hơn hoặc bằng 0: ");
                                }
                            } catch (Exception e) {
                                System.out.print("Doanh số phải là số thực mời bạn nhập lại: ");
                            }
                        }
                        System.out.printf("Mời nhập hoa hồng của nhân viên %s: ", tenNV);
                        double hoaHong;
                        while (true) {
                            try {
                                hoaHong = Double.parseDouble(sc.nextLine());
                                if (hoaHong > 0) {
                                    break;
                                } else {
                                    System.out.print("Hoa hồng phải lớn hơn 0: ");
                                }
                            } catch (Exception e) {
                                System.out.print("Hoa hồng phải là số thực mời bạn nhập lại: ");
                            }
                        }
                        lstNV.set(i, new TiepThi(doanhSo, hoaHong, lstNV.get(i).getMaNV(), tenNV, lCB));
                        break;
                    } else if (nhanVien.equalsIgnoreCase("3")) {
                        System.out.printf("Mời nhập Lương trách nhiệm của %s ", tenNV);
                        double lTN;
                        while (true) {
                            try {
                                lTN = Double.parseDouble(sc.nextLine());
                                if (lTN > 0) {
                                    break;
                                } else {
                                    System.out.print("Lương trách nhiệm phải lớn hơn 0: ");
                                }
                            } catch (Exception e) {
                                System.out.print("Lương trách nhiệm phải là số thực mời bạn nhập lại: ");
                            }
                        }
                        lstNV.set(i, new TruongPhong(lTN, lstNV.get(i).getMaNV(), tenNV, lCB));
                        break;
                    } else {
                        System.out.println("Nhập sai mời nhập lại");
                    }
                }
                dem++;
            }
        }
        if (dem == 0) {
            System.out.println("Không tìm thấy mã nhân viên cần cập nhật: "+maNV);
        } else {
            System.out.println("Đã cập nhật " + dem + " nhân viên có mã: " + maNV);
        }
    }

    /////////////////
    //sắp xếp theo họ tên
    public void sXName() {
        lstNV.sort((b, a)
                -> {
            return b.getHoTen().compareTo(a.getHoTen());
        }
        );
        System.out.println("Danh sách nhân viên sau sắp xếp theo họ tên");
        xuat();
    }

    /////////////////////////
    ///////////////sắp xếp theo thu nhập
    public void sXTN() {
        lstNV.sort((a, b)
                -> {
            Double a1 = a.getThuNhap();
            Double b1 = b.getThuNhap();
            return a1.compareTo(b1);
        }
        );
        System.out.println("Danh sách nhân viên sau sắp xếp theo thu nhập");
        xuat();
    }

    //////////////////Xuất 5 nhân viên có thu nhập cao nhất
    public void xT5() {
        lstNV.sort((a, b)
                -> {
            Double a1 = a.getThuNhap();
            Double b1 = b.getThuNhap();
            return b1.compareTo(a1);
        });
        System.out.println("Danh sách 5 nhân viên có thu nhập cao nhất ");
        System.out.printf("%-20s %-20s %20s %20s %20s \n",
                "Mã nhân viên", "Họ Tên", "Lương cơ bản", "Thu Nhập", "Thuế Thu Nhập");
        if(lstNV.size()>4){
        for (int i = 0; i < 5; i++) {
            lstNV.get(i).xuat();
        }}else{
            for (int i = 0; i < lstNV.size(); i++) {
                lstNV.get(i).xuat();
            }
        }
    }

    ////////////////////
    public void timKhoangLuong() {
        System.out.print("Mời nhập khoảng lương nhỏ nhất: ");
        double min;
        while (true) {
            try {
                min = Double.parseDouble(sc.nextLine());
                if (min >= 0) {
                    break;
                } else {
                    System.out.print("Lương nhỏ nhất phải lớn hơn hoặc bằng 0: ");
                }
            } catch (Exception e) {
                System.out.print("Lương nhỏ nhất phải là số thực mời bạn nhập lại: ");
            }
        }
        System.out.print("Mời nhập khoảng lương lớn nhất: ");
        double max;
        while (true) {
            try {
                max = Double.parseDouble(sc.nextLine());
                if (max > min) {
                    break;
                } else {
                    System.out.print("Lương lớn nhất phải lớn hơn lương nhỏ nhất: ");
                }
            } catch (Exception e) {
                System.out.print("Lương lớn nhất phải là số thực mời bạn nhập lại: ");
            }
        }
        System.out.printf("Danh sách nhân viên có lương từ %.2f đến %.2f: \n", min, max);
        System.out.printf("%-20s %-20s %20s %20s %20s \n",
                "Mã nhân viên", "Họ Tên", "Lương cơ bản", "Thu Nhập", "Thuế Thu Nhập");

        for (int i = 0; i < lstNV.size(); i++) {
            if (min < lstNV.get(i).getLuongCB() && lstNV.get(i).getLuongCB() < max) {
                NhanVien get = lstNV.get(i);
                get.xuat();
            }
        }
    }
    /////////////////
}
