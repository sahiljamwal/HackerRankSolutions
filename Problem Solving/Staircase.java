import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        int i=1;
        while(i<=n)
        {

            int space=1;
            while(space<=n-i)
            {
                System.out.print(" ");
                space++;
            }

            int j=1;
            while(j<=i)
            {
                System.out.print("#");
                j++;
            }


            System.out.println();
            i++;
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
