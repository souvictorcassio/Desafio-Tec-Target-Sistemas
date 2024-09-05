public class Desafio3 {
    public static void main(String[] args) {
        int indice = 12, soma = 0, k = 0;

        while (k <  indice) {
            k++;
            soma += k;

            System.out.println(soma);
        }

        System.out.println("O valor final de soma é " + soma);
    }
}