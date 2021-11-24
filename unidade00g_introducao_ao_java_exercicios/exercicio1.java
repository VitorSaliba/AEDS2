class exercicio1 {
    public static void main(String[] args) {

        int lado1 = MyIO.readInt("Entre com o primeiro lado: ");
        int lado2 = MyIO.readInt("Entre com o segundo lado: ");
        int lado3 = MyIO.readInt("Entre com o terceiro lado: ");

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado2 + lado1)) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                System.out.println("Triangulo Isosceles");
            } else {
                System.out.println("Triangulo Escaleno");
            }
        } else {
            System.out.println("Nao eh um triangulo");
        }
    }
}
