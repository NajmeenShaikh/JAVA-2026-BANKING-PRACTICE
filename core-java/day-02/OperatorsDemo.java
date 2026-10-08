

public class OperatorsDemo {
    public static void main(String[] args) {
        double balance = 500000.50;
        double deposit = 5000;
        double withdraw = 2000;


        double balanceAfterDeposit = balance + deposit;
        double finalBalance = balanceAfterDeposit - withdraw;


        System.out.println("Balance" + balance);
        System.out.println("Balance After deposit" + balanceAfterDeposit);
        System.out.println("Balance After withdrawal" + finalBalance);
        System.out.println("Is balance Sufficient?" + (balance >= withdraw));

    }
    
}
