class exercicio6 {
    public static void main (String [] args){
        double salario = MyIO.readDouble("Entre com o valor do salario: ");
        double prestacao = MyIO.readDouble("Entre com o valor da prestacao: ");

        if(prestacao > (0.4 * salario)){
            System.out.println("O emprestimo nao pode ser concedido.");
        }else{
            System.out.println("O emprestimo sera concedido.");
        }
    }
}
