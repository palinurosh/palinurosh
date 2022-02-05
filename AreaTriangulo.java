package com.company;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula area de triángulo");
        System.out.println("Introduce la base: ");
        float base = s.nextFloat();
        float mediaBase = base / 2;
        System.out.println("Ahora introduce la altura: ");
        float altura = s.nextFloat();

        System.out.println("El área del triángulo es; " + mediaBase * altura);


    }

}
