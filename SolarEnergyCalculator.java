import java.util.Scanner;

public class SolarEnergyCalculator {

    // Method to calculate total energy
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read morning and evening energy values
        System.out.print("Enter morning energy generated (in kWh): ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy generated (in kWh): ");
        double eveningEnergy = sc.nextDouble();

        // Call the method
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        // Display result
        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}
