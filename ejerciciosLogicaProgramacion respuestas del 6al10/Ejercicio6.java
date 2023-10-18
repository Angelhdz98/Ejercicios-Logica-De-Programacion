
package ejerciciosLogicaProgramacion;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaUsuario = new Scanner(System.in);// declaro el scanner
		
		System.out.print("Ingresa una palabra o frase para escribir al reves: ");
        String entrada = entradaUsuario.nextLine();//recibo el dato 
        StringBuilder invertida=new StringBuilder();// la clase StringBuilder es la que me permite poder modificar la oración después de haberla declarado 
        int index=0;
        for(int i=0;i<entrada.length();i++) {//la función for hara que el primer caracter que ingrese a la palabra invertida se la ultima de la palabra de entrada
        	index=(entrada.length()-1)-i;
        	invertida.append(entrada.charAt(index));	

        }
        System.out.println(invertida);
        entradaUsuario.close();// importante siempre cerrar el scanner
        
	}

}
