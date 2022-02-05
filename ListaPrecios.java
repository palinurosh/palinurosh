package com.company;

import java.util.Scanner;

public class ListaPrecios {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculadora útil");

        //Petición de datos a usuario
        System.out.println("Intorduce la base imponible");
        double base = s.nextDouble();

        //Tipos de IVA
        String general = "21 %";
        String reducido = "10 %";
        String superreducido = "4 %";
        double calculogeneral = base * 21 / 100;
        double calculoreducido = base * 10 / 100;
        double calculosuperreducido = base * 4 / 100;
        //Promociones
        /*double sinpromo = base;
        double sinpromoreduc = calculoreducido;
        double sinpromosuperreducido = calculosuperreducido;*/
        double mitadgral = (base * 21 / 100) /2;
        double mitadreducido = (base * 10 / 100) /2;
        double mitadsuperreducido = (base * 4 / 100) /2;
        double menoscinco = base - 5;
        double menoscincoreducido = (base * 10 / 100) - 5;
        double menoscincosuperreducido = (base * 4 / 100) - 5;
        double cincoporc = base - (base * 5 / 100);
        double cincoporcreduc = calculoreducido - (calculoreducido * 5 / 100);
        double cincosuperreducido = calculosuperreducido - (calculosuperreducido * 5 / 100);


        System.out.println("Tipo de iva: 21% (general), 10% (reducido), 4% (superreducido");
        String tipo = s.next();

        switch (tipo) {
            case "21%":
                System.out.println("Has elegido IVA general: 21 % = \t" + calculogeneral + "\n");
                break;
            case "10%":
                System.out.println("Has elegido IVA reducido: 10 % = \t" + calculoreducido + "\n");
                break;
            case "4%":
                System.out.println("Has elegido IVA superreducido: 4 % = \t" + calculosuperreducido + "\n");
                break;
        }

        System.out.println("Codigo promocional: Sin promo (SP), Mitad (M), Menos5 (-5) o Menos 5 por ciento (5%): ");
        String promo = s.next();
        switch (promo) {
            case "SP":
                System.out.println("No hago descuento, majo/a\t");
                break;
            case "M":
                System.out.println("Te voy a cobrar la mitad\t" + mitadgral + "\n");
                break;
            case "-5":
                System.out.println("Te descuento 5 eurazos\t" + menoscinco + "\n");
                break;
            case "-5%":
                System.out.println("Ahí va un 5 % de descuento\t" + cincoporc + "\n");
                break;
        }

        System.out.println("\tBase Imponible: " + base);
        System.out.println("\tIVA " + tipo + "          ");



    }




        /*Tipos de IVA
        String general = "21 %";
        String reducido = "10 %";
        String superreducido = "4 %";
        double calculogeneral = base * 21 / 100;
        double calculoreducido = base * 10 / 100;
        double calculosuperreducido = base * 4 / 100;
        //Promociones
        double sinpromo = base;
        double sinpromoreduc = calculoreducido;
        double sinpromosuperreducido = calculosuperreducido;
        double mitadgral = (base * 21 / 100) /2;
        double mitadreducido = (base * 10 / 100) /2;
        double mitadsuperreducido = (base * 4 / 100) /2;
        double menoscinco = base - 5;
        double menoscincoreducido = (base * 10 / 100) - 5;
        double menoscincosuperreducido = (base * 4 / 100) - 5;
        double cincoporc = base - (base * 5 / 100);
        double cincoporcreduc = calculoreducido - (calculoreducido * 5 / 100);
        double cincosuperreducido = calculosuperreducido - (calculosuperreducido * 5 / 100);
*/

    }


