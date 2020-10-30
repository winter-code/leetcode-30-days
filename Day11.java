import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a = A.length();
        int b = B.length();
        int s = a+b;
         System.out.println(""+s);
         int ans = 0;
        int i =0;
        
        for(i=0;i<a;)
        {
          if(A.charAt(i)>B.charAt(i))
            {
            ans = 1;
          
          break;
            }
          else if(A.charAt(i)==B.charAt(i))
            {
             i++;
            }
         else
         ans = 2;
         break;

        }
        if(ans == 1)
        
        {
            System.out.println("Yes");

        }
        else if(ans == 2)
        {
            System.out.println("No");
        }
        else if(ans==0)
        {
            if(a<=b)
            System.out.println("No");
            else
            System.out.println("Yes");
        }
        String output1 = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output1+" "+output2);
        
    }
}



