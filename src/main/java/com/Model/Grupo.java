package com.Model;

import java.util.List;

public class Grupo {
    private int id;
    private String nombre;
    private String fechaCreacion;
    private String descripcion;
    private List<Usuario> miembros;

    public Grupo(int id, String nombre, String fechaCreacion, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMensajesGrupales(List<MensajeGrupal> mensajesGrupales) {
        this.mensajesGrupales = mensajesGrupales;
    }

    private List<MensajeGrupal> mensajesGrupales;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Usuario> getMiembros() {
        return miembros;
    }

    public List<MensajeGrupal> getMensajesGrupales() {
        return mensajesGrupales;
    }

    public void agregarMiembro(Usuario u){
        miembros.add(u);
    }
    public void eliminarMiembro(Usuario u){
        miembros.remove(u);
    }
    public void enviarMensaje(MensajeGrupal m){


    }
}
