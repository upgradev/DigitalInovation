package com.example.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamApi {
    public static void main(String[] args) {

        // cria a coleção
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("retorna a contagem do stream");
        System.out.println("Contagem: " + estudantes.stream().count());
        System.out.println();

        System.out.println("retorna o elemento com maior numero de letra");
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println();

        System.out.println("retorna o elemento com menor numero de letra");
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println();

        System.out.println("retorna o elemento que tem a letra r no nome");
        System.out.println(estudantes.stream().filter(estudante -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream()
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .collect(Collectors.toList()));
        System.out.println();

        System.out.println(
                "Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println();

        // Exibe cada elemento no console, e depois retorna a mesma coleção
        System.out.println(
                "Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println();
        // Exibe cada elemento no console sem retornar outra coleção
        System.out.print("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);
        System.out.println();

        // Retorna true se todos os elementos possuem a letra W no nome
        System.out.println("Tem algum elemento com W no nome? "
                + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));
        System.out.println();

        // Retorna true se algum os elementos possuem a letra a minúscula no nome
        System.out.println("Tem algum elemento com a minúscula no nome? "
                + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));
        System.out.println();
        // Retorna true se nenhum elemento possuem a letra a minúscula no nome
        System.out.println("Não tem nenhum elemento com a minúscula no nome? "
                + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));
        System.out.println();
        // Retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.print("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        System.out.println();
        // Exemplo de operação encadeada
        System.out.print("Operaçõa encadeada: ");
        System.out.println(estudantes.stream().peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println).filter((estudante) -> estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
        // .collect(Collectors.joining(", ")));
        // .collect(Collectors.toSet()));
        // .collect(Collectors.groupingBy(estudante ->
        // estudante.substring(estudante.indexOf("-") + 1))));

    }
}