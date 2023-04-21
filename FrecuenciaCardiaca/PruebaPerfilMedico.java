package FrecuenciaCardiaca;
import java.util.Scanner;

public class PruebaPerfilMedico {

    public static void main(String[] args) {
        PerfilMedico a1;
        PerfilMedico a2 = new PerfilMedico();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre;
        nombre= sc.next();
        a2.setNombre(nombre);

        System.out.print("Ingrese su primer apellido: ");
        String apellido;
        apellido=sc.next();
        a2.setApellido(apellido);

        System.out.println("Ingrese su sexo: ");
        String sexo;
        sexo=sc.next();
        a2.setSexo(sexo);

        System.out.println("Introduzca su fecha de nacimiento: ");
        System.out.print("Dia: ");
        int dia;
        dia = Integer.parseInt(sc.next());
        a2.setDia(dia);

        System.out.print("Mes: ");
        int mes;
        mes=Integer.parseInt(sc.next());
        a2.setMes(mes);

        System.out.print("Anio: ");
        int year;
        year=Integer.parseInt(sc.next());
        a2.setYear(year);

        System.out.println("Ingrese su altura (centimetros): ");
        double altura;
        altura=Double.parseDouble(sc.next());
        a2.setAltura(altura);

        System.out.println("Ingrese su peso (kilogramos):");
        double peso;
        peso=Double.parseDouble(sc.next());
        a2.setPeso(peso);
        int edad=a2.getEdad();
        System.out.println("Nombre: "+a2.getNombre());
        System.out.println("Apellido: "+a2.getApellido());
        System.out.println("Sexo: "+a2.getSexo());
        System.out.println("Edad: "+ edad+" años");
        System.out.println("Altura: "+a2.getAltura());
        System.out.println("Peso: "+a2.getPeso());
        System.out.println("La frecuencia maxima de la persona es: "+a2.calcularFrecuenciaM());
        System.out.println("La frecuencia esperada esta entre: "+a2.calcularFrecuenciaE()+" y "+a2.calcularFrecuenciaEE());
        System.out.println("El indice de masa corporal es: "+a2.calcularIndiceMC());

//Constructor por parametros
        System.out.print("Ingrese su nombre: ");
        nombre= sc.next();

        System.out.print("Ingrese su primer apellido: ");
        apellido=sc.next();

        System.out.println("Ingrese su sexo: ");
        sexo=sc.next();

        System.out.println("Introduzca su fecha de nacimiento: ");
        System.out.print("Dia: ");
        dia = Integer.parseInt(sc.next());

        System.out.print("Mes: ");
        mes=Integer.parseInt(sc.next());

        System.out.print("Anio: ");
        year=Integer.parseInt(sc.next());

        System.out.println("Ingrese su altura (centimetros): ");
        altura=Double.parseDouble(sc.next());

        System.out.println("Ingrese su peso (kilogramos):");
        peso=Double.parseDouble(sc.next());

        a1= new PerfilMedico(nombre,apellido,sexo,dia, mes,year,altura,peso);
        edad = a1.getEdad();
        System.out.println("Nombre: "+a1.getNombre());
        System.out.println("Apellido: "+a1.getApellido());
        System.out.println("Sexo: "+a1.getSexo());
        System.out.println("Edad: "+ edad+" años");
        System.out.println("Altura: "+a1.getAltura());
        System.out.println("Peso: "+a1.getPeso());
        System.out.println("La frecuencia maxima de la persona es: "+a1.calcularFrecuenciaM());
        System.out.println("La frecuencia esperada esta entre: "+a1.calcularFrecuenciaE()+" y "+a1.calcularFrecuenciaEE());
        System.out.println("El indice de masa corporal es: "+a1.calcularIndiceMC());
    }
}

