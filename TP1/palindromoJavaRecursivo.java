class palindromoJavaRecursivo {
    String palavra;

    //finaliza o programa quando FIM é digitado
    public static boolean isFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I'
                && palavra.charAt(2) == 'M');
    }

    //função recursiva para verificar se é palíndromo
    public static boolean isPalindromo(String palavra){
        return isPalindromo(palavra, 0);
    }
    
    //função para verificar se é palíndromo
    public static boolean isPalindromo(String palavra, int i){
        boolean resp;
        if(i >= palavra.length()/2){
            resp = true;
        }else if(palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)){
            resp = false;
        }else{
            resp = isPalindromo(palavra, i+1);
        }
        return resp;
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
            if(isPalindromo(entrada[i]))
                MyIO.println("SIM");
            else
                MyIO.println("NAO");
        }
    }
}
