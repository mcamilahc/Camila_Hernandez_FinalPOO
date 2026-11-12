package org.example.model;

public class ServicioExpress extends Paquete{

    private String nombre;
    private String ajuste;

    public ServicioExpress(String guia, int pesoKg, ZonaDestino zonaDestino, String nombre, String ajuste) {
        super(guia, pesoKg, zonaDestino);
        this.nombre = nombre;
        this.ajuste = "50%";
    }

    @Override
    public double precioConServicio() {
        double extra = calcularPrecioBase() * 0.5;
        double precio = calcularPrecioBase() + extra;
        return precio;
    }

    @Override
    public String toString() {
        return "ServicioExpress{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
