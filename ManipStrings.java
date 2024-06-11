package academy.devdojo.maratonajava.introducao;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;


public class ManipStrings {
    public static void main(String[] args) {
        // OLá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Daniel";

        // ISO 8601 - Padrão mundial de datas

        LocalDate hoje = LocalDate.now (); // recupera a data atual
        Locale brasil = new Locale("pt", "BR");

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil); // Traduzir o dia para pt
        // Estilo do texto FULL, brasil (brasil ta escrito no Locale)
        String saudacao;

        LocalDateTime agora = LocalDateTime.now(); //Obtem a informação da hora
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        }else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        }else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s. %n", nome, diaSemana, saudacao.toUpperCase());


    }
}
