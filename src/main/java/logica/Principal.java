/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Scanner;
import interfaz.*;

/**
 *
 * @author rodrigo
 */
public class Principal extends Pantalla_incio {

    public static int estado_dia = 1;
    public static boolean modo_oscuro = true;

    public static void main(String[] args) {
        // Iniciar la pantalla de inicio
        Pantalla_incio pi = new Pantalla_incio();
        pi.setVisible(true);
        pi.setLocationRelativeTo(null);
    }
}
