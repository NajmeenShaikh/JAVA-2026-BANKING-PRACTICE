import java.util.Scanner;

public class DepositCalculator {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.print("Enter Opening Balance:");
        double openingBalance = scanner.nextDouble();

        System.out.print("Enter Deposit Amount:");
        double depositAmount = scanner.nextDouble();

        double updatedBalance = openingBalance + depositAmount;

        System.out.println("---SmartBank Receipt ---");
        System.out.println("Customer Name:" + customerName);
        System.out.println("Opening Balance:" + openingBalance);
        System.out.println("Deposit Amount:" + depositAmount);
        System.out.println("Updated Balance:" + updatedBalance);

        scanner.close();

    }
}