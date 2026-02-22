package org.example;

import java.util.Arrays;

// Yahaira García Martínez jejejejejejjejejejeej ^-^

public class Main {
    public static void main(String[] args) {

        // Primer caso funcional enteros
        Integer[] intVector = { 101, 99, 12, 19, 21, 111, 345, 25, 77, 81 };
        System.out.println("\nOrdenamiento de numeros enteros ^-^ : \n");
        Integer[] resultInt = Utils.ordena(intVector);
        System.out.println( Arrays.toString(resultInt));

        // Segundo caso utilizamos flotantes
        // Agregamos una f al final para que java reconozca los flotantes
        Float[] floatVector = {19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f};
        System.out.println("\nOrdenamiento de numeros flotantes ^.^ : \n");
        Float[] resultFloat = Utils.ordena(floatVector);
        System.out.println(Arrays.toString(resultFloat));

        // Tercer caso para que falle el códigooo jejejejejejeejejejee ^-^ fallarrrrrrrrrrrr jajajajajajajjjajaj
        //String[] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        //String[] resultStr = Utils.ordena(strVector); // Aquí se debe de producir el error, porque no estamos trabajando con números

        /*
        * Para lograr que no imprimir los string utilizamos <T extends Number & Comparable<T>> lo que nos ayuda
        * a obligar que sean datos numericos y que tenga implementado el metodo compareTo
        * */
    }
}