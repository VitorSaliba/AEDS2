import java.util.Scanner;
class exercicio4 {
    public static void main (String [] args){
        int num1 = MyIO.readInt("Entre com o primeiro numero: ");
        int num2 = MyIO.readInt("Entre com o segundo numero: ");
        int soma = 0;
        int subtracao = 0;
        int divisao = 0;

        if(num1 > 45 || num2 > 45){
            soma = num1 + num2;
            System.out.println("Soma: " + soma);
        }else if(num1 > 20 && num2 > 20){
            if(num1 > num2){
                subtracao = num1 - num2;
                System.out.println("Subtracao: " + subtracao);
            }else{
                subtracao = num2 - num1;
                System.out.println("Subtracao: " + subtracao);
            }
        }else if(num1 < 10 || num2 < 10 && num1 != 0 || num2 != 0){
            divisao = num1 / num2;
            System.out.println("Divisao: " + divisao);
        }else{
            System.out.println("Vitor Menezes Saliba");
        }
    }
}