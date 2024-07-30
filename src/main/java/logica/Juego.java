/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.HashMap;

/**
 *
 * @author rodrigo
 */
public class Juego {
    private String palabra;
    public int intento;
    public int max_intentos = 8;
    public String estado;
    private HashMap<Character, Boolean> letras_adivinadas;

   public Juego(String palabra, int max_intentos) {
        this.palabra = palabra;
        this.max_intentos = max_intentos;
        this.intento = 0;
        this.estado = "";
        this.letras_adivinadas = new HashMap<>();
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra != ' ') { 
                this.estado += "_";
                this.letras_adivinadas.put(letra, false);
            } else {
                this.estado += " ";
            }
        }
    }

    public void iniciar_juego() {
        // Método vacio para Override
    }

    public boolean adivinar_letra(char letra) {
        boolean acierto = false;
        if (this.letras_adivinadas.containsKey(letra)) {
            acierto = true;
            this.letras_adivinadas.put(letra, true);
            actualizar_estado();
        } else {
            this.intento++;
        }
        return acierto;
    }

    public void actualizar_estado() {
        StringBuilder nuevoEstado = new StringBuilder();
        for (char c : this.palabra.toCharArray()) {
            if (c == ' ') {
                nuevoEstado.append(" ");
            } else if (this.letras_adivinadas.get(c)) {
                nuevoEstado.append(c);
            } else {
                nuevoEstado.append("_");
            }
        }
        this.estado = nuevoEstado.toString();
    }

    public String obtener_estado() {
        return estado;
    }

    public boolean juego_terminado() {
        return intento >= max_intentos || !estado.contains("_");
    }

    public boolean juego_ganado() {
        return !estado.contains("_");
    }
}
