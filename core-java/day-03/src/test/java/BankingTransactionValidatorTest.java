
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingTransactionValidatorTest {

    // Test Case 1: Valid deposit
    @Test
    void depositShouldIncreaseBalance() {

        double actual =
                BankingTransactionValidator.processTransaction(
                        "deposit", 2000, 50000);

        assertEquals(52000.0, actual, 0.001);
    }

    // Test Case 2: Valid withdrawal
    @Test
    void withdrawalShouldDecreaseBalance() {

        double actual =
                BankingTransactionValidator.processTransaction(
                        "withdrawal", 5000, 50000);

        assertEquals(45000.0, actual, 0.001);
    }

    // Test Case 3: Withdrawal greater than balance
    @Test
    void withdrawalAboveBalanceShouldFail() {

        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> BankingTransactionValidator.processTransaction(
                        "withdrawal", 60000, 50000));

        assertEquals("Insufficient balance.", error.getMessage());
    }

    // Test Case 4: Zero amount
    @Test
    void zeroAmountShouldFail() {

        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> BankingTransactionValidator.processTransaction(
                        "deposit", 0, 50000));

        assertEquals("Invalid amount.", error.getMessage());
    }

    // Test Case 5: Negative amount
    @Test
    void negativeAmountShouldFail() {

        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> BankingTransactionValidator.processTransaction(
                        "deposit", -500, 50000));

        assertEquals("Invalid amount.", error.getMessage());
    }

    // Test Case 6: Invalid transaction type
    @Test
    void invalidTransactionTypeShouldFail() {

        IllegalArgumentException error = assertThrows(
                IllegalArgumentException.class,
                () -> BankingTransactionValidator.processTransaction(
                        "transfer", 1000, 50000));

        assertEquals(
                "Invalid transaction type.", error.getMessage());
    }
}
