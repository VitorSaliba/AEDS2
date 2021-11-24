#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int contMaiusculo(char s[])
{
    return contMaiusculo2(s, 0);
}

int contMaiusculo2(char s[], int i)
{
    int cont = 0;
    if (i < strlen(s))
    {
        if (isUpper(strlen(i)) == true)
        {
            cont++;
        }
        cont += contMaiusculo2(s, i + 1);
    }
    return cont;
}