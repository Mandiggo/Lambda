abstract class AbstractUser {
    public String setEmail;
    public String email;

    public AbstractUser(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "email='" + email + '\'' +
                '}';
    }

    public abstract boolean validateEmail();
}