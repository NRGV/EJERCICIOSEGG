/*
 *Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 *El programa deberá después mostrar el resultado de la suma

 */
package ejerciciosegg;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class javaE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero1 , numero2, result;
        
        
        Scanner read = new Scanner(System.in);
        
        
        System.out.println("Ingrese dos numero enteros");
        numero1 = read.nextInt();
        numero2 = read.nextInt();
        result = numero1 + numero2;
        System.out.println("El resultado es " + result );
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    }
    
}
