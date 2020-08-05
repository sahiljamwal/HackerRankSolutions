#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, *arr, i;
    scanf("%d", &num);
    arr = (int*) malloc(num * sizeof(int));
    for(i = 0; i < num; i++) {
        scanf("%d", arr + i);
    }


    /* Write the logic to reverse the array. */
    int ans[num];
    int index=0;
    for(int i=num-1;i>=0;i--)
    {
        ans[index]=arr[i];
        index++;
    }

    for (int i = 0; i<num; i++)
     {
      arr[i]=ans[i];
    }

    for(i = 0; i < num; i++)
        printf("%d ", *(arr + i));
    return 0;
}

