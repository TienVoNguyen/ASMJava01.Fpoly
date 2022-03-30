package vontph18623_mob1014_it17101_asm;
import java.util.Scanner;

public class CtyRongViet {

    static QLNV ql = new QLNV();

   
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        while (true) {
            try {
                System.out.println("\t\t\t      Chào mừng đến với công ty Rồng Việt");
                System.out.println("\t\t+---------------------------MENU-----------------------------+");
                System.out.println("\t\t|   1. Nhập danh sách nhân viên từ bàn phím.                 |");
                System.out.println("\t\t|   2. Khởi tạo.                                             |");
                System.out.println("\t\t|   3. Xuất danh sách nhân viên ra màn hình.                 |");
                System.out.println("\t\t|   4. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.   |");
                System.out.println("\t\t|   5. Xóa nhân viên theo mã nhập từ bàn phím.               |");
                System.out.println("\t\t|   6. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.|");
                System.out.println("\t\t|   7. Sắp xếp nhân viên theo họ và tên.                     |");
                System.out.println("\t\t|   8. Sắp xếp nhân viên theo thu nhập.                      |");
                System.out.println("\t\t|   9. Xuất 5 nhân viên có thu nhập cao nhất.                |");
                System.out.println("\t\t|   10. Tìm theo khoảng lương nhập từ bàn phím.              |");
                System.out.println("\t\t|   0. Thoát                                                 |");
                System.out.println("\t\t+------------------------------------------------------------+");
                System.out.print("Mời bạn chọn chương trình: ");
                chon = Integer.parseInt(sc.nextLine());
                switch (chon) {
                    case 1:
                        System.out.println("Bạn chọn nhập danh sách nhân viên từ bàn phím.");
                        ql.nhap();
                        break;
                    case 2:
                        System.out.println("Bạn chọn khởi tạo. ");
                        ql.khoiTao();
                        System.out.println("Khởi tạo thành công. ");
                        break;
                    case 3:
                        System.out.println("Bạn chọn nhập xuất danh sách nhân viên ra màn hình.");
                        ql.xuat();
                        break;
                    case 4:
                        System.out.println("Bạn chọn tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
                        ql.timCode();
                        break;
                    case 5:
                        System.out.println("Bạn chọn xóa nhân viên theo mã nhập từ bàn phím.");
                        ql.xoaCode();
                        break;
                    case 6:
                        System.out.println("Bạn chọn cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
                        ql.capNhatCode();
                        break;
                    case 7:
                        System.out.println("Bạn chọn xắp xếp nhân viên theo họ và tên.");
                        ql.sXName();
                        break;
                    case 8:
                        System.out.println("Bạn chọn sắp xếp nhân viên theo thu nhập.");
                        ql.sXTN();
                        break;
                    case 9:
                        System.out.println("Bạn chọn xuất 5 nhân viên có thu nhập cao nhất.");
                        ql.xT5();
                        break;
                    case 10:
                        System.out.println("Bạn chọn tìm theo khoảng lương nhập từ bàn phím. ");
                        ql.timKhoangLuong();
                        break;
                    case 0:
                        System.out.println("Chúc bạn ngày tốt lành!");
                        System.exit(0);
                    default:
                        System.out.println("Bạn đã không chọn đúng mục chức năng mời chọn lại!");
                }
            } catch (Exception e) {
                System.out.println("Bạn đã không chọn đúng mục chức năng mời chọn lại!");
            }
        }
    }

    ////////////////
    public static void main(String[] args) {
        menu();
    }

}
