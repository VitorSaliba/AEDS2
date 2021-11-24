#include <stdio.h>
#include <stdlib.h>

int main(){
    int n;
    scanf("%d", &n);
    double num;

    FILE *arquivo;
    arquivo = fopen("arquivo.txt", "w");
    for(int i = 0; i < n; i++){
        scanf("%lf", &num);
        //printf("%ld - \n", ftell(arquivo));
        fseek(arquivo, (i * 11), SEEK_SET);
        fprintf(arquivo, "%lf\n", num);
    }
    fclose(arquivo);

    FILE *arquivo2;
    arquivo2 = fopen("arquivo.txt", "r");
    for(int i = 0; i < n; i++){
        fseek(arquivo2, (n-1-i) * 11, SEEK_SET);
        fscanf(arquivo, "%lf", &num);
        printf("%g\n", num);
    }
    fclose(arquivo2);
    return 0;
}