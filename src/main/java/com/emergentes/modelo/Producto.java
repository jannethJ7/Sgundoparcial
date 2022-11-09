package com.emergentes.modelo;
public class Producto {
    public int id;
    private String descripcion;
    private int cantidad;
    private int precio;
    private String categoria;
    private String editar;
    private String eliminar;

    public Producto() {
        this.id = 0;
        this.descripcion = "";
        this.cantidad = 0;
        this.precio = 0;
        this.categoria = "";
        this.editar = "";
        this.eliminar = "";
        
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEditar() {
        return editar;
    }

    public void setEditar(String editar) {
        this.editar = editar;
    }

    public String getEliminar() {
        return eliminar;
    }

    public void setEliminar(String eliminar) {
        this.eliminar = eliminar;
    }  
}
