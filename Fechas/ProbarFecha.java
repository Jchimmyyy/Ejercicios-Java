package Fechas;

import java.util.Scanner;

public class ProbarFecha {
    public static void main(String[] args) {

        Fecha f1;
        Fecha f2 = new Fecha();
        Scanner sc= new Scanner(System.in);

       System.out.println("************Introduce la fecha************  ");
        System.out.print("Dia: ");
        int dia;
        dia=Integer.parseInt(sc.next());
        f2.setDia(dia);

        System.out.print("Mes: ");
        int mes;
        mes=Integer.parseInt(sc.next());
        f2.setMes(mes);

        System.out.print("Año: ");
        int year;
        year=Integer.parseInt(sc.next());
        f2.setYear(year);
        System.out.println("La fecha que ingreso es: "+f2.getDia()+"/"+f2.getMes()+"/"+f2.getYear());

        //Constructor por parámetros
        System.out.println("************Introduce la fecha************  ");
        System.out.print("Dia: ");
        dia=Integer.parseInt(sc.next());

        System.out.print("Mes: ");
        mes=Integer.parseInt(sc.next());

        System.out.print("Año: ");
        year=Integer.parseInt(sc.next());

        f1= new Fecha(dia,mes,year);
        System.out.println("La fecha que a ingresado es: "+f1.getDia()+"/"+f1.getMes()+"/"+f1.getYear());
    }
}