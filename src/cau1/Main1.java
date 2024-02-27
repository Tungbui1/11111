package cau1;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		QuanLySach QLS=new QuanLySach(scanner);
		int choice;
		do {
		
		 System.out.println("\n--- Quản Lý Sách ---");
        System.out.println("1. Thêm mới tài liệu");
        System.out.println("2. Xóa tài liệu theo mã");
        System.out.println("3. Hiện thị thông tin về tài liệu");
        System.out.println("4. Tìm kiếm tài liệu theo loại");
        System.out.println("5. Thoát khỏi chương trình");
        System.out.print("Lựa chọn: ");
        choice = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (choice) {
            case 1:
                System.out.println("1.Sach");
                System.out.println("2. Tap Chi");
                System.out.println("3. Bao");
               int choice1 = Integer.parseInt(new Scanner(System.in).nextLine());
             QLS.themMoiTaiLieu(choice1);
                break;
            case 2:
                System.out.print("Nhập mã tài liệu muốn xóa: ");
                QLS.xoaTaiLieuTheoMa();
              
                break;
            case 3:
            	QLS.hienThiDanhSachTaiLieu();
               ;
                break;
            case 4:
                System.out.print("Nhập loại tài liệu muốn tìm kiếm (Sách, Tạp chí, Báo): ");
                QLS.timKiemTheoLoai();
              
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    } while (choice != 5);
}

	}
