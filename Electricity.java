
import java.util.Scanner;

public class Electricity {

    public static double calculateElectricityBill(double units) {
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 0.0;
        } else if (units <= 200) {
            bill = (100 * 0.0) + ((units - 100) * 2.25);
        } else if (units <= 400) {
            bill = (100 * 0.0) + (100 * 2.25) + ((units - 200) * 4.5);
        } else if (units <= 500) {
            bill = (100 * 0.0) + (100 * 2.25) + (200 * 4.5) + ((units - 400) * 6.0);
        } else if (units <= 600) {
            bill = (100 * 0.0) + (100 * 2.25) + (200 * 4.5) + (100 * 6.0) + ((units - 500) * 8.0);
        } else if (units <= 800) {
            bill = (100 * 0.0) + (100 * 2.25) + (200 * 4.5) + (100 * 6.0) + (100 * 8.0) + ((units - 600) * 9.0);
        } else if (units <= 1000) {
            bill = (100 * 0.0) + (100 * 2.25) + (200 * 4.5) + (100 * 6.0) + (100 * 8.0) + (200 * 9.0) + ((units - 800) * 10.0);
        } else {
            bill = (100 * 0.0) + (100 * 2.25) + (200 * 4.5) + (100 * 6.0) + (100 * 8.0) + (200 * 9.0) + (200 * 10.0) + ((units - 1000) * 11.0);
        }
        return bill;
    }

    public static boolean isValidConsumerNumber(String consumerNumber) {
        // Check if the consumer number is exactly 12 digits and contains only numbers
        return consumerNumber.matches("\\d{12}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Electricity Bill Calculator");
        System.out.println("Enter consumer name :");
        String name = sc.nextLine();
        System.out.println("Enter consumer number: ");
        String num = sc.nextLine();
        if (isValidConsumerNumber(num)) {
            System.out.println("Consumer number is valid.");
        } else {
            System.out.println("Invalid consumer number. It must be exactly 12 digits and numeric only.");
        }

        try {
            System.out.print("Enter the number of units consumed: ");
            double units = sc.nextDouble();

            if (units < 0) {
                System.out.println("Units cannot be negative. Please enter a valid number.");
            } else {
                double totalBill = calculateElectricityBill(units);
                System.out.printf("Total Electricity Bill: %f ", totalBill);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a numerical value.");
        } finally {
            sc.close();
        }
    }
}
