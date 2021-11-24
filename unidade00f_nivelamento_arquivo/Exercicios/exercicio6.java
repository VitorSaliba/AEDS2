class exercicio6 {
    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do primeiro arquivo: "));

        String str = Arq.readAll();
        String reverso = new StringBuilder(str).reverse().toString();

        Arq.close();

        Arq.openWrite(MyIO.readString("Digite o nome do segundo arquivo: "));

        Arq.println("" + reverso);

        Arq.close();
    }
}
