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
public class ejercicio5guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que compruebe si una matriz dada es antisimétrica. 
        Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
        pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. 
        La matriz traspuesta de una matriz A se denota por AT 
        y se obtiene cambiando sus filas por columnas (o viceversa).

        */
        Scanner leer = new Scanner(System.in);
        int[][] matriz=new int[3][3];
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("escribe un valor para la matriz");
                int num=leer.nextInt();
                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==-matriz[j][i]){
                    cont++;
                }
            }
        }
        if(cont==9){
            System.out.println("la matriz es antisimetrica");
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
    }
}
        
        
        
    
    
}
