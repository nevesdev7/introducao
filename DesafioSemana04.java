package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

//Sequencia de Fibonacci
public class DesafioSemana04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro que seja positivo: ");
        int numero = sc.nextInt();

        int numeroAnterior = 0;
        int numeroAtual = 1;

        System.out.println("Os primeiros numeros da sequencia de Fibonacci de " + numero + " são: ");
        System.out.print(numeroAnterior + " ");


        while (numeroAtual <= numero){
            System.out.print(numeroAtual + " ");

            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
        sc.close();
    }
}
