package com.Controlador;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.Controlador.BuscadorCompatibilidad;
import com.Model.Juego;
import com.Model.Usuario;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BuscadorCompatibilidadTest {

    @Test
    public void testCalcularCompatibilidad() {
        // Crear juegos
        Juego juego1 = new Juego("League of Legends");
        Juego juego2 = new Juego("Valorant");
        Juego juego3 = new Juego("Minecraft");
        Juego juego4 = new Juego("Fortnite");

        // Crear usuarios con listas de juegos
        Usuario usuario1 = new Usuario(Arrays.asList(juego1, juego2, juego3,juego4));
        Usuario usuario2 = new Usuario(Arrays.asList(juego2, juego3, juego4));

        // Crear el buscador (el usuarioActual no importa para esta prueba)
        BuscadorCompatibilidad buscador = new BuscadorCompatibilidad(usuario1);

        // Calcular compatibilidad
        float compatibilidad = buscador.calcularCompatibilidad(usuario1, usuario2);

        // Explicación:
        // - Juegos de usuario1: LoL, Valorant, Minecraft
        // - Juegos de usuario2: Valorant, Minecraft, Fortnite
        // - Coincidencias: Valorant y Minecraft -> 2 juegos
        // - Máximo de tamaños: 3 (ambos tienen 3 juegos)
        // => compatibilidad = 2 / 3 ≈ 0.6666667

    }
}
