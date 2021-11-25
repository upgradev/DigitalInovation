package com.example.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {
        
        TreeSet<String> treeCapitais = new TreeSet<>();

        // monta a arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianopolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // retorna a primeira capital no topo da arvore
        System.out.println("primeira capital no topo da arvore: " + treeCapitais.first());

        System.out.println("ultima capital no final da arvore: " + treeCapitais.last());

        // retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println("primeira capital abaixo na arvore da capital parametrizada: ");
        System.out.println(treeCapitais.lower("Florianopolis"));

        System.out.println("primeira capital acima na arvore da capital parametrizada: ");
        System.out.println(treeCapitais.higher("Florianopolis"));

        System.out.println("todas as capitais no console");
        System.out.println(treeCapitais);

        System.out.println("Primeira capital no topo da arvore, removendo do set");
        System.out.println(treeCapitais.pollFirst());

        System.out.println("Primeira capital no final da arvore, removendo do set");
        System.out.println(treeCapitais.pollLast());

        System.out.println("todas as capitais no console");
        System.out.println(treeCapitais);

        System.out.println("Iterator");
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
    
}