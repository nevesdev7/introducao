package academy.devdojo.maratonajava.introducao;

// + - * / % Operadores aritméticos
// < > <= >= == != Operadores relacionais
// && || ! Operadores lógicos
// = += -= *= /= %= Operadores de atribuição
public class Aula04Operadores {
    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01/(double)numero02;

        System.out.println("Valor: " + resultado + "\n");

        double mod = 21 % 2;
        System.out.println(mod + "\n");

        boolean isDezMaiorQue = 10 > 20;
        boolean isDezMenorQue = 10 < 20;
        boolean maiorOuIgual = 10 >= 20;
        boolean menorOuIgual = 10 <= 20;
        boolean dezIgual = 10 == 20;
        boolean dezDiferente = 10 != 20;

        System.out.println(isDezMaiorQue);
        System.out.println(isDezMenorQue);
        System.out.println(maiorOuIgual);
        System.out.println(menorOuIgual);
        System.out.println(dezIgual);
        System.out.println(dezDiferente);

        System.out.println("\n");

        int contador = 0;
        contador ++;
        ++contador;
        contador--;
        --contador;
        contador += 2;
        contador -= 1;
        contador *= 4;
        contador /= 2;
        contador %= 2;
        System.out.println(contador);




    }

}
