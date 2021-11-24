#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int maior(int vet[], int n){
    return maior(vet, n, 0);
}

int maior(int vet[], int n, int i){
    int resp;
    if (i == n - 1){
        resp = vet[n-1];
    }else{
        resp = maior(vet, n, i + 1);
        if(resp < vet[i]){
            resp = vet[i];
        }
    }
    return resp;
}