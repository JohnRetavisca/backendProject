package com.tutorial.crud.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class DireccionDto {

    @NotBlank
    private int numerocalle;
    @NotBlank
    private String nombrecalle;
    @NotBlank
    private String ciudad;
    @NotBlank
    private String departamento;
    @NotBlank
    private int codpostal;
    @NotBlank
    private String tipodireccion;

    public DireccionDto() {
    }

    public DireccionDto(@NotBlank int numerocalle, @NotBlank String nombrecalle, @NotBlank String ciudad, @NotBlank String departamento, @NotBlank int codpostal, @NotBlank String tipodireccion) {
        this.numerocalle = numerocalle;
        this.nombrecalle = nombrecalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codpostal = codpostal;
        this.tipodireccion = tipodireccion;
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
