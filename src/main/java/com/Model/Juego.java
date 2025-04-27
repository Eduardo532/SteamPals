package com.Model;

public class Juego {
    private int id;
    private String nombre;
    private String genero;

    public Juego(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Juego(int id, String nombre, String genero, int steamId) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.steamId = steamId;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    private int steamId;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getSteamId() {
        return steamId;
    }

    public void ObtenerInfoDesdeSteam(){

    }
    public boolean esFavoritoDe(Usuario u){
        return true;
    }
}
