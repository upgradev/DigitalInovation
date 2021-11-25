package com.br.aula;

import java.util.HashMap;
import java.util.Map;

public class Memoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialMemoization(15));
        long F = System.nanoTime();
        System.out.println("fatorial: " + (F - I));
    }

    public static Integer fatorialMemoization(Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (MAPA_FATORIAL.containsKey((value))) {
                return MAPA_FATORIAL.get(value);
            } else {
                Integer resultado = value * fatorialMemoization(value - 1);
                MAPA_FATORIAL.put(value, resultado);
                return resultado;
            }
        }
    }
}