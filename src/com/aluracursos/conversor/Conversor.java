package com.aluracursos.conversor;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        int opcion=0;
        while (opcion !=8){
            System.out.println("******************************************\n\n" +
                    "Bienvenidos al conversor de monedas\n\n" +
                    "Selecciona la opción según la conversión que deseas realizar\n\n" +
                    "1. Dólar (USD) a peso argentino (ARS)\n" +
                    "2. Peso argentino (ARS)  a dólar (USD)\n" +
                    "3. Dólar (USD) a real brasilero (BRL)\n" +
                    "4. Real brasilero (BRL) a dólar (USD)\n" +
                    "5. Dólar (USD) a peso colombiano (COP)\n" +
                    "6. Peso colombiano (COP) a dólar(USD)\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir\n\n" +
                    "********************************************");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta, teclado);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no valida");
                    break;
            }

        }

    }
}