package com.company;

import java.util.Scanner;





    public class AreaRectangulo {

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("Este programa calcula el área de un rectángulo");
            System.out.println("Escribe la medida de un lado en cm: ");
            int lado1 = s.nextInt();
            System.out.println("Escribe la medida del otro lado en cm: ");
            int lado2 = s.nextInt();

            int area = lado1 * lado2;

            System.out.println("El area de tu rectángulo es: " + area);


        }
    }


