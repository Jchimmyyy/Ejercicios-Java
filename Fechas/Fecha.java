package Fechas;

public class Fecha {
    //Atributos
    private int mes;
    private int dia;
    private int year;
    //Constructor con parámetros
    public Fecha(int dia,int mes, int year) {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }
    public Fecha() {
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMes() {
        return mes;
    }
    public int getDia() {
        return dia;
    }
    public int getYear() {
        return year;
    }

}
