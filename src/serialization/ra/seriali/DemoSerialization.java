package serialization.ra.seriali;

import serialization.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<User> users=new ArrayList<>();
        users.add(new User(1,"Hùng","123456",true));
        users.add(new User(2,"Phan","123456",false));
        File file=new File("user.dat");
        if (file.createNewFile()){
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            for (User user:users
                 ) {
                outputStream.writeObject(user);
            }
            outputStream.close();
            System.out.println("Ghi dữ liệu thành công");
        }else {
            System.out.println("Tạo file không thành công");
        }
    }
}
