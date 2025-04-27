package com.Model;

public class SolicitudDeAmistad {
    private int id;
    private Usuario usuarioEmisor;
    private Usuario usuarioReceptor;
    private Enum estado;

    public SolicitudDeAmistad(int id, Usuario usuarioEmisor, Usuario usuarioReceptor) {
        this.id = id;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
        estado = Pendiente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioEmisor(Usuario usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }

    public void setUsuarioReceptor(Usuario usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }

    public void setEstado(Enum estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public Usuario getUsuarioEmisor() {
        return usuarioEmisor;
    }

    public Usuario getUsuarioReceptor() {
        return usuarioReceptor;
    }

    public Enum getEstado() {
        return estado;
    }

    public void enviarSolicitud(){

    }
    public void aceptar(){

    }
    public void rechazar(){

    }
}
