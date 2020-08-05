#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
	
    int n;
    scanf("%d", &n);
    //Complete the code to calculate the sum of the five digits on n.

    int no=n;
    int count=0;
    while(no>0)
    {
        no/=10;
        count++;
    }

    int sum=0;
    for(int i=0;i<count;i++)
    {
        int q=n/10;
        int r=n%10;
        sum+=r;
        n=q;
    }

    printf("%d \n",sum);
    return 0;
}

