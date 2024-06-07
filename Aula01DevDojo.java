package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;
import java.util.Locale;


public class Aula01DevDojo {

    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println(nome);

        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();

        sc.close();

    }
}