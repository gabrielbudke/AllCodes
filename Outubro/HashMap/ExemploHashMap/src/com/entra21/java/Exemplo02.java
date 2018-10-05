package com.entra21.java;

import java.util.HashMap;
import java.util.Map;

public class Exemplo02 {
    public static void main(String[] args) {

        HashMap<Integer, Produto> produtos = new HashMap<>();

        Produto quarto = new Produto();
        quarto.setId(1);
        quarto.setNome("Quarto do Kleyton");
        quarto.setPreco(40_000);
        produtos.put(quarto.getId(), quarto);

        Produto quartoDaJenoveva = new Produto();
        quartoDaJenoveva.setId(2);
        quartoDaJenoveva.setNome("Quarto da Jenoveva");
        quartoDaJenoveva.setPreco(40_001);
        produtos.put(quartoDaJenoveva.getId(), quartoDaJenoveva);

        //foreach percorrendo o hashmap
        for (Map.Entry<Integer, Produto> produtoEntry : produtos.entrySet()) {
            int id = produtoEntry.getKey();
            Produto produto = produtoEntry.getValue();
            System.out.println(produto.getNome());

        }

        double soma = 0;
        for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
            soma += entry.getValue().getPreco();

        }

        System.out.println("Soma:" + soma);
    }


}
