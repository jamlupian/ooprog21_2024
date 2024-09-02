import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pricePerGuest = 35;

        System.out.println("");
        System.out.println("*************************************");
        System.out.println("* Carly's makes the food that makes *");
        System.out.println("*            it a party.            *");
        System.out.println("*************************************");
        System.out.println("");

        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scan.nextInt();

        int totalPrice = numberOfGuests * pricePerGuest;

        boolean isEventLarge = numberOfGuests >= 50;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerGuest);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + isEventLarge);

        }
    }