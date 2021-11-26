package com.br.aula2;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        
        Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String,  Integer> converterStringInteiro = string -> Integer.valueOf(string);
        Function<String,  Integer> converterStringInteiroCalcularDobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornarNomeAoContrario.apply("joao"));
        System.out.println(converterStringInteiro.apply("20"));
        System.out.println(converterStringInteiroCalcularDobro.apply("20"));

    }    
}