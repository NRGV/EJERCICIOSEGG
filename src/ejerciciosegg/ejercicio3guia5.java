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
public class ejercicio3guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cont=0,uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        System.out.println("escriba el tamaño del vector");
        int n=leer.nextInt();
        int[] vector=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("escriba un valor para el vector entre 0 y 99999");
            int num=leer.nextInt();
            vector[i]=num;
        }
        for (int i = 0; i < n; i++) {
            while(vector[i]>9){
                vector[i]=vector[i]/10;
                cont++;
            }  
           cont=cont+1;
            switch(cont){
                case 1:
                    uno++;
                    break;
                case 2:
                    dos++;
                    break;
                case 3:
                    tres++;
                    break;
                case 4:
                    cuatro++;
                    break;
                case 5:
                    cinco++;
                    break;
            }
            cont=0;
        }
        System.out.println("hay : " + uno + " numeros de 1 digito");
        System.out.println("hay : " + dos + " numeros de 2 digito");
        System.out.println("hay : " + tres + " numeros de 3 digito");
        System.out.println("hay : " + cuatro + " numeros de 4 digito");
        System.out.println("hay : " + cinco + " numeros de 5 digito");
    }
}
        
        
        
        
        
        
    
    

