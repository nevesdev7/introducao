package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contagemNum = 0;
        System.out.println("Digite número desejado para aprender sobre sua tabuada");
        int num = sc.nextInt();

        System.out.println("Tabuada de: " + num + "\n");

        for (int i = 1; i <= 10 ; i++) {
            int som = num + i;
            System.out.println(num + "+" + i + "=" + som);
            contagemNum ++;
        }
        System.out.println("\n");
        for (int i = 1; i <= 10 ; i++) {
            int sub = num - i;
            System.out.println(num + "-" + i + "=" + sub);
            contagemNum++;
        }
        System.out.println("\n");
        for (int i = 1; i <= 10 ; i++) {
            int mult = num * i;
            System.out.println(num + "x" + i + "=" + mult);
            contagemNum++;
        }
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            if (num % i == 0) {
                int div = num / i;
                System.out.println(num + " / " + i + " = " + div);
                contagemNum++;
            }

        }

    }
}
