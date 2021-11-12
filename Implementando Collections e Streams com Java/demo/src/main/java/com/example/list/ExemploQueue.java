package com.example.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        String clienteSerAtendido = filaBanco.poll(); // remove o primeiro elemento
        System.out.println(clienteSerAtendido);
        System.out.println(filaBanco);

        String primeiroCliente = filaBanco.peek(); // retorna primeiro elemento ou null se estiver vazia
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

        // filaBanco.clear();

        String primeiroClienteOuErro = filaBanco.element(); // retorna primeiro elemento ou um erro se estiver vazia
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }
        System.out.println("------------------");
        Iterator<String> fila = filaBanco.iterator();
        while (fila.hasNext()) {
            System.out.println(fila.next());
        }

        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        

    }

}