#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int max (int a, int b, int c){
    int resp;
    if(a > b && a > c){
        resp = a;
    }else if(b > a && b > c){
        resp = b;
    }else{
        resp = c;
    }
    return resp;
}

int main()
{
    int m, a, b;

    do
    {
        scanf("%d", &m);
        if(m > 0){
            scanf("%d", &a);
            scanf("%d", &b);
            
            int c = m - (a + b);

            int resp = max(a, b, c);

            printf("%d\n", resp);
        }
    }while (m > 0);
}