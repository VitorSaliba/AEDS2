#include <stdio.h>
int multiplicacao(int a, int b){

    int resp = 0;

    if (b > 0)
    {
        resp = a + multiplicacao(a, b - 1);
    }
    return resp;
}

int main(){
    int a = 2, b = 2, resp = 0;
    resp = multiplicacao(a, b);
    printf("A multiplicacao entre %d e %d eh: %d\n", a, b, resp);
}