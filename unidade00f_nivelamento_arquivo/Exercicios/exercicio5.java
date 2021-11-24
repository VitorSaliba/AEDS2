class exercicio5 {
    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do primeiro arquivo: "));

        String str = Arq.readAll();
        String maiuscula = "";

        maiuscula = str.toUpperCase();

        Arq.close();

        Arq.openWrite(MyIO.readString("Digite o nome do segundo arquivo: "));

        Arq.println("" + maiuscula);

        Arq.close();
    }
}
