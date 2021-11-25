package com.br.aula;

public class LambdaClasse {

    public static void main(String[] args) {
        // implementando interface funcional
        // Funcao gerarUmaSaida = valor -> valor;

        Funcao funcao1 = valor -> valor;
        System.out.println(funcao1.gerar("Hello world"));

    }

}

// interface funcional
@FunctionalInterface
interface Funcao {
    String gerar(String valor);

}