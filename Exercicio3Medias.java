package academy.devdojo.maratonajava.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3Medias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.println("Digite segunda nota: ");
        double nota02 = sc.nextDouble();
        System.out.println("Digite terceira nota: ");
        double nota03 = sc.nextDouble();


        String resultado;

        double mediaFinal = (nota01 + nota02 + nota03 ) /3;

        if (mediaFinal >= 7){
            resultado = "Parabéns Aprovado";
        }else if (mediaFinal < 7 && mediaFinal >= 4){
            resultado = "Vai pra recuperação";
        }else {
            resultado = "Reprovado, refaça sua vida";
        }

        System.out.printf("A média final é de: %.2f \n", mediaFinal);
        System.out.println("Situação do aluno: " + resultado);

        sc.close();

    }
}
