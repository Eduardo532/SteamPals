package com.Model;
import java.net.URI;
import java.net.http.HttpRequest;
import java.util.HashMap;

public class Juego {
    private int id;
    private String nombre;
    private String genero;
    private int steamId;

    public void setId(int id) {
        this.id = id;
    }
    public Juego(){
        this.id = 0;
        this.nombre = "Sin nombre";
        this.genero = "Sin genero";
        this.steamId = 0;
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

    public HashMap ObtenerInfoDesdeSteam()
    {
       // Aun estoy en pruebas con la Api de Steam
       return null;
    }
    @Override
    public String toString() {
        return "Juego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", steamId=" + steamId +
                '}';
    }

    public boolean esFavoritoDe(Usuario u){
        return u.getJuegosFavoritos().contains(this);
    }
}
