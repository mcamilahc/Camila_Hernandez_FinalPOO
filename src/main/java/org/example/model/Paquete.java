package org.example.model;

import java.util.Objects;

public abstract class Paquete {

    private String guia;
    private double pesoKg;
    private ZonaDestino zonaDestino;
    private final double tarifaCentro= 6000;
    private final double tarifaNorte= 8000;
    private final double tarifaSur=8000;
    private final double tarifaOriente=15000;

    public Paquete(String guia, int pesoKg, ZonaDestino zonaDestino) {
        if (pesoKg < 0){
            throw new PesoPaqueteInvalidoException("El paquete debe pesar mas de 0kg");
        }
        if (pesoKg > 20){
           throw new PesoMayorException("El paquete no se puede llevar en moto");
        }
        this.guia = guia;
        this.pesoKg = pesoKg;
        this.zonaDestino = zonaDestino;
    }

    public String getGuia() {
        return guia;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public ZonaDestino getZonaDestino() {
        return zonaDestino;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(guia, paquete.guia);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guia);
    }

    public double calcularPrecioBase(){
        double precioBase = 0.0;
        if (zonaDestino == ZonaDestino.CENTRO){
            precioBase = tarifaCentro + (pesoKg*1000);
        }
        if (zonaDestino == ZonaDestino.NORTE){
            precioBase = tarifaNorte + (pesoKg*1000);
        }
        if (zonaDestino == ZonaDestino.SUR){
            precioBase = tarifaSur + (pesoKg*1000);
        }
        if (zonaDestino == ZonaDestino.ORIENTE){
            precioBase = tarifaOriente + (pesoKg*1000);
        }

        return precioBase;
    }

    public abstract double precioConServicio();

    @Override
    public String toString() {
        return "Paquete{" +
                "guia='" + guia + '\'' +
                ", pesoKg=" + pesoKg +
                ", zonaDestino=" + zonaDestino +
                '}';
    }

}



