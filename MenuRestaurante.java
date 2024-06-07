package academy.devdojo.maratonajava.introducao;
import java.util.Locale;
import java.util.Scanner;

//Café - R$ 3,50
//Chá - R$ 2,50
//Suco de Laranja - R$ 5,00
//Refrigerante - R$ 4,00

public class MenuRestaurante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("MENU\n");
        System.out.println("1 - Café____________________R$ 3,50");
        System.out.println("2 - Chá____________________R$ 2,50");
        System.out.println("3 - Suco de Laranja____________________R$ 5,00");
        System.out.println("4 - Refrigerante____________________R$ 4,00\n");

        System.out.println("Escolha um número de 1 a 4 conforme Menu, para realizar seu pedido!");

        System.out.println("Digite opção: ");
        int opcao = sc.nextInt();

        System.out.println("Você digitou a opção " + opcao);

        switch (opcao){
            case 1:
                System.out.println("Seu pedido é: Café");
                break;
            case 2:
                System.out.println("Seu pedido é: Chá");
                break;
            case 3:
                System.out.println("Seu pedido é: Suco de Laranja");
                break;
            case 4:
                System.out.println("Seu pedido é: Refrigerante");
                break;
            default:
                System.out.println("Opção inválida\n");
                break;
        }
        sc.close();




    }
}
