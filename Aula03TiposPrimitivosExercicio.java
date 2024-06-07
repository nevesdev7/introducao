package academy.devdojo.maratonajava.introducao;

/*
Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>
*/
public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {

        String nome = "Daniel Neves";
        String endereco = "Rua Cambixe, 40 - São José Operário";
        double salario = 5800.36;
        String data = "27/03/2024";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", \nconfirmo que recebi o salário de R$" + salario + ", na data " + data;

        System.out.println(relatorio);
    }

}
