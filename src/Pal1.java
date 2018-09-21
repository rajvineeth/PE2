package Java;

public class Pal1 {
    Java.Pal1 pal1;
    public String reverseInput(String input)
    {
        String revString="";
        if(input==null)
            return null;
        for(int index=input.length()-1;index>=0;index--)
            revString=revString+input.charAt(index);
        return revString;
    }
    public String checkPalindrome(String input)
    {
        pal1 =new Java.Pal1();
        String revString= pal1.reverseInput(input);
        if(revString.equals(input))
            return "yes";
        else
            return "no";
    }
}
