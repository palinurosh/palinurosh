package com.company;

import java.util.Scanner;

public class AreaCono {
    public static void main(String[] args) {
        System.out.println("Esto calcula el volumen de un cono...");
        //se calcula a partir de radio y altura de cono dados

        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la altura del cono: ");
        double altura = s.nextDouble();
        System.out.println("Introduce el radio del cono: ");
        double radio = s.nextDouble();
        double radio2 = radio * radio;
        double volumen = (3.1416 * radio2 * altura) / 3 ;
        System.out.println("El volumen de tu cono es: " + volumen);



    }
}
