package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class FibonacciSequencia {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Digite um número inteiro positivo: ");
                int numero = sc.nextInt();

                int numeroAnterior = 0;
                int numeroAtual = 1;

                System.out.println("Os primeiros números da sequência de Fibonacci até " + numero + " são:");
                System.out.print(numeroAnterior + " ");

                while (numeroAtual <= numero) {
                    System.out.print(numeroAtual + " ");

                    int proximoNumero = numeroAnterior + numeroAtual;
                    numeroAnterior = numeroAtual;
                    numeroAtual = proximoNumero;
                }

                sc.close();
            }
        }



