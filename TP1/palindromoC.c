#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define bool short
#define true 1
#define false 0
#define equals(a, b) (((strcmp(a, b) == 0) ? true : false))
#define NUMENTRADA 1000
#define TAMLINHA 1000

//repete a execução do programa ate que o usuário digite "FIM"
bool isFim(char *s){
    return(strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

//verifica se a palavra é um palindromo
bool verificarPalindromo(char *s){
    int meio = strlen(s) / 2;
    int indc = strlen(s) - 1;

    bool resp = true;

    for(int i = 0; i < meio; i++){
        resp = resp && (s[i] == s[indc]);
        indc--;
    }
    return resp;
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
        if(verificarPalindromo(entrada[i]) == true){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }
    }
}