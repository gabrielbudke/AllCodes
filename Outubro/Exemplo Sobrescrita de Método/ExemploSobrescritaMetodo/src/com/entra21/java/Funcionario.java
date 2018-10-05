package com.entra21.java;

public class Funcionario {

    private String nome;
    private double valorHora;
    private int quantidadeHora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHora() {
        return quantidadeHora;
    }

    public void setQuantidadeHora(int quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public double calcularSalario(){
        return valorHora * quantidadeHora;
    }
}
