package Test;

import Java.TextTransform4;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

public class TextTransform4Test {
    TextTransform4 textTransform4;
    @Before
    public void setUp() throws Exception {
        textTransform4=new TextTransform4();
    }

    @After
    public void tearDown() throws Exception {
        textTransform4=null;
    }

    @Test
    public void readConvert() throws IOException {
        assertEquals(
                "failed",
                "HELLO", textTransform4.readConvert(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/input.txt")));
        assertEquals(
                "failed",
                null, textTransform4.readConvert(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/exampleFile.txt")));
    }
    @Test
    public void readConvertInputFailure() throws IOException {
        assertNull("failed", textTransform4.readConvert(new File("in.txt")));
        assertNotSame(
                "failed",
                "this IS EXAMPLE", textTransform4.readConvert(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/exampleFile.txt")));
    }

    @Test
    public void findLength() throws IOException {
        //Arranga
        Long expectedValue=(long)5;
        //Act
        Long actualValue=textTransform4.findLength(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/input.txt"));
        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void findLengthOfEmptyFile() throws IOException {
        //Arranga
        Long expectedValue=(long)0;
        //Act
        Long actualValue=textTransform4.findLength(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/exampleFile.txt"));
        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void findLengthInputFailure() throws IOException {
        assertNull(
                "failed", textTransform4.findLength(new File("in.txt")));
        assertNotSame(
                "failed",
                2, textTransform4.findLength(new File("exampleFile.txt")));

    }
}