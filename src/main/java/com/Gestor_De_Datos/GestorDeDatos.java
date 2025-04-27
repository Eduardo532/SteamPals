package com.Gestor_De_Datos;

import com.Model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorDeDatos {
    public List<Usuario> cargarUsuario(){
        return new ArrayList<Usuario>();
    }
    public void guardarUsuarios(List<Usuario> usuarios){

    }
    public List<Juego> cargarJuegos(){
        return new ArrayList<Juego>();
    }
    public void guardarGrupos(List<Grupo> grupos){

    }
    public List<Mensaje> cargarMensajes(){
        return new ArrayList<Mensaje>();
    }
    public void guardarMensajes(List<Mensaje> mensajes){

    }

    public GestorDeDatos() {
    }

    public List<MensajeGrupal>  cargarMensajesG(){
        return new ArrayList<MensajeGrupal>();
    }
    public void guardarMensajesG(List<MensajeGrupal> mensajes){

    }
}
