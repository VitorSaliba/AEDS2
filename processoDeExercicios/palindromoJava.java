public class palindromoJava {

    String palavra;

    public static boolean isFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I'
                && palavra.charAt(2) == 'M');
    }

    // verifica se a palavra é palindromo
    public static boolean verificarPalindromo(String palavra) {
        int e = 0, d = palavra.length() - 1;
        boolean palindromo = true;

        while (e <= d) {

            if (palavra.charAt(e) != palavra.charAt(d)) {
                palindromo = false;
            }
            e++;
            d--;

        }

        if (palindromo) {
            return palindromo;
        } else {
            return palindromo;
        }
    }

    public static void main(String[] args){
        String[] entrada = new String[1000];
        int numEntrada = 0;
    
        //leitura da entrada padrao
        do{
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //desconsiderar ultima linha contendo a palavra FIM

        for(int i = 0; i < numEntrada; i++){
            if(verificarPalindromo(entrada[i]))
                MyIO.println("SIM");
            else
                MyIO.println("NAO");
        }
    }
}