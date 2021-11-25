package com.example.optional;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionPrimitivo {
    public static void main(String[] args) {
        System.out.println("Valor inteiro opcional");
        OptionalInt.of(10).ifPresent(System.out::println);

        System.out.println("Valor inteiro opcional");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("Valor inteiro opcional");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }   
}