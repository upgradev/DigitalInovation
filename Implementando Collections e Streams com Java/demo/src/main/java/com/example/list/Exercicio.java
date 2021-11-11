package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println(nomes.get(1));
        nomes.remove("João");
        System.out.println(nomes);
        System.out.println("tamanh-> " + nomes.size());
        boolean existeNome = nomes.contains("Juliano");
        System.out.println(existeNome);

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes.addAll(nomes2);
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("esta vazia? " + nomes.isEmpty());


    }

}