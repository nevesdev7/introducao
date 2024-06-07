package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salarioEuroAnual = 85000.00d;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioEuroAnual <= 34712.00){
            valorImposto = salarioEuroAnual * primeiraFaixa;
        }else if (salarioEuroAnual >= 34713.00 && salarioEuroAnual <= 68507.00){
            valorImposto = salarioEuroAnual * segundaFaixa;
        }else {
            valorImposto = salarioEuroAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);


    }
}
