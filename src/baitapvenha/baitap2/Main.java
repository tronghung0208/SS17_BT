package baitapvenha.baitap2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên tệp nguồn: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Nhập tên tệp đích: ");
        String targetFileName = scanner.nextLine();

        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
            return;
        }

        if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại. Hãy chọn tên tệp khác.");
            return;
        }

        try {
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(targetFile);

            int bytesRead;
            byte[] buffer = new byte[1024];

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Sao chép hoàn tất. Số byte đã sao chép: " + sourceFile.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
