package com.Model;

public class SolicitudDeAmistad {
    private int id;
    private Usuario usuarioEmisor;
    private Usuario usuarioReceptor;
    private Estado estado;

    
    public enum Estado {
        Pendiente,
        Aceptada,
        Rechazada
    }

    public SolicitudDeAmistad(int id, Usuario usuarioEmisor, Usuario usuarioReceptor) {
        this.id = id;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
        this.estado = Estado.Pendiente;
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

    public void setEstado(Estado estado) {
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

    public Estado getEstado() {
        return estado;
    }

    public void enviarSolicitud() {
   
    }

    public void aceptar() {
        this.estado = Estado.Aceptada;
    }

    public void rechazar() {
        this.estado = Estado.Rechazada;
    }
}