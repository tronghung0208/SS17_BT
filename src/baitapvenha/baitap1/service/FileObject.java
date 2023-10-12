package baitapvenha.baitap1.service;

import baitapvenha.baitap1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObject {
    public static final String FILENAME = "product.txt";

    public static void exportFileObject(List<Product> list) {

        try {
            File file = new File(FILENAME);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file");
        }

    }

    public static List<Product> importFileObject() {
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream inputStream = new FileInputStream(FILENAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            list = (List<Product>) objectInputStream.readObject();
            System.out.println("Lưu file thành công");
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}
