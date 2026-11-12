package org.example.model;

public class ServicioEstandar extends Paquete{

    private String nombre;

    public ServicioEstandar(String guia, int pesoKg, ZonaDestino zonaDestino, String nombre) {
        super(guia, pesoKg, zonaDestino);
        this.nombre = "Express";
    }

    @Override
    public double precioConServicio() {
        double precio = calcularPrecioBase();
        return precio;
    }


}
