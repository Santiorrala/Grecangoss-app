package com.example.grecangoss_app;

public class Producto {
    private String codigo;
    private String numero;
    private String categoria;
    private String presentacion;
    private double costoVenta;

    public Producto(String codigo, String numero, String categoria, String presentacion, double costoVenta) {
        this.codigo = codigo;
        this.numero = numero;
        this.categoria = categoria;
        this.presentacion = presentacion;
        this.costoVenta = costoVenta;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(double costoVenta) {
        this.costoVenta = costoVenta;
    }

}
