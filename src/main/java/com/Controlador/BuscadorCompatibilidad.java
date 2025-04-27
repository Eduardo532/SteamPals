package com.Controlador;

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
        return 0.0f;
    }
}
