import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        try
        {
            int a=s.nextInt();
            int b=s.nextInt();
            
            
            int res=a/b;

             System.out.println(res);

        }
        catch(ArithmeticException e)
        {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException e1)
        {
             System.out.println("java.util.InputMismatchException");
        }
    }
}


