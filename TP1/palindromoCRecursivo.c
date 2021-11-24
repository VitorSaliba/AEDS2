#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define true 1
#define false 0
#define equals(a, b) (((strcmp(a, b) == 0) ? true : false))
#define NUMENTRADA 1000
#define TAMLINHA 1000

//repete a execução do programa ate que o usuário digite "FIM"
bool isFim(char *s){
    return(strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

bool isPalindromo2(char s[], int i){
    bool resp;
    if (i >= strlen(s)/2){
        resp = true;
    }else if(s[i] != s[strlen(s)-1-i]){
        resp = false;
    }else{
        resp = isPalindromo2(s, i+1);
    }
    return resp;
}

bool isPalindromo(char s[]){
    return isPalindromo2(s, 0);
}

int main(int argc, char **argv){
    char entrada[NUMENTRADA][TAMLINHA];
    int numEntrada = 0;

    do{
        fgets(entrada[numEntrada], TAMLINHA, stdin);
        entrada[numEntrada][strcspn(entrada[numEntrada], "\n")] = '\0'; //eliminar espaços em branco
    }while (isFim(entrada[numEntrada++]) == false);

    numEntrada--;

    for(int i = 0; i < numEntrada; i++){
        if(isPalindromo(entrada[i]) == true){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }
    }
}