public class Billing {

    public static double computeBill(double price) {
        double total = price * 1.08; 
        System.out.println("The total price for the bill is: " +total);
        return total;
    }
    public static double computeBill(double price, int quantity) {
        double total = price * quantity * 1.08; 
        System.out.println("The total price for the bill is: " +total);
        return total;
    }
    public static double computeBill(double price, int quantity, int discount) {
        double total = (price * quantity * 1.08) - discount; 
        System.out.println("The total price for the bill is: " +total);
        return total;
    }
 

    public static void main(String[] args) {
      
        Billing calculator = new Billing();

        calculator.computeBill(23.2);
        calculator.computeBill(23.2, 2);
        calculator.computeBill(23.2, 2, 3);
        
    }
}