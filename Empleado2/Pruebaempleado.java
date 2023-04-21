package Empleado2;
import Empleado2.Empleado2;

import java.util.Scanner;

public class Pruebaempleado {
    public static void main(String[] args) {
        Empleado2 e1 = new Empleado2();
        Empleado2 e2 = new Empleado2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre;
        nombre = sc.next();
        e1.setNombre(nombre);

        System.out.print("Ingrese su apellido paterno: ");
        String apellidoP;
        apellidoP = sc.next();
        e1.setApellidoPaterno(apellidoP);

        System.out.print("Ingrese su salario mensual: ");
        double salarioM;
        salarioM = Double.parseDouble(sc.next());
        e1.setSalarioMensual(salarioM);
        System.out.println("Salario anual de " + e1.getNombre() + e1.getApellidoPaterno() + " es: " + e1.getSalarioMensual() * 12);
        System.out.println("El aumento del 10% es a su salario es: "+(e1.getSalarioMensual()*12)*1.1);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();
        e2.setNombre(nombre);

        System.out.print("Ingrese su apellido paterno: ");
        apellidoP=sc.next();
        e2.setApellidoPaterno(apellidoP);

        System.out.print("Ingrese su salario mensual: ");
        salarioM=Double.parseDouble(sc.next());
        e2.setSalarioMensual(salarioM);
        System.out.println("Salario anual de "+e2.getNombre()+e2.getApellidoPaterno()+" es: "+e2.getSalarioMensual()*12);
        System.out.println("El aumento del 10% es a su salario es: "+(e2.getSalarioMensual()*12)*1.1);
    }
}