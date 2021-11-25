package com.example.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {
        
        Set<Double> notasAlunos = new HashSet<>();

        // adicionando notas
        notasAlunos.add(5.8);
        notasAlunos.add(3.5);
        notasAlunos.add(9.5);
        notasAlunos.add(2.3);
        notasAlunos.add(10.0);
        notasAlunos.add(6.5);

        System.out.println(notasAlunos);

        // remover a nota
        notasAlunos.remove(3.5);

        System.out.println(notasAlunos);

        // retornar a quantidade de itens
        System.out.println(notasAlunos.size());

        // navegas pelos itens pelo iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---------------");
        for (Double nota : notasAlunos) {
            System.out.println(nota);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());

    }
    
}