package academy.devdojo.maratonajava.introducao;

public class ArrayMedia {
    public static void main(String[] args) {
        int [] numeros = {9,10,12,25,2};
        int maior = numeros [0]; // valor da primeira posição, será referencia para os calculos
        int menor = numeros [0];
        int media = 0;

// Loop para percorrer os elementos do array

        for (int i = 0; i < numeros.length; i++) {
        //Se o elemento atual numeros[i] for maior que o valor atual de maior, então maior é atualizado para numeros[i].
            if (numeros[i] > maior) {
                maior = numeros[i];
        //Se o elemento atual numeros[i] for menor que o valor atual de menor, então menor é atualizado para numeros[i].
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            // media é usada como variavel acumuladora
            media += numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length); // numero de elementos (tamanho)
    }

}
