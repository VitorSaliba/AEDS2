class exercicio7 {

    public static String converterLinha (String s){
        String resp = "";
        for(int i = 0; i < s.length(); i++){
            resp = resp + (char)(s.charAt(i) + 3);
        }
        return resp;
    }

    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do arquivo: "));
        
        String str = Arq.readAll();
        String cesar = "";

        cesar = converterLinha(str);

        Arq.close();

        System.out.println("O conteudo do seu arquivo cifrado eh: " + cesar);
    }
}
