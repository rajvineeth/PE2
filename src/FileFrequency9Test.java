package Test;

import Java.FileFrequency9;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FileFrequency9Test {
    FileFrequency9 fileFrequency9;
    @Before
    public void setUp() throws Exception {
        fileFrequency9=new FileFrequency9();
    }

    @After
    public void tearDown() throws Exception {
        fileFrequency9=null;
    }

    @Test
    public void read() throws IOException {
        assertEquals(
                "failed",
                "Hello", fileFrequency9.read(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/input.txt")));
        assertEquals(
                "failed",
                null, fileFrequency9.read(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/exampleFile.txt")));
    }
    @Test
    public void readInputFailure() throws IOException {
        assertNull("failed", fileFrequency9.read(new File("in.txt")));
        assertNotSame(
                "failed",
                "this IS EXAMPLE", fileFrequency9.read(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/exampleFile.txt")));
    }

    @Test
    public void findFrequency() throws IOException {
        Map<String,Integer> map=new HashMap<>();
        map.put("Hello",1);
        assertEquals(
                "failed",
                map, fileFrequency9.findFrequency(fileFrequency9.read(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/input.txt"))));
        map.remove("Hello");
        map.put("the",2);
        map.put("quick",1);
        map.put("brown",2);
        map.put("fox",3);
        map.put("jumps",1);
        map.put("over",1);
        map.put("lazy",1);
        map.put("dog",1);
        assertEquals(
                "failed",
                map, fileFrequency9.findFrequency(fileFrequency9.read(new File("/home/cgi/IdeaProjects/Objects101PE/src/Java/FileDemo.txt"))));

    }
}