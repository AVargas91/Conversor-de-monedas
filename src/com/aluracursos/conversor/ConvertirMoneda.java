package com.aluracursos.conversor;

import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner teclado){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversión para hoy\n" +monedaBase+ " " +monedas.conversion_rate()+ " "+monedaTarget);
        System.out.println("Ingrese la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = " +cantidadConvertida+ " " +monedas.target_code());

    }

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner teclado){
        System.out.println("Ingrese el código de la moneda a convertir:");
        String monedaBase = teclado.nextLine().toUpperCase();
        System.out.println("Ingrese el código de la moneda convertida");
        String monedaObjetivo = teclado.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, teclado);
    }
}
