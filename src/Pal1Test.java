package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Pal1Test {
    Java.Pal1 pal1;
    @Before
    public void setUp() throws Exception {
        pal1 =new Java.Pal1();
    }

    @After
    public void tearDown() throws Exception {
        pal1 =null;
    }
    @Test
    public void testReverseInput() {

        assertEquals(
                "Reversing failed",
                "madam", pal1.reverseInput("madam"));
        assertEquals(
                "Reversing failed",
                "4321", pal1.reverseInput("1234"));
        assertEquals(
                "Reversing failed",
                null, pal1.reverseInput(null));

    }
    @Test
    public void testReverseInputFailure() {
        assertNotNull(
                "Reversing failed",
                pal1.reverseInput("shreelekhya"));
        assertNotSame("Check alphabet case","ayhkeleerhs", pal1.reverseInput("Shreelekhya"));

    }
    @Test
    public void testCheckPalindrome() {
        assertEquals(
                "palindrome checking failed for a palindrome",
                "yes", pal1.checkPalindrome("madam"));
        assertEquals(
                "palindrome checking failed for not a palindrome",
                "no", pal1.checkPalindrome("1234"));
    }
    @Test
    public void testCheckPalindromeFailure() {
        assertNotNull(
                "palindrome check failed",
                pal1.checkPalindrome("shreelekhya123"));
        assertNotSame("Check failed","ayhkeleerhs", pal1.checkPalindrome("Shreelekhya"));

    }
}