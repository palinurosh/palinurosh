package com.company;

import java.util.Scanner;

public class ConversorKbytes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int megabyte = 1000;

        System.out.println("Este programa convierte Kb a Mb");
        System.out.println("Escribe la cantidad de Kbytes a convertir");
        System.out.println("Recuerda que un KB equivale a 0.001 KB");
        int kb = s.nextInt();
        int megabytes = kb / 1000;
        System.out.println("Has convertido tus kilobytes en: " + megabytes + " Mb");

    }
}
