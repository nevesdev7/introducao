package academy.devdojo.maratonajava.introducao;

public class TabuadaVezes {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) { // vai rodar 10 vezes aqui antes de pular pro proximo i.
                System.out.println(j + " x " + i + " = " + j*i);

            }
            System.out.println(" ");

        }

    }
}
