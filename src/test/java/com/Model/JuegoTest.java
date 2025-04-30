package com.Model;

import org.junit.*;
import static org.junit.Assert.*;
public class JuegoTest {
    @Test
    public void testConstructorConParametros() {
        Juego juego = new Juego(1,"Portal","Puzzle", 400);
        assertEquals("Portal", juego.getNombre());
        assertEquals(400, juego.getSteamId());
    }

    @Test
    public void testSettersYGetters() {
        Juego juego = new Juego();
        juego.setNombre("Left 4 Dead");
        juego.setSteamId(550);

        assertEquals("Left 4 Dead", juego.getNombre());
        assertEquals(550, juego.getSteamId());
    }

    @Test
    public void testToString() {
        Juego juego = new Juego(2,"Half-Life","Accion",70);
        String result = juego.toString();
        assertTrue(result.contains("Half-Life"));
        assertTrue(result.contains("70"));
    }
}