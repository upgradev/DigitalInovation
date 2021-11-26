package com.br.aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        
        // metodos references

        // consumer
        // recebe um parametro e não retorna nada
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase ->  System.out.println(frase);
        imprimirUmaFrase.accept("Hello world");
        

    }
}