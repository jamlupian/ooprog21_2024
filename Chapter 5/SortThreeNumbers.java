import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();
        
        if (a <= b && b <= c) {
            System.out.println("Ascending order: " + a + " " + b + " " + c);
        } else {
            int max, mid, min;
            
            if (a >= b && a >= c) {
                max = a;
                if (b >= c) {
                    mid = b;
                    min = c;
                } else {
                    mid = c;
                    min = b;
                }
            } else if (b >= a && b >= c) {
                max = b;
                if (a >= c) {
                    mid = a;
                    min = c;
                } else {
                    mid = c;
                    min = a;
                }
            } else {
                max = c;
                if (a >= b) {
                    mid = a;
                    min = b;
                } else {
                    mid = b;
                    min = a;
                }
            }
            
            System.out.println("Descending order: " + max + " " + mid + " " + min);
        }
        
        scanner.close();
    }
}
