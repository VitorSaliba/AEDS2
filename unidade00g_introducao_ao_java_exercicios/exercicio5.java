class exercicio5 {
    public static void main (String [] args){
        int mandante = MyIO.readInt("Entre com o numero de gols do mandante: ");
        int visitante = MyIO.readInt("Entre com o numero de gols do visitante: ");

        if(mandante > visitante){
            System.out.println("O mandante foi o vencedor da partida!");
        }else if(visitante > mandante){
            System.out.println("O visitante foi o vencedor da partida!");
        }else{
            System.out.println("O jogo terminou empatado!");
        }
    }
}