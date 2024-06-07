package academy.devdojo.maratonajava.introducao;
import java.util.Locale;

//Dado o valor de um carro, descubra em quantas vezes
// ele pode ser parcelado
// condição valorParcela >= 1000
public class DesafioSemana03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000){
                break;
            }
            System.out.printf("Parcela %d - Valor: R$ %.2f \n ", parcela, valorParcela);

        }

    }
}
