package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class LoopsNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagemNumero = 0;

        System.out.println("Digite uma sequência de números inteiros (Digite um número negativo para parar): ");
        int numero = sc.nextInt();

        while (numero >= 0) {
            if (numero > 0) {
                contagemNumero++; // Incrementa a contagem apenas se o número for positivo
            }
            numero = sc.nextInt();
        }

        System.out.println("Existem " + contagemNumero + " números positivos na sequência.");

        sc.close();
    }
}

