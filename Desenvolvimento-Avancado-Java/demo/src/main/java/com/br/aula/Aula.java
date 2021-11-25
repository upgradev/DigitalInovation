package com.br.aula;

import java.util.function.UnaryOperator;

public class Aula {
    public static void main(String[] args) {
        // imperativo
        // int valor = 10;
        // int resultado = valor * 3;
        // System.out.println("Resultado: " + resultado);

        // funcional
        UnaryOperator<Integer> calcularValor = valor -> valor * 3;
        int valor = 20;
        System.out.println("Resultado: " + calcularValor.apply(valor));

      

    }
}