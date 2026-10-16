
import java.util.Scanner;

public class ATMWithdrawalValidator {
    
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

double balance = 50000.0;
double dailyWithdrawalLimit = 20000.0;

System.out.println("=== SmartBank ATM Withdrawal System ===");
System.out.println("Available Balance:"+ balance);
System.out.println("DailyWithdrawal Limit:"+ dailyWithdrawalLimit);


System.out.print("Enter Withdrawal Amount:");
double withdrawalAmount = scanner.nextDouble();

if(withdrawalAmount<=0){

System.out.println("Transaction Rejected: Invalid amount");

}else if(withdrawalAmount > dailyWithdrawalLimit){

System.out.println("Transaction Rejected: Exceeds daily withdrawal limit");
}else if(withdrawalAmount > balance){

System.out.println("Transaction Rejected: Insufficient balance");

}else{

balance-=withdrawalAmount;

System.out.println("Transaction Successful: " + withdrawalAmount);
System.out.println("Withdrawal Amount:" + withdrawalAmount );
System.out.println("Available Balance:" + balance);
}

scanner.close();
}
}
