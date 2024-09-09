import java.util.HashMap;
import java.util.Scanner;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class UserRegistration {
    static HashMap<String, User> users = new HashMap<>();

    public static boolean registerUser(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password));
            System.out.println("Registration successful!");
            return true;
        } else {
            System.out.println("User already exists!");
            return false;
        }
    }
}
