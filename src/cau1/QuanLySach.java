package cau1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {

    private List<TaiLieu> danhSachTaiLieu;
    private Scanner scanner;

    public QuanLySach(Scanner scanner) {
        super();
        this.scanner = scanner;
        danhSachTaiLieu = new ArrayList<>();
    }
    public void timKiemTheoLoai() {
        System.out.print("Nhập loại tài liệu cần tìm kiếm (Sach/TapChi/Bao): ");
        String loaiTaiLieuCanTim = scanner.nextLine();

        boolean taiLieuTimThay = false;

        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equalsIgnoreCase(loaiTaiLieuCanTim)) {
                System.out.println("Tìm thấy tài liệu:");
                System.out.println(taiLieu);
                taiLieuTimThay = true;
                break; // Sử dụng break nếu chỉ muốn tìm kiếm một kết quả đầu tiên
            }
        }

        if (!taiLieuTimThay) {
            System.out.println("Không tìm thấy tài liệu phù hợp!");
        }
    }

    public void themMoiTaiLieu(int choice) {
        TaiLieu taiLieu = null;

        try {
            System.out.println("Nhập thông tin tài liệu:");

            System.out.print("Mã tài liệu: ");
            String maTaiLieu = scanner.nextLine();

            System.out.print("Nhà xuất bản: ");
            String tenNhaXuatBan = scanner.nextLine();

            System.out.print("Số bản phát hành: ");
            int soBanPhatHanh = scanner.nextInt();

            if (choice == 1) { // Thêm Sách
                System.out.print("Tên tác giả: ");
                String tenTacGia = scanner.nextLine();

                System.out.print("Số trang: ");
                int soTrang = scanner.nextInt();

                taiLieu = new Sach(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
            } else if (choice == 2) { // Thêm Tạp chí
                System.out.print("Số phát hành: ");
                int soPhatHanh = scanner.nextInt();

                System.out.print("Tháng phát hành: ");
                int thangPhatHanh = scanner.nextInt();

                taiLieu = new TapChi(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
            } else if (choice == 3) { // Thêm Báo
                System.out.print("Ngày phát hành: ");
                int ngayPhatHanh = scanner.nextInt();

                taiLieu = new Bao(maTaiLieu, tenNhaXuatBan, soBanPhatHanh, ngayPhatHanh);
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
                return;
            }

            danhSachTaiLieu.add(taiLieu);
            System.out.println("Thêm tài liệu thành công!");
        } catch (InputMismatchException e) {
            System.out.println("Nhập liệu không hợp lệ. Vui lòng nhập số nguyên!");
            scanner.nextLine(); // Clear the scanner buffer
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra!");
            e.printStackTrace();
        }
    }

    public void hienThiDanhSachTaiLieu() {
        if (danhSachTaiLieu.isEmpty()) {
            System.out.println("Danh sách tài liệu trống!");
            return;
        }

        System.out.println("Danh sách tài liệu:");
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            System.out.println(taiLieu);
        }
    }

    public void xoaTaiLieuTheoMa() {
        System.out.print("Nhập mã tài liệu cần xóa: ");
        String maTaiLieuCanXoa = scanner.nextLine();

        int taiLieuIndex = -1;
        for (int i = 0; i < danhSachTaiLieu.size(); i++) {
            if (danhSachTaiLieu.get(i).getMaTaiLieu().equals(maTaiLieuCanXoa)) {
                taiLieuIndex = i;
                break;
            }
        }

        if (taiLieuIndex != -1) {
            danhSachTaiLieu.remove(taiLieuIndex);
            System.out.println("Xóa tài liệu thành công!");
        } else {
            System.out.println("Tài liệu không tồn tại!");
        }
    }
}