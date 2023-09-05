package com.example.grecangoss_app;

public class Producto {
    private String codigo;
    private String numero;
    private String categoria;
    private String descripcion;
    private String presentacion;
    private String costoVenta;

    public Producto(String codigo, String numero, String categoria, String descripcion, String presentacion, String costoVenta) {
        this.codigo = codigo;
        this.numero = numero;
        this.categoria = categoria;
        this.descripcion = descripcion;
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
    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(String costoVenta) {
        this.costoVenta = costoVenta;
    }

}
