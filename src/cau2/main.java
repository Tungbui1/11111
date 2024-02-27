package com.example.cau2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tạo danh sách danh mục
        List<Category> categories = new ArrayList<>();
        categories.add(new Category("Điện tử"));
        categories.add(new Category("Thời trang"));
        categories.add(new Category("Sách"));

        // Tạo scanner
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo ProductManager
        ProductManager productManager = new ProductManager(scanner);

        // Menu
        while (true) {
            System.out.println("--------------------");
            System.out.println("Chương trình quản lý sản phẩm");
            System.out.println("--------------------");
            System.out.println("1. Tạo mới sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị sản phẩm theo ID");
            System.out.println("5. Hiển thị tất cả sản phẩm");
            System.out.println("6. Hiển thị sản phẩm theo danh mục");
            System.out.println("7. Tính tổng tiền của các sản phẩm");
            System.out.println("8. Hiển thị sản phẩm có giá tiền > 100000");
            System.out.println("9. Hiển thị sản phẩm có giá tiền > 200000 và có Category là \"Điện tử\"");
            System.out.println("0. Thoát chương trình");
            System.out.println("--------------------");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    productManager.createProduct();
                    break;
                case 2:
                    productManager.updateProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.showProductById();
                    break;
                case 5:
                    productManager.showAllProducts();
                    break;
                case 6:
                    productManager.showProductsByCategory();
                    break;
                case 7:
                    System.out.println("Tổng tiền của các sản phẩm là: " + productManager.calculateTotalRevenue());
                    break;
                case 8:
                    productManager.showProductsWithPriceOver100000();
                    break;
                case 9:
                    productManager.showProductsWithPriceOver200000AndCategoryElectronics();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }
        }
    }
}