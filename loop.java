
import java.util.Scanner;

class Forloop {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i * j + "\t"); 
            }
            System.out.println();
            Scanner scan = new Scanner(System.in); 
            System.out.println("Enter a number  ");
            int number = scan.nextInt();
            int sum= 0;
            for (int k = 1; k <= number; k++) {
                sum += k; 
            }
            System.out.println("The Sum from 1 to "+ number + " numbers is: " + sum); 
            

            
        }
    }
}