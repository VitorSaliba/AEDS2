#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#define equals(a, b) (((strcmp(a, b) == 0) ? true : false))
#define NUMENTRADA 1000
#define TAMLINHA 1000

//repete a execução do programa ate que o usuário digite "FIM"
bool isFim(char *s){
    return(strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

//verifica se a palavra é composta somente por vogais
bool isVogal(char palavra []){
    bool resp = true;
    char c = ' ';
    for(int i = 0; i < strlen(palavra); i++){
        c = palavra[i];
        if(c != 97 && c != 101 && c != 105 && c != 111 && c != 117 && 
           c != 65 && c != 69 && c != 73 && c != 79 && c != 85){
            resp = false;
        }
    }
    return resp;
}

//verifica se a palavra é composta somente por consoantes
bool isConsoante(char palavra []){
    bool resp = true;
    char c = ' ';
    for(int i = 0; i < strlen(palavra); i++){
        c = palavra[i];
        if(c != 98 && c != 99 && c != 100 && c != 102 && c != 103 && 
        c != 104 && c != 106 && c != 107 && c != 108 && c != 109 &&
        c != 110 && c != 112 && c != 113 && c != 114 && c != 115 && c != 116 && 
        c != 118 && c != 119 && c != 120 && c != 121 && c != 122 && 
        c != 66 && c != 67 && c != 68 && c != 70 && c != 71 && c != 72 &&
        c != 74 && c != 75 && c != 76 && c != 77 && c != 78 && c != 80 &&
        c != 81 && c != 82 && c != 83 && c != 84 && c != 86 && c != 87 &&
        c != 88 && c != 89 && c != 90){
            resp = false;
        }
    }
    return resp;
}

//verifica se corresponde a um número inteiro
bool isInteiro(char palavra []){
    bool resp = true;
    char c = ' ';
    for(int i = 0; i < strlen(palavra); i++){
        c = palavra[i];
        if(c != 48 && c != 49 && c != 50 && c != 51 && c != 52 && 
        c != 53 && c != 54 && c != 55 && c != 56 && c != 57){
            resp = false;
        }
    }
    return resp;
}

//verifica se corresponde a um número real
bool isReal(char palavra []){
    bool resp = true;
    char c = ' ';
    bool existePonto = false;
    for(int i = 0; i < strlen(palavra); i++){
        c = palavra[i];
        if(c == 46 || c == 44){
            if(existePonto == false){
                existePonto = true;
            }else{
                resp = false;
            }
        }
        else if(c != 48 && c != 49 && c != 50 && c != 51 && c != 52 && 
            c != 53 && c != 54 && c != 55 && c != 56 && c != 57){
                resp = false;
        }
    }
    return resp;
}

int main(int argc, char **argv){
    char entrada[NUMENTRADA][TAMLINHA];
    int numEntrada = 0;

    //leitura da entrada padrao
    do{
        fgets(entrada[numEntrada], TAMLINHA, stdin);
        entrada[numEntrada][strcspn(entrada[numEntrada], "\n")] = '\0'; //eliminar espaços em branco
    }while (isFim(entrada[numEntrada++]) == false);

    numEntrada--; //desconsiderar ultima linha contendo a palavra FIM

    for(int i = 0; i < numEntrada; i++){
        if(isVogal(entrada[i]) == true){
            printf("SIM ");
        }else{
            printf("NAO ");
        }

        if(isConsoante(entrada[i]) == true){
            printf("SIM ");
        }else{
            printf("NAO ");
        }

        if(isInteiro(entrada[i]) == true){
            printf("SIM ");
        }else{
            printf("NAO ");
        }

        if(isReal(entrada[i]) == true){
            printf("SIM\n");
        }else{
            printf("NAO\n");
        }    
    }
}