package com.example.pruebapueblofinal.moldes;

public class RestauranteMolde {
    private String nombre;
    private String descripcion;
    private String rangoprecios;
    private int foto;

    public RestauranteMolde() {
    }

    public RestauranteMolde(String nombre, String descripcion, String rangoprecios, int foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.rangoprecios = rangoprecios;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRangoprecios() {
        return rangoprecios;
    }

    public void setRangoprecios(String rangoprecios) {
        this.rangoprecios = rangoprecios;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
