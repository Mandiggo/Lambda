import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of users: ");
        int numUsers = scanner.nextInt();
        scanner.nextLine();

        UserManager userManager = new UserManager();

        for (int i = 0; i < numUsers; i++) {
            System.out.print("Enter email for user " + (i + 1) + ": ");
            String email = scanner.nextLine();

            RegularUser user = new RegularUser(email);
            if (user.validateEmail()) {
                userManager.addUser(user);
            } else {
                System.out.println("Invalid email format. User not added.");
            }
        }

        System.out.println("List of valid user emails:");
        userManager.displayUsers();

        scanner.close();
    }
}
