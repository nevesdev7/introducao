package academy.devdojo.maratonajava.introducao;

public class FunSemParametro02 {
    public static void main(String[] args) {
        mensagem();
        conta();
    }

    public static void conta() { //Função que calcula a media
        double media = 20/5.0;
        System.out.println("20 / 5 = " + media);
    }

    public static void mensagem() { // imprime mensagem
        System.out.println("Esse é um cálculo de média");

    }
}
