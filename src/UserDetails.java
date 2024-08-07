public class UserDetails {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("User data:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No user data provided.");
        }
    }
}