package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReadTest {
    Java.FileRead fileRead;
    @Before
    public void setUp() throws Exception {
        fileRead =new Java.FileRead();
    }

    @After
    public void tearDown() throws Exception {
        fileRead =null;
    }

    @Test
    public void read() {
        assertEquals("failed","Hello", fileRead.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","input.txt"));
        assertEquals("failed","shreelekhya gampa", fileRead.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","testing.csv"));
    }
    @Test
    public void readNull() {
        assertEquals("failed","file not found", fileRead.read("/home/cgi/IdeaProjects/Objects101PE/src/Java/","inp.txt"));
    }
}