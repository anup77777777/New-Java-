import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt(), m4 = sc.nextInt(), m5 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5.0;
        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
        if (percentage >= 90)
            System.out.println("Grade A");
        else if (percentage >= 80)
            System.out.println("Grade B");
        else if (percentage >= 70)
            System.out.println("Grade C");
        else if (percentage >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }
}
