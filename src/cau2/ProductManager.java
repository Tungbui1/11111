package cau2;
import java.util.Map;
import java.util.stream.Stream;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
	public void createProduct() {
		private Scanner scanner; // Khai báo scanner là một biến private

	    public ProductManager() {
	        this.scanner = new Scanner(System.in); // Khởi tạo scanner trong constructor
	    }
    // Nhập thông tin sản phẩm
    System.out.println("Nhập tên sản phẩm: ");
    String name = scanner.nextLine();

    System.out.println("Nhập giá sản phẩm: ");
    Double price = scanner.nextDouble();

    System.out.println("Nhập số lượng sản phẩm: ");
    Integer quantity = scanner.nextInt();

    // Chọn danh mục
    System.out.println("Chọn danh mục sản phẩm:");
    for (int i = 0; i < Categories.size(); i++) {
        System.out.println((i + 1) + ". " + Categories.get(i).getName());
    }
    int choice = scanner.nextInt();
    Categories category = Categories.get(choice - 1);

    // Tạo sản phẩm mới
    Products product = new Products(generateId(), name, price, quantity, category);

    // Thêm sản phẩm vào danh sách
    Products.add(product);

    System.out.println("Tạo sản phẩm thành công!");
}
	public void updateProduct() {
	    // Nhập ID sản phẩm cần sửa
	    System.out.println("Nhập ID sản phẩm cần sửa: ");
	    Long id = scanner.nextLong();

	    // Tìm kiếm sản phẩm
	    Products product = findProductById(id);

	    if (product == null) {
	        System.out.println("Sản phẩm không tồn tại!");
	        return;
	    }

	    // Nhập thông tin mới
	    System.out.println("Nhập tên sản phẩm mới (hoặc giữ nguyên): ");
	    String newName = scanner.nextLine();
	    if (!newName.isEmpty()) {
	        product.setName(newName);
	    }

	    System.out.println("Nhập giá sản phẩm mới (hoặc giữ nguyên): ");
	    Double newPrice = scanner.nextDouble();
	    if (newPrice != null) {
	        product.setPrice(newPrice);
	    }

	    System.out.println("Nhập số lượng sản phẩm mới (hoặc giữ nguyên): ");
	    Integer newQuantity = scanner.nextInt();
	    if (newQuantity != null) {
	        product.setQuantity(newQuantity);
	    }

	    // Chọn danh mục mới (hoặc giữ nguyên)
	    System.out.println("Chọn danh mục sản phẩm mới (hoặc giữ nguyên):");
	    for (int i = 0; i < Categories.size(); i++) {
	        System.out.println((i + 1) + ". " + Categories.get(i).getName());
	    }
	    int choice = scanner.nextInt();
	    if (choice > 0 && choice <= Categories.size()) {
	        product.setCategory(Categories.get(choice - 1));
	    }

	    System.out.println("Cập nhật sản phẩm thành công!");
	}
	public void deleteProduct() {
	    // Nhập ID sản phẩm cần xóa
	    System.out.println("Nhập ID sản phẩm cần xóa: ");
	    Long id = scanner.nextLong();

	    // Tìm kiếm sản phẩm
	    Products product = findProductById(id);

	    if (product == null) {
	        System.out.println("Sản phẩm không tồn tại!");
	        return;
	    }

	    // Xóa sản phẩm khỏi danh sách
	    Products.remove(product);

	    System.out.println("Xóa sản phẩm thành công!");
	}
	public void showProductById() {
	    // Nhập ID sản phẩm cần hiển thị
	    System.out.println("Nhập ID sản phẩm cần hiển thị: ");
	    Long id = scanner.nextLong();

	    // Tìm kiếm sản phẩm
	    Products product = findProductById(id);

	    if (product == null) {
	        System.out.println("Sản phẩm không tồn tại!");
	        return;
	    }

	    // Hiển thị thông tin sản phẩm
	    System.out.println(product);
	}
	public void showAllProducts() {
	    for (Products product : Products) {
	        System.out.println(product);
	    }
	}
	public void showProductsByCategory() {
	    // Chọn danh mục
	    System.out.println("Chọn danh mục sản phẩm:");
	    for (int i = 0; i < Categories.size(); i++) {
	        System.out.println((i + 1) + ". " + Categories.get(i).getName());
	    }
	    int choice = scanner.nextInt();
	    Category category = Categories.get(choice - 1);

	    // Hiển thị tất cả sản phẩm thuộc danh mục đã chọn
	    for (Products product : Products) {
	        if (product.getCategory().equals(category)) {
	            System.out.println(product);
	        }
	    }
	    }
	    public double calculateTotalRevenue() {
	        double totalRevenue = 0;
	        for (Products product : Products) {
	            totalRevenue += product.getPrice() * product.getQuantity();
	        }
	        return totalRevenue;
	}	
	public void showProductsWithPriceOver100000() {
	    for (Products product : Products) {
	        if (product.getPrice() > 100000) {
	            System.out.println(product);
	        }
	    }
	    }
	    public void showProductsWithPriceOver200000AndCategoryElectronics() {
	        for (Products product : Products) {
	            if (product.getPrice() > 200000 && product.getCategory().getName().equals("Điện tử")) {
	                System.out.println(product);
	            }
	        }
	    }
	}

