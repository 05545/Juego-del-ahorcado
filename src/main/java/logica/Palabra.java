/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author rodrigo
 */
public class Palabra {
    private String palabra;
    private String definicion;
    
    public Palabra(String palabra, String definicion) {
        this.palabra = palabra.toUpperCase();
        this.definicion = definicion;
    }

    public boolean encontrar(char letra) {
        return palabra.indexOf(letra) != -1;
    }

    public String obtener() {
        return palabra;
    }

    public String definicionP() {
        return definicion;
    }
}
