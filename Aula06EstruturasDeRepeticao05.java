package academy.devdojo.maratonajava.introducao;
import java.util.Locale;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1 ; parcela--) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                continue;
            }
            System.out.printf("Parcela %d - Valor R$ %.2f\n", parcela, valorParcela);

        }
    }
}