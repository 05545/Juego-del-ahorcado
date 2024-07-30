/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import interfaz.Pantalla_opciones;

/**
 *
 * @author rodrigo
 */
public class Modificarmodos {

    private static Modificarmodos instanciamodos = null;
    public boolean n_modo;
    public int m_actual = 1;

    public Modificarmodos() {
        n_modo = Principal.modo_oscuro;
    }

    public static Modificarmodos obinstancia() {
        if (instanciamodos == null) {
            instanciamodos = new Modificarmodos();
        }
        return instanciamodos;
    }

    public void actualizar_modo(boolean estado) {
        if (n_modo == estado) {
            System.out.println("Cambiando a modo oscuro");
            Pantalla_opciones.I_opcionesoscuro.setVisible(true);
            Pantalla_opciones.I_opciones.setVisible(false);
        } else if (n_modo != estado) {
            System.out.println("Cambiando a modo claro");
            Pantalla_opciones.I_opcionesoscuro.setVisible(false);
            Pantalla_opciones.I_opciones.setVisible(true);
        }
        n_modo = estado;
        Principal.modo_oscuro = estado;
    }

}
