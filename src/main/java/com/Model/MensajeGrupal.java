package com.Model;

import java.time.LocalDateTime;

public class MensajeGrupal {
    private int id;
    private Usuario emisor;
    private Grupo receptor;
    private String contenido;
    private LocalDateTime timeStamp;

    public MensajeGrupal(int id, Usuario emisor, Grupo receptor, String contenido, LocalDateTime timeStamp) {
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.contenido = contenido;
        this.timeStamp = timeStamp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmisor(Usuario emisor) {
        this.emisor = emisor;
    }

    public void setReceptor(Grupo receptor) {
        this.receptor = receptor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getId() {
        return id;
    }

    public Usuario getEmisor() {
        return emisor;
    }

    public Grupo getReceptor() {
        return receptor;
    }

    public String getContenido() {
        return contenido;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void Enviar(){

    }
    public String Mostrar(){
        return "";
    }
}
