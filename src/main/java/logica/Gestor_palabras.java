/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author rodrigo
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Gestor_palabras {
    private HashMap<String, List<Palabra>> palabrasPD;
    private Random random;

    public Gestor_palabras() {
        palabrasPD = new HashMap<>();
        palabrasPD.put("facil", new ArrayList<>());
        palabrasPD.put("medio", new ArrayList<>());
        palabrasPD.put("dificil", new ArrayList<>());

        // Inicialización de palabras
        agregar_palabra("facil", new Palabra("GATO", "Un animal doméstico"));
        agregar_palabra("facil", new Palabra("PERRO", "Es conocido como el mejor amigo del hombre"));
        agregar_palabra("facil", new Palabra("FOCO", "Tiene cuatro letras"));
        agregar_palabra("facil", new Palabra("CASA", "Lugar donde vives"));
        agregar_palabra("facil", new Palabra("ARBOL", "Tiene hojas y da sombra"));
        agregar_palabra("facil", new Palabra("AZUL", "Color del cielo despejado"));
        agregar_palabra("facil", new Palabra("LIBRO", "Contiene historias y conocimientos"));
        agregar_palabra("facil", new Palabra("BICICLETA", "Vehículo de dos ruedas"));
        agregar_palabra("facil", new Palabra("PLAYA", "Lugar de arena y mar"));
        agregar_palabra("facil", new Palabra("COCINA", "Lugar donde se preparan alimentos"));
        agregar_palabra("facil", new Palabra("ROBOT", "Máquina que realiza tareas automáticamente"));
        agregar_palabra("facil", new Palabra("INVIERNO", "Estación más fría del año"));
        agregar_palabra("facil", new Palabra("FELIZ", "Emoción positiva"));
        
        agregar_palabra("medio", new Palabra("ELEFANTE", "El animal más grande terrestre"));
        agregar_palabra("medio", new Palabra("JIRAFA", "El animal más alto del mundo"));
        agregar_palabra("medio", new Palabra("AVION", "Medio de transporte aéreo"));
        agregar_palabra("medio", new Palabra("TELESCOPIO", "Instrumento para ver objetos lejanos"));
        agregar_palabra("medio", new Palabra("GUITARRA", "Instrumento musical de cuerdas"));
        agregar_palabra("medio", new Palabra("CASCADA", "Caída de agua desde una altura"));
        agregar_palabra("medio", new Palabra("ESCALERA", "Sirve para subir y bajar"));
        agregar_palabra("medio", new Palabra("TELEVISION", "Aparato para ver programas y películas"));
        agregar_palabra("medio", new Palabra("RINOCERONTE", "Animal con un cuerno en la nariz"));
        agregar_palabra("medio", new Palabra("TELEFONO", "Dispositivo para comunicarse a distancia"));
        agregar_palabra("medio", new Palabra("COCODRILO", "Reptil grande de agua dulce"));
        agregar_palabra("medio", new Palabra("CARTERA", "Lugar donde se guarda el dinero"));
        
        agregar_palabra("dificil", new Palabra("AHORCADO", "Un juego clásico de adivinanzas"));
        agregar_palabra("dificil", new Palabra("JAVA", "Un lenguaje de programación"));
        agregar_palabra("dificil", new Palabra("EXTRATERRESTRE", "Ser de otro planeta"));
        agregar_palabra("dificil", new Palabra("CONSTITUCION", "Ley fundamental de un país"));
        agregar_palabra("dificil", new Palabra("ARQUEOLOGIA", "Estudio de restos antiguos"));
        agregar_palabra("dificil", new Palabra("NEUROCIENCIA", "Estudio del sistema nervioso"));
        agregar_palabra("dificil", new Palabra("INVESTIGACION", "Búsqueda sistemática de conocimientos"));
        agregar_palabra("dificil", new Palabra("FOTOGRAFIA", "Captura de imágenes con luz"));
        agregar_palabra("dificil", new Palabra("BIOQUIMICA", "Estudio de las reacciones químicas en organismos vivos"));
        agregar_palabra("dificil", new Palabra("ELECTROMAGNETISMO", "Fenómeno físico que combina electricidad y magnetismo"));
        agregar_palabra("dificil", new Palabra("HIDRODINAMICA", "Estudio de los fluidos en movimiento"));
        agregar_palabra("dificil", new Palabra("CRIPTOGRAFIA", "Ciencia de escribir mensajes secretos"));

        // Inicialización del generador de números aleatorios
        random = new Random();
    }

    public void agregar_palabra(String dificultad, Palabra palabra) {
        palabrasPD.get(dificultad).add(palabra);
    }

    public Palabra obtenerP_Aleatoria(String dificultad) {
        List<Palabra> palabras = palabrasPD.get(dificultad);
        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        
        int numeroAleatorio = random.nextInt(palabras.size());
        return palabras.get(numeroAleatorio);
    }
}
