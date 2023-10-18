package ejerciciosLogicaProgramacion;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario el día de la semana
        System.out.print("Ingresa un día de la semana (lunes a viernes): ");
        String diaSemana = scanner.nextLine().toLowerCase();

        // Validar el día de la semana
        if (!esDiaValido(diaSemana)) {
            System.out.println("Día de la semana no válido. Debe ser un día de lunes a viernes.");
            scanner.close();
            return;
        }

        // Pedir al usuario la hora en formato de 24 horas
        System.out.print("Ingresa la hora (0-23): ");
        int hora = scanner.nextInt();

        // Pedir al usuario los minutos
        System.out.print("Ingresa los minutos (0-59): ");
        int minutos = scanner.nextInt();

        // Calcular minutos hasta el próximo viernes a las 15:00
        int minutosHastaViernes = calcularMinutosHastaViernes(diaSemana, hora, minutos);

        if (minutosHastaViernes < 0) {
            System.out.println("Ya es viernes a las 15:00 o posterior.");
        } else {
            System.out.println("Faltan " + minutosHastaViernes + " minutos hasta el próximo viernes a las 15:00.");
        }

        scanner.close();
    }

    // Función para verificar si el día es válido
    public static boolean esDiaValido(String dia) {
        return dia.equals("lunes") || dia.equals("martes") || dia.equals("miércoles") || dia.equals("jueves") || dia.equals("viernes");
    }

    // Función para calcular los minutos hasta el próximo viernes a las 15:00
    public static int calcularMinutosHastaViernes(String diaSemana, int hora, int minutos) {
        int minutosHastaViernes = 0;

        switch (diaSemana) {
            case "lunes":
                minutosHastaViernes = (4 * 24 * 60) +(900- (hora * 60 + minutos));// 900 son los minutos que tienen que pasar para que sean las 3pm al iniciar el día 
                break;
            case "martes":
                minutosHastaViernes = (3 * 24 * 60) +(900- (hora * 60 + minutos));
                break;
            case "miércoles":
                minutosHastaViernes = (2 * 24 * 60) +(900- (hora * 60 + minutos));
                break;
            case "jueves":
                minutosHastaViernes = (1 * 24 * 60) +(900- (hora * 60 + minutos));
                break;
            case "viernes":
                minutosHastaViernes = (15 * 60) +(900- (hora * 60 + minutos));
                break;
        }

        return minutosHastaViernes;
    }
}