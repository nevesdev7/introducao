package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
import java.util.Locale;

public class ImcSwitch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite peso em kilos: ");
        double pesoKg = sc.nextDouble();

        System.out.println("Digite altura em cm: ");
        double alturaCm = sc.nextDouble();

        double calculoImc = pesoKg / (alturaCm * alturaCm);
        System.out.printf("Valor do cálculo do IMC: %.2f\n ", calculoImc);

        byte resultado;

        if (calculoImc <= 18){
            resultado = 1;
        }else if (calculoImc > 18 && calculoImc <= 24.9){
            resultado = 2;
        }else if (calculoImc >= 25 && calculoImc <= 39.9){
            resultado = 3;
        }else {
            resultado = 4;
        }
        switch (resultado){
            case 1:
                System.out.println("Abaixo demais");
                break;
            case 2:
                System.out.println("Peso ideal");
                break;
            case 3:
                System.out.println("Acima do Peso");
                break;
            case 4:
                System.out.println("Muito acima do peso");
                break;
        }

    }
}
