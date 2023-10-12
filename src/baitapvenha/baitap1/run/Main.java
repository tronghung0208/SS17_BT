package baitapvenha.baitap1.run;

import baitapvenha.baitap1.model.Product;
import baitapvenha.baitap1.service.ProductService;

import java.io.Serializable;
import java.util.List;

import static baitapvenha.baitap1.model.Product.products;
import static baitapvenha.baitap1.model.Product.sc;
import static baitapvenha.baitap1.service.FileObject.exportFileObject;
import static baitapvenha.baitap1.service.FileObject.importFileObject;

public class Main implements Serializable {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        products = importFileObject();
        int choice;
        do {
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm sản phẩm");
            System.out.println("4. Thoát và In ra file");
            System.out.println("Nhập vào lựa chọn(1-4)");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productService.addProduct();
                    break;
                case 2:
                    productService.showProduct();
                    break;
                case 3:
                    productService.searchName();
                    break;
                case 4:
                    exportFileObject(products);

                    System.out.println("File được ghi thành công");
                    System.exit(0);
                    break;
            }

        } while (true);
    }
}
