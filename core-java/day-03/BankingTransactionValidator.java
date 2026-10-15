import java.util.Scanner;

public class BankingTransactionValidator{

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        double balance = 50000;
        
System.out.println("=== SmartBank transaction System ===");
System.out.println("Opening Balance:" + balance);

System.out.println("Enter transaction type (deposit/withdrawal):");
String transactionType =scanner.nextLine().trim().toLowerCase();

System.out.print("Enter transaction amount:");
double amount = scanner.nextDouble();



if(amount<=0){
    System.out.println("Rejected: Invalid amount.");
}else if(transactionType.equals("deposit")){
    balance +=amount;

    System.out.println("Transaction Successful:Deposit");

}else if (transactionType.equals("withdrawal")){

    if(balance>=amount){
        balance = balance-amount;

        System.out.println("Transaction Successful:Withdrawal.");

    } else {

        System.out.println("Rejected: Insufficient balance.");
    }

}else{
    System.out.println("Rejected: Invalid transaction type.");
}

System.out.println("Final balance:" + balance);

scanner.close();
}
}