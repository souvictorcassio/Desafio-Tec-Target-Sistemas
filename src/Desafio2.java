import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int letraA = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase qualquer: ");
        String frase = scanner.nextLine();
        scanner.close();

        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
                letraA++;
            }
        }

        System.out.printf("A letra 'a' apareceu " + letraA + " vezes");
    }
}
