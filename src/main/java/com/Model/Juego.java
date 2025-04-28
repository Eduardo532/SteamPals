package com.Model;
import java.net.URI;
import java.net.http.HttpRequest;
import java.util.HashMap;
import io.github.cdimascio.dotenv.Dotenv;

public class Juego {
    private static final Dotenv dotenv = Dotenv.load();
    private int id;
    private String nombre;
    private String genero;
    private int steamId;

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
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://store.steampowered.com/api/appdetails?appids=" + this.steamId))
                .header("Content-Type", "application/json")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
                
        HashMap<String, String> info = new HashMap<>();


        return null;
    }
    public boolean esFavoritoDe(Usuario u){
        if (u.getJuegosFavoritos().contains(this)){
            return true;
        }
        return false;
    }
}
