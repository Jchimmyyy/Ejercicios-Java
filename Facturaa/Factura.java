package Facturaa;

public class Factura {
    //Atributos
    private String numeroPieza;
    private String descripcionPieza;
    private double precioPieza;
    private int cantidadPieza;

    public Factura(String numeroPieza, String descripcionPieza, double precioPieza, int cantidadPieza) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPieza = precioPieza;
        this.cantidadPieza = cantidadPieza;
    }
    public Factura() {

    }

    //Setter
    public void setNumeroPieza(String numeroPieza) {//Clic derecho-generar-setter
        this.numeroPieza = numeroPieza;
    }
    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }
    public void setPrecioPieza(double precioPieza) {
        if(precioPieza<0){
            precioPieza=0;
        }this.precioPieza = precioPieza;
    }
    public void setCantidadPieza(int cantidadPieza) {
        if(cantidadPieza<0){
            cantidadPieza=0;
        }this.cantidadPieza = cantidadPieza;
    }
    //Getter
    public double getPrecioPieza(){//Revisar el código en las pruebas

        return precioPieza;
    }
    public String getNumeroPieza() {
        return numeroPieza;
    }
    public String getDescripcionPieza() {
        return descripcionPieza;
    }
    public int getCantidadPieza() {

        return cantidadPieza;
    }
    public double calcularMontoFactura(){
        return cantidadPieza*precioPieza;
    }

}
