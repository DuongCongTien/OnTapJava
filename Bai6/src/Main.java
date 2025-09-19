import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc143 = new Scanner(System.in);
        KhachSan khachSan143 = new KhachSan();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ KHÁCH SẠN =====");
            System.out.println("1. Thêm khách trọ mới");
            System.out.println("2. Hiển thị danh sách khách trọ");
            System.out.println("3. Tìm kiếm khách trọ theo CMND");
            System.out.println("4. Trả phòng và tính tiền");
            System.out.println("5. Xóa khách trọ theo CMND");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            String chon143 = sc143.nextLine();

            switch (chon143) {
                case "1":
                    khachSan143.nhapMotKhachTro143(sc143);
                    break;
                case "2":
                    khachSan143.hienThiTatCa143();
                    break;
                case "3":
                    System.out.print("Nhập CMND cần tìm: ");
                    String cmndTim143 = sc143.nextLine();
                    khachSan143.timKiemKhachTro143(cmndTim143);
                    break;
                case "4":
                    System.out.print("Nhập CMND khách trả phòng: ");
                    String cmndTra143 = sc143.nextLine();
                    khachSan143.traPhongTinhTien143(cmndTra143);
                    break;
                case "5":
                    System.out.print("Nhập CMND khách cần xóa: ");
                    String cmndXoa143 = sc143.nextLine();
                    khachSan143.xoaKhachTro143(cmndXoa143);
                    break;
                case "0":
                    System.out.println("👋 Thoát chương trình.");
                    sc143.close();
                    return;
                default:
                    System.out.println("⚠ Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
    }
}