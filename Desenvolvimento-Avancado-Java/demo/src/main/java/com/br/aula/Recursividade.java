package com.br.aula;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorialA(5));
    }

    public static int fatorial(int value) {
        if (value == 1) {
            return value;
        } else {
            return value * fatorial(value - 1);
        }
    }

    public static double fatorialA(int value) {
        return fatorialTailCall(value, 1);
    }

    public static double fatorialTailCall(double valor, double numero) {
        if (valor == 0) {
            return numero;
        } else {
            return fatorialTailCall(valor - 1, numero * valor);
        }
    }
}