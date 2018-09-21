package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    Java.EvenCheck evenCheck;
    @Before
    public void setUp() throws Exception {
        evenCheck =new Java.EvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        evenCheck =null;
    }

    @Test
    public void isEven() {
        assertEquals(
                "failed",
                true, evenCheck.isEven(4));
        assertEquals(
                "failed",
                false, evenCheck.isEven(13));
    }
    @Test
    public void isEvenFailure() {
        assertNotNull(
                "failed",
                 evenCheck.isEven(4));
        assertNotSame(
                "failed",
                false, evenCheck.isEven(0));
    }
}