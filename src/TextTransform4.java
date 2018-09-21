package Java;

import java.io.*;
import java.io.FileReader;

public class TextTransform4 {

    public String readConvert(File file) throws IOException {

        if(!file.exists() || file.length()==0)
            return null;
        FileReader fileReader=new FileReader(file);
        int ch;String content="";
        while ((ch=fileReader.read()) != -1)
            content=content+(char) ch;
        System.out.println(content);
        return content.toUpperCase();
    }
    public Long findLength(File file)
    {
        if(!file.exists())
            return null;
        else
            return file.length();
    }
}
