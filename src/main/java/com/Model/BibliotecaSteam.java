package com.Model;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaSteam {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }

    public BibliotecaSteam(int id, int usuarioId, List<Juego> juegos) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.juegos = juegos;
    }

    private int usuarioId;

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public List<Juego> getJuegos() {
        return juegos;
    }

    private List<Juego> juegos;
    public void importarDesdeSteam(){

    }
    public List<Juego> mostrarJuegos() {
        return new ArrayList<Juego>();
    }

}
