#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
#include <stdbool.h>
#define NUMENTRADA 1000
#define TAMLINHA 1000

//repete a execução do programa ate que o usuário digite "FIM"
bool isFim(char *s){
    return(strlen(s) >= 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M');
}

typedef struct Serie{
    char nome [30];
    char formato [30];
    char duracao [30];
    char paisDeOrigem [30];
    char idiomaOriginal [30];
    char emissoraDeTelevisao [30];
    char transmissaoOriginal [30];
    int numeroTemporadas;
    int numeroEpisodios;
}Serie;

void inicializa(Serie * s){
    strcpy(s -> nome, "");
    strcpy(s -> formato, "");
    strcpy(s -> duracao, "");
    strcpy(s -> paisDeOrigem, "");
    strcpy(s -> idiomaOriginal, "");
    strcpy(s -> emissoraDeTelevisao, "");
    strcpy(s ->transmissaoOriginal, "");
    s -> numeroTemporadas;
    s -> numeroEpisodios;
}

void setNome(Serie * s, char n []){
    strcpy(s -> nome, n);
}

void getNome(Serie s){
    return s.nome;
}

void setFormato(Serie * s, char f []){
    strcpy(s -> formato, f);
}

void setDuracao(Serie * s, char d []){
    strcpy(s -> duracao, d);
}

void setPaisDeOrigem(Serie * s, char p []){
    strcpy(s -> paisDeOrigem, p);
}

void setIdiomaOriginal(Serie * s, char i []){
    strcpy(s -> idiomaOriginal, i);
}

void setEmissoraDeTelevisao(Serie * s, char e []){
    strcpy(s -> emissoraDeTelevisao, e);
}

void setTransmissaoOriginal(Serie * s, char t []){
    strcpy(s -> transmissaoOriginal, t);
}

void setNumeroTemporadas(Serie * s, int temp){
    s -> numeroTemporadas = temp;
}

void setNumeroEpisodios(Serie * s, int eps){
    s -> numeroEpisodios = eps;
}

char * removeTag(char * tagCompleta){
    int i = 0;
    int j = 0;
    int posicaoResposta = 0;
    char * resp = (char*) malloc (sizeof(strlen(tagCompleta)));
    for(i = 0; i < strlen(tagCompleta); i++){
        if(tagCompleta[i] == '>' && i+1 < strlen(tagCompleta) && tagCompleta[i+1] != '<'){
            j = i + 1;
            while(tagCompleta[j] != '<'){
                resp[posicaoResposta] = tagCompleta[j];
                posicaoResposta++;
                j++;
            }
        }
    }
}

int extraiNumero(char * tagCompleta){
    int i = 0;
    int j = 0;
    int posicaoResposta = 0;
    char * resp = (char*) malloc (sizeof(strlen(tagCompleta)));
    for(i = 0; i < strlen(tagCompleta); i++){
        if(tagCompleta[i] == '>' && i+1 < strlen(tagCompleta) && tagCompleta[i+1] != '<'){
            j = i + 1;
            while(tagCompleta[j] != '<' && tagCompleta[j] != ' '){
                resp[posicaoResposta] = tagCompleta[j];
                posicaoResposta++;
                j++;
            }
        i = strlen(tagCompleta);
        }
    }
    int resposta = atoi(resp);
    return resp;
}

void ler(char * nomeArquivo, Serie * s){
    FILE *fp = fopen(nomeArquivo, "r");
    char linha [3000];
    fgets(linha, 3000, fp);
    while(!strstr(linha, "infobox")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> nome, removeTag(linha)); //passar a linha ja limpa

    while(!strstr(linha, "Formato")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> formato, linha); //passar a linha ja limpa

    while(!strstr(linha, "Duração")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> duracao, linha); //passar a linha ja limpa

    while(!strstr(linha, "País de origem")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> paisDeOrigem, linha); //passar a linha ja limpa

    while(!strstr(linha, "Idioma original")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> idiomaOriginal, linha); //passar a linha ja limpa

    while(!strstr(linha, "Emissora de televisão original")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> emissoraDeTelevisao, linha); //passar a linha ja limpa

    while(!strstr(linha, "Transmissão original")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    strcpy(s -> transmissaoOriginal, linha); //passar a linha ja limpa

    while(!strstr(linha, "N.º de temporadas")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    s -> numeroTemporadas = extraiNumero(linha); //passar a linha ja limpa

    while(!strstr(linha, "N.º de episódios")){
       fgets(linha, 3000, fp);
    }
    fgets(linha, 3000, fp);
    //limpar a tag e limpar o atributo
    s -> numeroEpisodios = extraiNumero(linha); //passar a linha ja limpa
}

void imprimir(Serie s){
    printf("%s %s %s %s %s %s %s %d %d", s.nome, s.formato, s.duracao, s.paisDeOrigem, s.idiomaOriginal, s.emissoraDeTelevisao, s.transmissaoOriginal, s.numeroTemporadas, s.numeroEpisodios);
}

int main(){
    
    char entrada[NUMENTRADA][TAMLINHA];
    int numEntrada = 0;
    Serie s1;
    char * caminho;

    do{
        fgets(entrada[numEntrada], TAMLINHA, stdin);
        entrada[numEntrada][strcspn(entrada[numEntrada], "\n")] = '\0'; //eliminar espaços em branco
    }while (isFim(entrada[numEntrada++]) == false);

    numEntrada--;

    for(int i = 0; i < numEntrada; i++){
        inicializa(&s1);
        strcpy(caminho, "");
        strcat(caminho, "/tmp/series/");
        strcat(caminho, entrada);
        ler(entrada[i], &s1);
        imprimir(s1);
    }
    return 0;
}