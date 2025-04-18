import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String fullName = scanner.nextLine();  
        System.out.println("Hello, " + fullName + " Welcome!!!!");
        scanner.close();
    }
}
