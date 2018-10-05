package com.entra21.java;

import java.util.HashMap;

public class Exemplo01 {

    public static void main(String[] args) {

        HashMap<String, Integer> idades = new HashMap<>();

        //Adiciona o valor na chave
        idades.put("Cleiton", 22);
        idades.put("Kleyton", 24);

        if (idades.containsKey("Kreyton")) {
            System.out.println("TEM KREYTON");
        } else {
            System.out.println("NÃO TEM KREYTON");
        }

        // GET pego as informações pela chave que é passada dentro do parentese
        int idade = idades.get("Kleyton");
        System.out.println("Idade do Kleiton: " + idade);

        //Altera o valor de acordo com chave
        idades.put("Kleyton", 27);

        //remove de acordo com a chave
        idades.remove("Kleyton");


    }
}
