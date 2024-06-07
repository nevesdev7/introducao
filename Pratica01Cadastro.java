package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

//Vou mostrar um cadastro simples

public class Pratica01Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println ("Nome Completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.println("Nome Social: ");
        String nomeSocial = sc.nextLine();

        System.out.println("Data de Nascimento: ");
        String dataNasc = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();

        sc.nextLine();//Para consumir uma nova linha
        /*O problema ocorre porque após ler um número usando sc.nextInt() para a idade, a leitura de uma linha seguinte
         usando sc.nextLine() pode capturar uma nova linha pendente deixada pelo nextInt(), fazendo com que pareça que
         não é possível inserir a opção de estado civil. Isso acontece porque o método nextInt() não consome a nova linha
         após a entrada do número. Para resolver esse problema, você pode adicionar um sc.nextLine() após sc.nextInt()
         para consumir a nova linha pendente antes de solicitar a opção de estado civil.*/

        // Verificando o estado civil
        System.out.println("Estado Civil: ");
        System.out.println("==================================================");

        System.out.println("1 - Casado\n");
        System.out.println("2 - Divorciado\n");
        System.out.println("3 - Solteiro\n");
        System.out.println("4 - Em união estável\n");
        System.out.println("5 - Viúvo\n");

        System.out.println("Digite opção para registrar seu estado civil: \n");
        String estadoCivil = "";
        String opcaoEstadoCivil = sc.nextLine();

        // Continuando com if-else para verificar o estado civil
        if (opcaoEstadoCivil.equals("1")) {
            estadoCivil = "Casado(a)";
        } else if (opcaoEstadoCivil.equals("2")) {
            estadoCivil = "Divorciado(a)";
        } else if (opcaoEstadoCivil.equals("3")) {
            estadoCivil = "Solteiro(a)";
        } else if (opcaoEstadoCivil.equals("4")) {
            estadoCivil = "Em uma união estável";
        } else if (opcaoEstadoCivil.equals("5")) {
            estadoCivil = "Viúvo(a)";
        } else {
            estadoCivil = "Opção inválida";
        }


        System.out.println("\n");

        // Verificando a renda mensal

        System.out.println("\nRenda Mensal");
        System.out.println("===================================================");

        System.out.println("1 - 1 a 2 salários mínimos");
        System.out.println("2 - 2 a 3 salários mínimos");
        System.out.println("3 - Acima de 3 salários mínimos");

        System.out.println("Digite opção para cadastrar sua renda mensal: ");
        String rendaMensal = "";
        String opcaoRendaMensal = sc.nextLine();

        if (opcaoRendaMensal.equals("1")) {
            rendaMensal = "1 a 2 salários mínimos";
        } else if (opcaoRendaMensal.equals("2")) {
            rendaMensal = "2 a 3 salários mínimos";
        } else if (opcaoRendaMensal.equals("3")) {
            rendaMensal = "Acima de 3 salários mínimos";
        } else {
            rendaMensal = "Opção inválida";
        }

        System.out.println("\n\n");

        System.out.println("CADASTRO SIMPLES\n");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Nome: " + nomeCompleto + " //  Nome social: " + nomeSocial + " Idade: " + idade);
        System.out.println("_____________________________________________________________________________");
        System.out.println("Ano de nascimento: " + dataNasc + " //  Estado Civil: " + estadoCivil);
        System.out.println("_____________________________________________________________________________");
        System.out.println("Renda Mensal: " + rendaMensal);


    }
}
