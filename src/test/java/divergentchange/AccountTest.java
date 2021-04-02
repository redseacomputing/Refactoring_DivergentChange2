package divergentchange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    Account account;

    @BeforeEach
    void setUp() {
        account = new Account(1000);
    }

    @Test
    void creditShouldMakeASaldoOf1_000_000() {
        account.credit(1_000_000d);
        assertEquals(1000, account.getAccountNumber());
        assertEquals(1_000_000d, account.getBalance());
    }

    @Test
    void debitShouldMakeASaldoOf1_000_000() {
        account.debit(1_000_000d);
        assertEquals(-1_000_000d, account.getBalance());
    }

    @Test
    void shouldReturnXMLCorrectly() {
        account.credit(1d);
        String result = "<account><id>1000</id><balance>1.0</balance></account>";
        assertEquals(result, account.toXml());
    }
}