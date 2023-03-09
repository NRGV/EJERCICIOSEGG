/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

/**
 *
 * @author Rodrigo
 */

import java.util.Scanner;

public class ejercicio2guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String frase, correcta="eureka"; 
       Scanner read=new Scanner(System.in);
       
        System.out.println("adivina la frase secreta:");
        frase= read.nextLine();
        
        if (frase.equals(correcta)){
            System.out.println("Adivinaste!!!");
        } else{
            System.out.println("ERRRORRRR!");
        }
       
    }
    
}