package com.Model;

public class Mensaje {
    private int id;
    private Usuario emisor;
    private Usuario receptor;
    private String contenido;
    private DateTime timestamp;

    public Mensaje(int id, Usuario emisor, Usuario receptor, String contenido, DateTime timestamp) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        this.timestamp = timestamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(Usuario receptor) {
        this.receptor = receptor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTimestamp(DateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void enviar(){

    }

    public int getId() {
        return id;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public DateTime getTimestamp() {
        return timestamp;
    }

    public String mostrar(){

    }
}
