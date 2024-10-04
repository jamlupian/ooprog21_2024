import java.util.Scanner;

public class BloodData {
    
    private String bloodType;
    private String rhFactor;

    public String getBlood() {
        return bloodType;
    }

    public void setBlood(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = "A";  
        this.rhFactor = "-";   
    }

    public void inputBlood() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.print("Enter blood type: ");
        this.bloodType = scanner.nextLine();

        System.out.print("Enter your Rh factor: ");
        this.rhFactor = scanner.nextLine();
    }

        public void displayBlood() {
        System.out.println("Your blood type is: " + this.bloodType);
        System.out.println("Your Rh factor is: " + this.rhFactor);
    }
}