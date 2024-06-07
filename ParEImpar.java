package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo maior que 0: ");
        int numero = sc.nextInt();
        int pares = 0;
        int impares = 0;

        if (numero <= 0) {
            System.out.println("Número inválido. Por favor, digite um número inteiro positivo maior que 0.");
        } else {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            System.out.println("Existem " + pares + " números pares até " + numero);
            System.out.println("Existem " + impares + " números ímpares até " + numero);
        }

        sc.close();
    }
}
