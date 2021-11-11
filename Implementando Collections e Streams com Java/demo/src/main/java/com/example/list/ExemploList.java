package com.example.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        // alterar conteudo de uma posicao index
        nomes.set(2, "Larissa");

        System.out.println(nomes);

        // ordenar
        Collections.sort(nomes);
        System.out.println(nomes);
        // alterar conteudo de uma posicao index
        nomes.set(2, "Wesley");

        System.out.println(nomes);

        // remove
        nomes.remove(4); // pela posicao
        System.out.println(nomes);
        nomes.remove("Wesley"); // pelo objeto
        System.out.println(nomes);

        // get recebe inteiro da posicao e retorna o valor
        String nome = nomes.get(3);
        System.out.println(nome);

        // size tamanho
        int tamanho = nomes.size();
        System.out.println(tamanho);
        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        // contains retorna se tem na lista boolean
        boolean temNaLista = nomes.contains("Anderson");
        System.out.println(temNaLista);
        temNaLista = nomes.contains("fernando");
        System.out.println(temNaLista);

        // isEmpty
        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        // clean limpa lista
        // nomes.clear();
        listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        // indexOf saber o index na lista, -1 se não existe
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);
        posicao = nomes.indexOf("ana");
        System.out.println(posicao);

        for (String nome2 : nomes) {
            System.out.println("---> " + nome2);
        }

        Iterator<String> iterator = nomes.iterator();

        // percorre ate acabar a lista
        while (iterator.hasNext()) {
            // retorna o obejto
            System.out.println(iterator.next());
        }

    }

}