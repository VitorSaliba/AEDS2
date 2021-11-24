class exercicio2 {
    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do arquivo que deseja abrir: "));

        String str = Arq.readAll();

        Arq.close();

        System.out.println("O conteudo do seu arquivo eh: " + str);
    }
}
