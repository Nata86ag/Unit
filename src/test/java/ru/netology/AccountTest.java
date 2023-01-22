package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void payTest() {
        Account account = new Account("Вася", 1000);
        long balance = 1000;
        boolean ans = true;
        boolean result = account.pay(balance);
        Assertions.assertEquals(ans, result);
    }

    @Test
    public void addTest() {
        Account account = new Account("Вася", 35000);
        Assertions.assertNotNull(account);
    }

    @Test
    public void testJUnit() {
        System.out.println("This is the testcase in this class");
        String str1 = "This is the testcase in this class";
        Assertions.assertEquals("This is the testcase in this class", str1);
    }
}
