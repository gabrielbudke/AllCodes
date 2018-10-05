package com.entra21.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Pizza>> categorias = new HashMap<>();

        Pizza pizzaVegana0 = new Pizza();
        pizzaVegana0.setNome("Brócolis com champignon");
        pizzaVegana0.setCategoria("Vegana");

        Pizza pizzaVegana1 = new Pizza();
        pizzaVegana1.setNome("Rúcula com tomate seco");
        pizzaVegana1.setCategoria("Vegana");

        Pizza pizzaGordo0 = new Pizza();
        pizzaGordo0.setNome("Calabria com bacon");
        pizzaGordo0.setCategoria("Gordo");

        Pizza pizzaGordo1 = new Pizza();
        pizzaGordo1.setNome("Calabria com catupiry");
        pizzaGordo1.setCategoria("Gordo");

        Pizza pizzaGordo2 = new Pizza();
        pizzaGordo1.setNome("Cleiton");
        pizzaGordo1.setCategoria("Gordo");


        ArrayList<Pizza> pizzasDoGordo = new ArrayList<>();
        pizzasDoGordo.add(pizzaGordo0);
        pizzasDoGordo.add(pizzaGordo1);
        pizzasDoGordo.add(pizzaGordo2);

        ArrayList<Pizza> pizzasVeganas = new ArrayList<>();
        pizzasVeganas.add(pizzaVegana0);
        pizzasVeganas.add(pizzaVegana1);

        categorias.put("Gordo", pizzasDoGordo);
        categorias.put("Vegana", pizzasVeganas);

    }

}
