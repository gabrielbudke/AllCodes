package com.entra21.java;

public class Calculadora {


    // Sobre carga de metodo é quando tem dois metodos com o mesmo nome mas com parametros diferentes
    public void somar(int numero1, int numero2) {
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

    }


    public void somar(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);
    }





}
