public class TypeConversionDemo {
    public static void main(String[] args){

        int  transactionCount =10;
        double countAsDouble = transactionCount;
        double transactionAmount = 1500.75;
        int amountAsInt = (int) transactionAmount;


        System.out.println("Transaction Count: " + transactionCount);
        System.out.println("Count as Double: " + countAsDouble);
        System.out.println("Transaction Amount: " + transactionAmount);
        System.out.println("Amount as Int: " + amountAsInt);

    }

}
