package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CgpaCal {
    Java.CgpaCal cgpaCal;
    @Before
    public void setUp() throws Exception {
        cgpaCal =new Java.CgpaCal();
    }

    @After
    public void tearDown() throws Exception {
        cgpaCal =null;
    }

    @Test
    public void avgCalc() {
        assertEquals(81.5, cgpaCal.avgCalc(new int[]{s86,65,98,77}),0.1);
        assertEquals(50.0, cgpaCal.avgCalc(new int[]{50,50}),0.1);
    }
    @Test
    public void avgCalcFailure() {
        assertNull(cgpaCal.avgCalc(new int[]{}));
        assertNotNull("failed", cgpaCal.avgCalc(new int[]{36,89,50}));
    }

    @Test
    public void minGrade() {
        assertEquals(67, cgpaCal.minGrade(new int[]{67,89,90,99}),0);
        assertEquals(23, cgpaCal.minGrade(new int[]{23,89,90,99}),0);
    }
    @Test
    public void minGradeFailure(){
        assertNull(cgpaCal.minGrade(new int[]{}));
        assertNotSame("failed",34, cgpaCal.minGrade(new int[]{34,67,98,90,12}));
    }

    @Test
    public void maxGrade() {
        assertEquals(99, cgpaCal.maxGrade(new int[]{67,89,90,99}),0);
        assertEquals(87, cgpaCal.maxGrade(new int[]{87}),0);
    }
    @Test
    public void maxGradeFailure(){
        assertNull(cgpaCal.maxGrade(new int[]{}));
        assertNotSame("failed",3, cgpaCal.maxGrade(new int[]{3,90,89}));
    }
}