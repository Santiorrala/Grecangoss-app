package com.example.grecangoss_app;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String descripcion;
    private String imageResourceId; // Cambiado a String para el ID de recurso de imagen
    private String caracteristica;
    private String variacion;
    private String etiqueta;
    // Constructor
    public Product(String name, String category, String imageResourceId, String caracteristica, String variacion, String etiqueta) {
        this.name = name;
        this.descripcion = category;
        this.imageResourceId = imageResourceId;
        this.caracteristica = caracteristica;
        this.variacion = variacion;
        this.etiqueta = etiqueta;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(String imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
    public String getCaracteristica(){
        return caracteristica;
    }
    public String getVariacion(){
        return variacion;
    }
    public String getEtiqueta(){
        return etiqueta;
    }

}
