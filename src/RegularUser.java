
public class RegularUser extends AbstractUser{
    public String setEmail;

    public RegularUser(String email) {
        super (email);
    }

    @Override
    public boolean validateEmail() {
        String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(regex);
    }
}
