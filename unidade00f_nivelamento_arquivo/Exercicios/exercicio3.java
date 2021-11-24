class exercicio3 {
    public static void main (String [] args){
        Arq.openRead(MyIO.readString("Digite o nome do arquivo que deseja abrir: "));

        String str = Arq.readAll();
        String maiuscula = "";

        maiuscula = str.toUpperCase();

        Arq.close();

        System.out.println("O conteudo do seu arquivo em maiusculas eh: " + maiuscula);
    }
}
