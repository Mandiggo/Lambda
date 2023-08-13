public interface UserManagment {

    void addUser(AbstractUser user);

    default void removeUser(String email) {

    }
}
