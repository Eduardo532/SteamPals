package com.Controlador;

import com.Model.Juego;
import com.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BuscadorCompatibilidad {
    private Usuario usuarioActual;

    public BuscadorCompatibilidad(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public List<Usuario> buscarUsuariosCompatibles(){
        return new ArrayList<Usuario>();
    }
    public float calcularCompatibilidad(Usuario u1, Usuario u2){
        float simRef = 0;
        float similitud;
        for (Juego juegosFavorito : u1.getJuegosFavoritos())
            if (u2.getJuegosFavoritos().contains(juegosFavorito)) simRef++;
         similitud = simRef / Math.max(u1.getJuegosFavoritos().size(), u2.getJuegosFavoritos().size());
       /* System.out.println(similitud);
        if (similitud>0.6){
            System.out.println("compatible");
        }else{
            System.out.println("no compatible");
        }
        */


        return similitud;
    }
}
