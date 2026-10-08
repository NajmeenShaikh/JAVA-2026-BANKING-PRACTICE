public class BankingValidation {
    public static void main (String[] args){

        double balance = 500000.50;
        double withdrawAmount = 10000.00;
        boolean kycVerified = true;

        if (withdrawAmount <=0){

            System.out.println("Invalid withdraw amount");

        } else if (!kycVerified){

            System.out.println("Withdrawal rejected: KYC not verified");
        } else if (withdrawAmount > balance){

            System.out.println("withdrawal rejected : Insufficient balance.");

        } else {

            balance = balance - withdrawAmount;

            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }



    }
}
