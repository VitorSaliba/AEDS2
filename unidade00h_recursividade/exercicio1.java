class exercicio1 {

    public class Multiplicacao {
        int multiplicacao(int a, int b) {
            int resp = 0;

            if (b > 0) {
                resp = a + multiplicacao(a, b - 1);
            }
            return resp;
        }
    }

    public static void main(String[] args) {
        int a = 2, b = 2, resp = 0;
        resp = multiplicacao(a, b);
        System.out.println("A multiplicacao entre os numeros eh: " + resp);
    }
}
