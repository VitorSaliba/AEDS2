class exercicio9 {
    public static void main (String [] args){
        int n = MyIO.readInt("Entre com um numero: ");
        int sequencia = 1;

        while(sequencia < n){
            System.out.println(sequencia+4);
            sequencia+=7;
        }
    }
}
