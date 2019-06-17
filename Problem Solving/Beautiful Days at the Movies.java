import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

            int count=0;
            for(int p=i;p<=j;p++)
            {
                int num=p;
                int reverse=reverseNo(p);
                if((Math.abs(num-reverse))%k==0)
                    count++;
                
            }
        return count;
    }

    static int reverseNo(int p)
    {
                int no=p;
                
                int digit=0;
                while(no>0)
                {
                    no/=10;
                    digit++;
                }
                int reverse=0;
                for(int a=1;a<=digit;a++)
                {
                    int q=p/10;
                    int r=p%10;
                    reverse+=r*Math.pow(10,digit-a);
                    p=q;

                }

                return reverse;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
