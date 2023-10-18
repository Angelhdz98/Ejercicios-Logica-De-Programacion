package ejerciciosLogicaProgramacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
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

        // Selección aleatoria de 5 palabras del diccionario
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[5];
        for (int i = 0; i < 5; i++) {
            int indiceAleatorio = random.nextInt(palabras.length);
            palabrasSeleccionadas[i] = palabras[indiceAleatorio];
        }

        Scanner scanner = new Scanner(System.in);
        int contadorCorrectas = 0;

        System.out.println("Escribe la traducción en inglés de las siguientes palabras:");
        for (int i = 0; i < 5; i++) {
            System.out.print(palabrasSeleccionadas[i] + ": ");
            String traduccionUsuario = scanner.nextLine().trim().toLowerCase();

            if (diccionario.containsKey(palabrasSeleccionadas[i])) {
                String traduccionCorrecta = diccionario.get(palabrasSeleccionadas[i]).toLowerCase();

                if (traduccionUsuario.equals(traduccionCorrecta)) {
                    System.out.println("¡Correcto!");
                    contadorCorrectas++;
                } else {
                    System.out.println("Incorrecto. La respuesta correcta era '" + traduccionCorrecta + "'.");
                }
            }
        }

        System.out.println("Has acertado " + contadorCorrectas + " de 5 palabras.");
        scanner.close();
    }
}