package Facturaa;

import java.util.Scanner;

public class PruebaF {
    public static void main(String[] args) {
        Factura f1= new Factura();
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el numero de pieza: ");
        String numeroPieza;
        numeroPieza=sc.next();
        f1.setNumeroPieza(numeroPieza);

        System.out.print("Ingrese la descripcion de la pieza: ");
        String descripcionPieza;
        descripcionPieza=sc.next();
        f1.setDescripcionPieza(descripcionPieza);

        System.out.print("Ingrese la cantidad que se va a comprar: ");
        int cantidadPieza;
        cantidadPieza=Integer.parseInt(sc.next());
        f1.setCantidadPieza(cantidadPieza);

        System.out.print("Ingrese el precio del articulo:");
        double precioArticulo;
        precioArticulo=Double.parseDouble(sc.next());
        f1.setPrecioPieza(precioArticulo);

        System.out.println("**********Facturaa.Factura**********");
        System.out.println("Numero de pieza: "+f1.getNumeroPieza());
        System.out.println("Descripcion: "+f1.getDescripcionPieza());
        System.out.println("Cantidad: "+f1.getCantidadPieza());
        System.out.println("Precio unitario: "+f1.getPrecioPieza());
        System.out.println("Monto total: "+f1.calcularMontoFactura());

        Factura f2;
        System.out.print("Ingrese el numero de pieza: ");
        numeroPieza=sc.next();

        System.out.print("Ingrese la descripcion de la pieza: ");
        descripcionPieza=sc.next();

        System.out.print("Ingrese la cantidad que se va a comprar: ");
        cantidadPieza=Integer.parseInt(sc.next());

        System.out.print("Ingrese el precio del articulo:");
        precioArticulo=Double.parseDouble(sc.next());

        f2= new Factura(numeroPieza, descripcionPieza, precioArticulo, cantidadPieza);
        System.out.println("**********Factura**********");
        System.out.println("Numero de pieza: "+f2.getNumeroPieza());
        System.out.println("Descripcion: "+f2.getDescripcionPieza());
        System.out.println("Cantidad: "+f2.getCantidadPieza());
        System.out.println("Precio unitario: "+f2.getPrecioPieza());
        System.out.println("Monto total: "+f2.calcularMontoFactura());
    }
}