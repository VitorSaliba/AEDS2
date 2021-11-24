class TP01Q06 {
    
    //repete a execução do programa ate que o usuário digite "FIM"
    public static boolean isFim(String palavra) {
        return (palavra.length() == 3 && palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I'
                && palavra.charAt(2) == 'M');
    }

    //verifica se a palavra é composta somente por vogais
    public static boolean isVogal(String palavra){
        boolean resp = true;
        char c = ' ';
        for(int i = 0; i < palavra.length(); i++){
            c = palavra.charAt(i);
            if(c != 97 && c != 101 && c != 105 && c != 111 && c != 117 && 
            c != 65 && c != 69 && c != 73 && c != 79 && c != 85){
                resp = false;
            }
        }
        return resp;
    }

    //verifica se é composto apenas por consoantes
    public static boolean isConsoante(String palavra){
        boolean resp = true;
        char c = ' ';
        for(int i = 0; i < palavra.length(); i++){
            c = palavra.charAt(i);
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
    public static boolean isInteiro(String palavra){
        boolean resp = true;
        char c = ' ';
        for(int i = 0; i < palavra.length(); i++){
            c = palavra.charAt(i);
            if(c != 48 && c != 49 && c != 50 && c != 51 && c != 52 && 
            c != 53 && c != 54 && c != 55 && c != 56 && c != 57){
                resp = false;
            }
        }
        return resp;
    }

    //verifica se corresponde a um número real
    public static boolean isReal(String palavra){
        boolean resp = true;
        char c = ' ';
        boolean existePonto = false;
        for(int i = 0; i < palavra.length(); i++){
            c = palavra.charAt(i);
            if((c == 46 || c == 44)){
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

    public static void main (String [] args){
        String[] entrada = new String[1000];
        int numEntrada = 0;

        //leitura da entrada padrao
        do{
            entrada[numEntrada] = MyIO.readLine();
        }while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //desconsiderar ultima linha contendo a palavra FIM

        for(int i = 0; i < numEntrada; i++){
            if(isVogal(entrada[i]))
                MyIO.print("SIM ");
            else
                MyIO.print("NAO ");

            if(isConsoante(entrada[i]))
                MyIO.print("SIM ");
            else
                MyIO.print("NAO ");

            if(isInteiro(entrada[i]))
                MyIO.print("SIM ");
            else
                MyIO.print("NAO ");

            if(isReal(entrada[i]))
                MyIO.println("SIM ");
            else
                MyIO.println("NAO ");
            
        }
    }
}
