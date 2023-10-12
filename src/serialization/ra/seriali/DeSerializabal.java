package serialization.ra.seriali;

import serialization.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeSerializabal {
    public static void main(String[] args) throws IOException {

        try {
            FileInputStream fileInputStream = new FileInputStream("user.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            User users = (User) inputStream.readObject();
            while (true) {
                System.out.println(users);
                users = (User) inputStream.readObject();
            }

        } catch (EOFException e) {
            System.out.println("Đã đọc file thành công");
        } catch (IOException e) {
            System.out.println("Đọc file không thành công");
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi");
        }
        File newFile = new File("user.txt");
        if (newFile.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            List<User> userList = new ArrayList<>();

            System.out.println("userList"+userList);
            for (User user : userList) {
                outputStream.writeObject(user);
            }
            outputStream.close();
            System.out.println("Ghi dữ liệu thành công");
        }

    }
}
