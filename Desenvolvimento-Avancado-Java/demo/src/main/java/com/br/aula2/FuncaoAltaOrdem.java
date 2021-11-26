package com.br.aula2;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {

        Calcular SOMA = (a, b) -> a + b;
        Calcular SUBTRACAO = (a, b) -> a - b;
        Calcular DIVISAO = (a, b) -> a / b;
        Calcular MULT = (a, b) -> a * b;

        System.out.println(executarOperacao(SOMA, 1, 3));
        System.out.println(executarOperacao(SUBTRACAO, 4, 3));
        System.out.println(executarOperacao(DIVISAO, 4, 2));
        System.out.println(executarOperacao(MULT, 7, 3));

    }

    public static int executarOperacao(Calcular calculo, int a, int b) {
        return calculo.calculo(a, b);
    }
}

@FunctionalInterface
interface Calcular {
    public int calculo(int a, int b);
}