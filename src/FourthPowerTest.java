package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourthPowerTest {
    Java.FourthPower fourthPower;
    @Before
    public void setUp() throws Exception {
        fourthPower =new Java.FourthPower();
    }

    @After
    public void tearDown() throws Exception {
        fourthPower =null;
    }

    @Test
    public void isPowerOf4() {
        assertEquals(
                "Invalid",
                true, fourthPower.isPowerOf4(64));
        assertEquals(
                "Invalid",
                false, fourthPower.isPowerOf4(2));
    }
    @Test
    public void isPowerOf4NotNull() {
        assertNotNull(
                "Invalid",
                fourthPower.isPowerOf4(0));
        assertNotSame("Check alphabet case",true, fourthPower.isPowerOf4(8));

    }
}