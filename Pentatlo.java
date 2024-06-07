package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
import java.util.Locale;

public class Pentatlo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de inscrição do atleta: ");
        int x = sc.nextInt();

        System.out.println("Digite a nota do atleta");
        int [] n = new int[5];

        n [0] = sc.nextInt();
        n [1] = sc.nextInt();
        n [2] = sc.nextInt();
        n [3] = sc.nextInt();
        n [4] = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < n.length; i++) {
           soma += n[i];

        }

        float mediaDoAtleta = soma / 5;
        System.out.printf("A média do atleta %d é de %.1f \n", x, mediaDoAtleta);

    }
}
