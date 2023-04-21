package FrecuenciaCardiaca;
import java.time.LocalDate;
import java.time.Period;
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int mes;
    private int dia;
    private int year;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int mes, int dia, int year, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.mes = mes;
        this.dia = dia;
        this.year = year;
        this.altura = altura;
        this.peso = peso;
    }

    public PerfilMedico() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
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

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        LocalDate fechaNacimiento = LocalDate.of(year, dia, mes);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
    }
    public int calcularFrecuenciaM(){
        return 220-getEdad();
    }
    public double calcularFrecuenciaE(){
        return calcularFrecuenciaM()*0.5;
    }
    public double calcularFrecuenciaEE(){
        return calcularFrecuenciaM()*0.85;

    }
    public double calcularIndiceMC(){
        altura=altura/100;
        return peso/altura;
    }

}
