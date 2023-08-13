import java.util.ArrayList;

public class UserManager implements UserManagment{
    public UserManager() {
        userList = new ArrayList<>();
    }

    static ArrayList<AbstractUser> userList;

    @Override
    public void addUser(AbstractUser user) {
        userList.add(user);
    }

    @Override
    public void removeUser(String email) {
        userList.removeIf(user -> user.setEmail.equals(email));
    }
    public void displayUsers() {
        userList.forEach(user -> System.out.println(user.email));
    }
}
