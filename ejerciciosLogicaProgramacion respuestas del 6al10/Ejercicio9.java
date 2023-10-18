package ejerciciosLogicaProgramacion;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar el diccionario
        Map<String, String> diccionario = new HashMap<>();

        // Agregar palabras y sus traducciones al diccionario
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("ordenador", "computer");
        diccionario.put("amigo", "friend");
        diccionario.put("escuela", "school");
        diccionario.put("playa", "beach");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("cielo", "sky");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");

        // Buscar la traducción de una palabra en el diccionario
        String palabraABuscar = "verde";
        if (diccionario.containsKey(palabraABuscar)) {
            String traduccion = diccionario.get(palabraABuscar);
            System.out.println("La traducción de '" + palabraABuscar + "' es '" + traduccion + "'.");
        } else {
            System.out.println("'" + palabraABuscar + "' no se encuentra en el diccionario.");
        }
    }
}
