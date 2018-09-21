package Java;

public class Fact {
    public static void main(String[] args)
    {
        Java.Fact fact =new Java.Fact();
        fact.intFactorial();
        fact.longFactorial();
    }
    private void intFactorial()
    {
        int number  = 1;
        int result = 1;
        while (true)
        {
            System.out.println("The factorial of "+number+" is "+result);
            if (Integer.MAX_VALUE / result < (number+1)) {
                System.out.println("The factorial of "+(number+1)+" is out of range.\n");
                break;
            }
            number++;
            result *= number;
        }

    }
    private void longFactorial()
    {
        long number  = 1L;
        long result = 1L;
        while (true)
        {
            System.out.println("The factorial of "+number+" is "+result);
            if (Long.MAX_VALUE / result < (number+1)) {
                System.out.println("The factorial of "+(number+1)+" is out of range.\n");
                break;
            }
            number++;
            result *= number;
        }
    }

}
