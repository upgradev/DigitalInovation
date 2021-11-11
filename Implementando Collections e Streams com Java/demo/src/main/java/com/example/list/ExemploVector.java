package com.example.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List<String> esportes = new Vector<String>();

        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de mesa");
        esportes.add("Handebol");

        // altera o valor da posicao
        esportes.set(2, "Ping pong");
        System.out.println(esportes);

        // remove da posicao
        esportes.remove(2);
        System.out.println(esportes);
        // remove o objeto
        esportes.remove("Handebol");
        System.out.println(esportes);

        // mostra o elemento na posicao
        System.out.println(esportes.get(0));

        // navega na lista
        for (String esporte : esportes) {
            System.out.println(esporte);
        }
    }

}