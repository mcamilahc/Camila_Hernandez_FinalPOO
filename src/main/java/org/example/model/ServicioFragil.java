package org.example.model;

public class ServicioFragil extends Paquete{

    private String fragil;
    private String nombre;
    private double ajuste;

    public ServicioFragil(String guia, int pesoKg, ZonaDestino zonaDestino, String fragil, String nombre, double ajuste) {
        super(guia, pesoKg, zonaDestino);
        this.fragil = fragil;
        this.nombre = "Fragil" + fragil;
        this.ajuste = 5000;
    }

    @Override
    public double precioConServicio() {
        double precio = calcularPrecioBase() + 5000;
        return precio;
    }

    @Override
    public String toString() {
        return "ServicioFragil{" +
                "fragil='" + fragil + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ajuste=" + ajuste +
                '}';
    }
}
