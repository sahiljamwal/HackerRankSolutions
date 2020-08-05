#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
  //Write your code here.

    int arr[n];

    int index=0;
    for(int i=1;i<=n;i++)
    {
        arr[index]=i;
        index++;
    }

    

    int max_and=0;
    int max_or=0;
    int max_xor=0;
    for(int i=0;i<n;i++)
    {
        int a=arr[i];
        for(int j=i+1;j<n;j++)
        {
            int b=arr[j];
            int and=a&b;
            int or=a|b;
            int xor=a^b;

            if(and < k && and>max_and)
            {
                max_and=a&b;
            }

            if(or < k && or>max_or)
            {
                max_or=a|b;
            }

            if(xor < k && xor>max_xor)
            {
                max_xor=a^b;
            }
            //printf("%d %d %d\n", and, or, xor);
        }
        
    }

    printf("%d\n%d\n%d\n",max_and,max_or,max_xor);

}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
