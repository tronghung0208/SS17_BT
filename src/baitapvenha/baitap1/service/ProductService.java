package baitapvenha.baitap1.service;

import baitapvenha.baitap1.model.Product;

import static baitapvenha.baitap1.model.Product.products;
import static baitapvenha.baitap1.model.Product.sc;

public class ProductService {
    public void addProduct(){
        Product product=new Product();
        product.input();
        products.add(product);
    }

    public void showProduct(){
        for (Product product:products
             ) {
           product.getProduct();
        }

    }
    public void searchName(){
        System.out.println("Nhập vào tên cần tìm");
        String name= sc.nextLine();

        for (Product product:products
             ) {
            if (product.getName().equals(name)){
                product.getProduct();
            }
        }
    }
}
