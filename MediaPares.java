package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo (Use um número negativo para encerrar): \n");
        int numero = sc.nextInt();

        float somaPares = 0f;
        int quantidadeDePares = 0;

        while (numero >= 0) {
            if (numero % 2 == 0) {
                somaPares += numero;
                quantidadeDePares++;
            }
            numero = sc.nextInt();

        }

        float mediaDosPares = somaPares / quantidadeDePares;
        sc.nextLine();

        System.out.println("A quantidade de números pares é de: " + quantidadeDePares);
        System.out.println("A soma dos números pares é de: " + somaPares);
        System.out.printf("A média dos pares é de: %.2f", mediaDosPares);

        sc.close();

    }
}
