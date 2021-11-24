class exercicio1 {
    public static void main (String [] args){
        Arq.openWrite(MyIO.readString("Digite o nome do arquivo em que deseja salvar a frase: "));

        Arq.println("Frase que vai ser salva no arquivo.");
        
        Arq.close();
    }
}