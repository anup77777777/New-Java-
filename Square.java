import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPerfect = false;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfect = true;
                break;
            }
        }
        System.out.println(isPerfect ? "Perfect square" : "Not a perfect square");
    }
}
