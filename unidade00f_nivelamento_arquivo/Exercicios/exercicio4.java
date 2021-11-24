class exercicio4 {
    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do primeiro arquivo: "));
        
        String str = Arq.readAll();

        Arq.close();

        Arq.openWrite(MyIO.readString("Digite o nome do segundo arquivo: "));

        Arq.println("" + str);

        Arq.close();
    }
}
