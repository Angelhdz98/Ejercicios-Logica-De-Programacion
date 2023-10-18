package ejerciciosLogicaProgramacion;
import java.util.Scanner;
public class Ejercicio8 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[10];

	        // Pedir al usuario que ingrese 10 números enteros
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingresa el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        // Ordenar el array de menor a mayor
	        ordenarArray(numeros);

	        // Mover los números primos al principio del array
	        moverPrimosAlInicio(numeros);

	        // Imprimir el array resultante
	        System.out.println("Array ordenado con primos al principio:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }

	        scanner.close();
	    }

	    // Función para verificar si un número es primo
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Función para ordenar un array de menor a mayor
	    public static void ordenarArray(int[] array) {
	        for (int i = 0; i < array.length - 1; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] > array[j]) {
	                    int temp = array[i];
	                    array[i] = array[j];
	                    array[j] = temp;
	                }
	            }
	        }
	    }

	    // Función para mover los números primos al principio del array
	    public static void moverPrimosAlInicio(int[] array) {
	        int[] primos = new int[array.length];
	        int[] noPrimos = new int[array.length];
	        int contadorPrimos = 0;
	        int contadorNoPrimos = 0;

	        for (int numero : array) {
	            if (esPrimo(numero)) {
	                primos[contadorPrimos] = numero;
	                contadorPrimos++;
	            } else {
	                noPrimos[contadorNoPrimos] = numero;
	                contadorNoPrimos++;
	            }
	        }

	        for (int i = 0; i < contadorPrimos; i++) {
	            array[i] = primos[i];
	        }
	        for (int i = 0; i < contadorNoPrimos; i++) {
	            array[contadorPrimos + i] = noPrimos[i];
	        }
	    }
	}