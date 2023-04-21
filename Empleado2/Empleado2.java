package Empleado2;

public class Empleado2 {
    //atributos
    private String nombre;
    private String apellidoP;
    private double salarioMensual;
    //Metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoP = apellidoPaterno;
    }
    public void setSalarioMensual(double salarioMensual) {
        if(salarioMensual<0){
            salarioMensual=0;
        }
        this.salarioMensual = salarioMensual;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidoPaterno() {
        return apellidoP;
    }
    public double getSalarioMensual() {
        return salarioMensual;
    }

}
