package com.Model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
    private String nombreUsuario;
    private String password;
    private int edad;
    private String pais;
    private String descripcion;
    private List<Grupo> grupos;
    private List<Usuario> amigos;
    private List<SolicitudDeAmistad> solicitudes;

    private List<Mensaje> mensajes;

    public Usuario(List<Juego> list) {
        this.juegosFavoritos= list ;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void setAmigos(List<Usuario> amigos) {
        this.amigos = amigos;
    }

    public void setSolicitudes(List<SolicitudDeAmistad> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public void setBibliotecaSteam(BibliotecaSteam bibliotecaSteam) {
        this.bibliotecaSteam = bibliotecaSteam;
    }

    public void setJuegosFavoritos(List<Juego> juegosFavoritos) {
        this.juegosFavoritos = juegosFavoritos;
    }

    public void setMensajesGrupales(List<MensajeGrupal> mensajesGrupales) {
        this.mensajesGrupales = mensajesGrupales;
    }

    private BibliotecaSteam bibliotecaSteam;

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<SolicitudDeAmistad> getSolicitudes() {
        return solicitudes;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public BibliotecaSteam getBibliotecaSteam() {
        return bibliotecaSteam;
    }

    public List<Juego> getJuegosFavoritos() {
        return juegosFavoritos;
    }

    public List<MensajeGrupal> getMensajesGrupales() {
        return mensajesGrupales;
    }

    private List<Juego> juegosFavoritos;
    private List<MensajeGrupal> mensajesGrupales;

    public Usuario(int id, String nombreUsuario, String password, int edad, String pais, String descripcion) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.edad = edad;
        this.pais = pais;
        this.descripcion = descripcion;
    }

    public void Registrarse(){

    }
    public boolean iniciarSesion(){
        return true;
    }
    public void actualizarPerfil(){

    }
    public void sincronizarSteam(){

    }
}
