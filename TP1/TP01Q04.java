import java.util.Random;

class TP01Q04 {

    //finaliza o programa quando FIM é digitado
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
    }

    //função para realizar a alteração de uma letra pela outra
    public static String alteraString(String frase, char primeiro, char segundo){
        String resp = "";
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == primeiro){
                resp += segundo;
            }else{
                resp += frase.charAt(i);
            }
        }
        return resp;
    }

    public static void main(String[] args) {
        String[] entrada = new String[1000];
        int numEntrada = 0;
    
        //leitura da entrada padrao
        do{
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //desconsiderar ultima linha contendo a palavra FIM
        
        Random gerador = new Random();
        gerador.setSeed(4);

        //looping para realizar a alteração das letras através da função alteraString por letras geradas de forma aleatória
        for(int i = 0; i < numEntrada; i++){
            char primeiro = ((char) ('a' + Math.abs(gerador.nextInt() % 26)));
            char segundo = ((char) ('a' + Math.abs(gerador.nextInt() % 26)));
            MyIO.println(alteraString(entrada[i], primeiro, segundo));
        }
    }

}