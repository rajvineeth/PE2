package Java;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileFrequency9 {

    public String read(File file) throws IOException {
        if(!file.exists() || file.length()==0)
            return null;
        FileReader fileReader=new FileReader(file);
        int ch;String content="";
        while ((ch=fileReader.read()) != -1)
            content=content+(char) ch;
        return content;
    }
    public Map<String,Integer> findFrequency(String content){
        Map<String, Integer> map = new HashMap<>();
        String contentStr[]=content.split(" ");
        for (String words : contentStr) {
            Integer count = map.get(words);
            count = (count == null) ? 1 : ++count;
            map.put(words, count);
        }
        return map;
    }
}
