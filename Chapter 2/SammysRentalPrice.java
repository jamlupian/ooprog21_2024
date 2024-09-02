import java.util.Scanner;

public class SammysRentalPrice {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S  Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("");

        System.out.print("Enter the number of minutes he rented a piece of sports equipment: ");
        int numberOfMinutes = scan.nextInt();

        int hours = numberOfMinutes / 60;
        int addonMinutes = numberOfMinutes % 60;

        double totalPrice = 40 * hours + addonMinutes;
        
        if(numberOfMinutes < 60){
            System.out.println("Hours rented: "+ hours);
            System.out.println("Additional minutes: "+ numberOfMinutes);
            System.out.println("Total Price: $40");
         }
         else{
        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes: " + addonMinutes);
        System.out.printf("Total Price: $%.2f\n", totalPrice);
         }
    }
}
