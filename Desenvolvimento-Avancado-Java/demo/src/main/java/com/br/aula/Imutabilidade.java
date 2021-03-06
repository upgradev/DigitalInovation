package com.br.aula;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornoDobro = v -> v * 2;
        System.out.println(retornoDobro.apply(valor));
        System.out.println(valor);
    }    
}