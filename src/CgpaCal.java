package Java;

import java.util.Arrays;

public class CgpaCal {
    public Float avgCalc(int[] grades)
    {
        if(grades.length==0)
            return null;
        float sum=0;float avg=0;
        for(int index=0;index<grades.length;index++)
            sum=sum+grades[index];
        avg=sum/grades.length;
        System.out.println(avg);
        return avg;
    }
    public Integer minGrade(int grades[])
    {
        if(grades.length==0)
            return null;
        Arrays.sort(grades);
        return grades[0];
    }
    public Integer maxGrade(int grades[])
    {
        if(grades.length==0)
            return null;
        Arrays.sort(grades);
        return grades[grades.length-1];
    }
}
