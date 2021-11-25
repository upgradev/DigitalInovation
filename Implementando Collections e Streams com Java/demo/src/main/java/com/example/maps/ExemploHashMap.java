package com.example.maps;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {
        
        Map<String, Integer> campeoesMundiaisFifa = new HashMap<>();
        
        // adiciona
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Inglaterra", 1);
        campeoesMundiaisFifa.put("Espanha", 1);

        System.out.println("lista: " + campeoesMundiaisFifa);

        System.out.println("Atualiza o valor para a chave Brasil");
        campeoesMundiaisFifa.put("Brasil", 6);

        System.out.println("lista: " + campeoesMundiaisFifa);

        System.out.println("Retorna a argentina");
        System.out.println(campeoesMundiaisFifa.get("Argentina"));

        System.out.println("Retorna se existe ou não campeão frança");
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        System.out.println("remove frança");
        campeoesMundiaisFifa.remove("França");

        System.out.println("lista: " + campeoesMundiaisFifa);

        System.out.println("Retorna se existe ou não campeão frança");
        System.out.println(campeoesMundiaisFifa.containsKey("França"));

        System.out.println("Retorna se existe ou não alguma seleção hexa");
        System.out.println(campeoesMundiaisFifa.containsValue(6));

        System.out.println("Retorna tamanho mapa");
        System.out.println(campeoesMundiaisFifa.size());

        System.out.println("Navegar entre os registros");
        for (Map.Entry<String, Integer> entry : campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() + " ----" + entry.getValue());
        }
        System.out.println("Navegar entre os registros 2");
        for (String key : campeoesMundiaisFifa.keySet()) {
            System.out.println(key + " ---- " + campeoesMundiaisFifa.get(key));
        }

        System.out.println("limpando");
        campeoesMundiaisFifa.clear();

        System.out.println("tamanho");
        System.out.println(campeoesMundiaisFifa.size());


    }

}