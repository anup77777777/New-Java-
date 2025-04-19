import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), count = 0;
        if (num == 0) count = 1;
        else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }
        System.out.println("Number of digits = " + count);
    }
}
