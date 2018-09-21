package Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args){
        read("esf","input.txt");
    }
    public static String read(String path,String filename)
    {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
                if(file.getName().equals(filename))
                {
                    FileInputStream fin = null;
                    try {
                        fin = new FileInputStream(file);
                        byte fileContent[] = new byte[(int)file.length()];
                        fin.read(fileContent);
                        String s = new String(fileContent);
                        return s;
                    }
                    catch (Exception e) {
                        System.out.println("Exception:File not found");
                    }
                    finally {
                        try {
                            if (fin != null) {
                            fin.close();
                            }
                        }
                        catch (Exception ioe) {
                            System.out.println("Error while closing stream: " + ioe);
                        }
                    }
                }
        }
        return "file not found";
    }
}
