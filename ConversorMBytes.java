package com.company;

import java.util.Scanner;

public class ConversorMBytes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int megabyte = 1000;

        System.out.println("Este programa convierte Mb a Kb");
        System.out.println("Escribe la cantidad de Mbytes a convertir");
        System.out.println("Recuerda que un MB equivale a 1000 KB");
        int mb = s.nextInt();
        int kilobytes = mb * 1000;
        System.out.println("Has convertido tus megas en: " + kilobytes + " Kb");

    }
}
