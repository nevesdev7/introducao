package academy.devdojo.maratonajava.introducao;

public class calculoImc {
    public static void main(String[] args) {

        double pesoKg = 106.0;
        double alturaCm = 1.78;
        String imc;
        double calculoImc = pesoKg/(alturaCm*alturaCm);

        if (calculoImc < 18.5){
            imc = "Abaixo do peso";
        }else if (calculoImc >= 18.5 && calculoImc <= 24.9){
            imc = "Peso normal";
        }else if (calculoImc >= 25.0 && calculoImc <= 29.9){
            imc= "Sobrepeso";
        }else if (calculoImc >= 30 && calculoImc <= 34.9){
            imc = "Obesidade grau 1";
        }else if (calculoImc >= 35 && calculoImc <= 39.9){
            imc = "Obesidade grau 3 (severa)";
        }else {
            imc = "Obesidade grau 3 (mórbida)";
        }

        System.out.printf("\nO IMC é de: %.2f \n", calculoImc);
        System.out.println("Nível IMC: " + imc);

    }
}