package com.company;

import java.util.Scanner;

public class TotalFactura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula precio con iva a partir del precio antes de impuestos.");
        System.out.println("IVA a aplicar a distintos artículos: " );
        System.out.println("\tTabaco: 20%\n \tLeche: 10%\n \tCerveza: 21%");

        System.out.println("Introduce el precio del tabaco: ");
        double tabaco = s.nextDouble();

        System.out.println("Introduce el precio de la leche: ");
        double leche = s.nextDouble();

        System.out.println("Introduce el precio de la cerveza: ");
        double cerveza = s.nextDouble();

        if (cerveza <= 15) {
            System.out.println("Esta cerveza es una mierda");
        } else {
            System.out.println("Vale");
        }

        
        double totaltabaco = tabaco * 20 / 100;
        System.out.println("El precio total del tabaco es: " + (totaltabaco + tabaco) );

        double totalleche = leche * 10 / 100;
        System.out.println("El precio total de la leche  es: " + (totalleche + leche) ) ;

        double totalcerveza = cerveza * 21 / 100;
        System.out.println("El precio total de la cerveza  es: " + (totalcerveza + cerveza) );












    }
}
