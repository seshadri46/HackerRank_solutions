import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        int  elements= scan.nextInt();
        int weight=0,sum=0,weightTotal=0;
        double weightedMean=0;
        Integer[] numbers = new Integer[elements];
        for (int i=0;i<elements;i++)
        {
             numbers[i] = scan.nextInt();
        }
        for(int i=0;i<elements;i++)
        {
            weight=scan.nextInt();
           sum=(numbers[i]*weight)+sum;
           weightTotal=weight+weightTotal;


        }
        weightedMean=(double)sum/weightTotal;
         System.out.format("%.1f", weightedMean);
    }
}
