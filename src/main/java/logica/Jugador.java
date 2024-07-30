/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author rodrigo
 */
public class Jugador {

    private static Jugador objugador = null;

    public String nombre;
    public int puntuacion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntuacion = 0;
    }

    public static Jugador datos_jugador(String nombre) {
        if (objugador == null) {
            objugador = new Jugador(nombre);
        }
        return objugador;
    }

    public void incrementar_puntuacion() {
        this.puntuacion++;
    }

    public int obtener_puntuacion() {
        return puntuacion;
    }

    public void cambiar_nombre(String nombre1) {
        this.nombre = nombre1;
    }
}
