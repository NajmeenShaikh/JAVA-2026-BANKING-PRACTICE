/* Banking customer profile program*/


public class SmartBank{
    public static void main(String[] args) {

        String bankName ="Smart Bank";
        String customerName = "Nazmeen Shaikh";
        int customerId =10001;
        String accountType = "Saving Account";
        double balance = 500000.50;
        double deposit= 5000;
        double withdraw = 2000;
        int interestRate = 5;
        boolean kycVerified = true;
        char customerGrade = 'A';

System.out.println("===== Welcome to Smart Bank =====");
 System.out.println("Bank Name: " + bankName);
System.out.println("customerName:" + customerName);
System.out.println("customerId:" + customerId);
System.out.println("accountType:" + accountType);
System.out.println("balance:" + balance);
System.out.println("Final Balance:" + (balance + deposit));
System.out.println("Final Balance after Withdrawal: " + (balance + deposit - withdraw));
System.out.println(("Annual interest :" + (balance * interestRate / 100)));
System.out.println("kycVerified:" + kycVerified);
System.out.println("customerGrade:" + customerGrade);



   
    }
}










