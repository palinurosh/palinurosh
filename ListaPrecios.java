package com.company;

import java.util.Scanner;


public class ListaPrecios {


    public static void main(String[] args) {
        //Scanner s = new Scanner(System.in);

        System.out.println("Calculadora útil");

        //Petición de datos a usuario
        System.out.println("Intorduce la base imponible");
        double base = Double.parseDouble(System.console().readLine());

        System.out.println("Introduce tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = System.console().readLine();

        System.out.println("Introduce código promocional (nopro, mitad, menos5 o 5porc): ");
        String promo = System.console().readLine();

        //Calcula Precio e IVA antew del descuento

        int tipoIVANumerico = 0;

        switch (tipoIVA) {
            case "general":
                tipoIVANumerico = 21;
                break;
            case "reducido":
                tipoIVANumerico = 10;
                break;
            case "superreducido":
                tipoIVANumerico = 4;
                break;
            default:
                System.out.println("Este IVA no vale, listo...");
        }
        double iva = base * tipoIVANumerico / 100;
        double precioSinDescuento = base + iva;

        //  Calcula descuento

        double descuento = 0;

        switch (promo) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioSinDescuento / 2;
                break;
            case "menos5":
                descuento = precioSinDescuento - 5;
                break;
            case "5porc":
                descuento = precioSinDescuento * 0.05;
                break;
            default:
                System.out.println("Vete a bacilar a tu Prima Caty");
        }

        //Precio final desglosado

        double total = precioSinDescuento - descuento;

        System.out.println("\tBase imponible: " + base);
        System.out.println("\tIVA " + "(  " + tipoIVA + ") " + tipoIVANumerico + "%");
        System.out.println("\tPrecio con IVA: " + precioSinDescuento);
        System.out.println("\tCódigo promocional " + "(" + promo + ") " + "-" + descuento);
        System.out.println("\tTotal: \t\t" + total);




    }

}






