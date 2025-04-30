package com.Model;

import java.util.Date;

public class MensajeGrupal {
    private int id;
    private Usuario emisor;
    private Grupo receptor;
    private String contenido;
    private Date timeStamp;

    public MensajeGrupal(int id, Usuario emisor, Grupo receptor, String contenido, Date timeStamp) {
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

    public void setTimeStamp(Date timeStamp) {
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

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void Enviar(){

    }
    public String Mostrar(){
        return "";
    }
}
