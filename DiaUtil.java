package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

//Utilizando o switch e dados os valores de 1 a 7, imprima se
// é dia útil ou final de semana
//considerando 1 como domingo

public class DiaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7: ");
        byte dia = sc.nextByte();

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}