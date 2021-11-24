#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main(int argc, char *argv[])
{
    int ano, vezes;

    do
    {
        scanf("%d", &ano);
        if (ano > 0)
        {
            vezes = (int)(ano - 10) / 76;
            vezes++;
            printf("%d\n", vezes * 76 + 10);
        }
    }while(ano > 0);

    return 0;
}