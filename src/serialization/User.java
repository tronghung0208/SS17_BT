package serialization;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 3738385541615715176L;
    private int id;
    private  String userName;
    private String password;
    private  boolean status;

    public User() {
    }

    public User(int id, String userName, String password, boolean status) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", User name='" + userName + '\'' +
                ", Pass=" + password +
                ", Status=" + status +
                '}';
    }
}
