package org.example.service;

import org.example.model.Paquete;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Despacho {


    private String nombreMen;
    private String idMen;
    public List<Paquete> paquete;

    public Despacho(String nombreMen, String idMen, List<Paquete> paquete) {
        this.nombreMen = nombreMen;
        this.idMen = idMen;
        this.paquete = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Despacho despacho = (Despacho) o;
        return Objects.equals(idMen, despacho.idMen);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idMen);
    }




}
