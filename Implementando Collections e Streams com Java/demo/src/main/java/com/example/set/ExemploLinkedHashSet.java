package com.example.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // adicionar
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(2);

        System.out.println("sequenciaNumerica: " + sequenciaNumerica);
        // remover
        sequenciaNumerica.remove(4);

        System.out.println("sequenciaNumerica: " + sequenciaNumerica);

        // quantidade
        System.out.println("sequenciaNumerica qtde: " + sequenciaNumerica.size());

        // navegar iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------");
        for (Integer numero : sequenciaNumerica) {
            System.out.println(numero);
        }

        System.out.println("Esta vazia? " + sequenciaNumerica.isEmpty());
    }
}