package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numerocalle;
    private String nombrecalle;
    private String ciudad;
    private String departamento;
    private int codpostal;
    private String tipodireccion;

    public Direccion() {
    }

    public Direccion(int numerocalle, String nombrecalle, String ciudad, String departamento, int codpostal, String tipodireccion) {
        this.numerocalle = numerocalle;
        this.nombrecalle = nombrecalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codpostal = codpostal;
        this.tipodireccion = tipodireccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerocalle() {
        return numerocalle;
    }

    public void setNumerocalle(int numerocalle) {
        this.numerocalle = numerocalle;
    }

    public String getNombrecalle() {
        return nombrecalle;
    }

    public void setNombrecalle(String nombrecalle) {
        this.nombrecalle = nombrecalle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(int codpostal) {
        this.codpostal = codpostal;
    }

    public String getTipodireccion() {
        return tipodireccion;
    }

    public void setTipodireccion(String tipodireccion) {
        this.tipodireccion = tipodireccion;
    }
}
