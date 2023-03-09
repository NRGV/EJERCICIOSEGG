/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class ejercicio3guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese una frase de 8 caracteres");
		frase = sc.nextLine();
		
		if(frase.length()==8) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
        
    }
    
}
