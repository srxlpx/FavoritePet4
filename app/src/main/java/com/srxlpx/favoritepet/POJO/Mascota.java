package com.srxlpx.favoritepet.POJO;

/**
 * Created by Ed on 26/05/2016.
 */
public class Mascota {
    private int foto;
    private String nombre;
    private int raiting;

    public Mascota(int foto, String nombre, int raiting) {
        this.nombre = nombre;
        this.foto = foto;
        this.raiting = raiting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
