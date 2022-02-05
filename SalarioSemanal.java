package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        System.out.println("Calcula salario a percibir semanalmente");
        System.out.println("Ten en cuenta, currito, que las horas se pagan a 12 €");

        Scanner s = new Scanner(System.in);

            System.out.println("¿Cuántas horas has trabajado el Lunes? ");
            int lunes = s.nextInt();
            System.out.println("¿Cuántas horas has trabajado el Martes? ");
            int martes = s.nextInt();
            System.out.println("¿Cuántas horas has trabajado el Miercoles? ");
            int miercoles = s.nextInt();
            System.out.println("¿Cuántas horas has trabajado el Jueves? ");
            int jueves = s.nextInt();
            System.out.println("¿Cuántas horas has trabajado el Viernes? ");
            int viernes = s.nextInt();
            int total = (lunes + martes + miercoles + jueves + viernes);

        System.out.println("\tEl Lunes has ganado: " + lunes * 12  + "\n\tEl Martes has ganado: " + martes *12
        + "\n\tEl Miércoles has ganado: " + miercoles * 12 + "\n\tEl jueves has ganado: " + jueves * 12 +
        "\n\tEl Viernes has ganado: " + viernes * 12);

        System.out.println("Esta semana te has hinchado a ganar dinero... Has ganado: " + total * 12 + " euros");



    }
}
