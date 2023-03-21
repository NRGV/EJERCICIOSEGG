/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosegg;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class extra6guia5 {

    /**
   
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
     * a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
     * de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
     * en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
     * de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
     * Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
* de Java substring(), Length() y Math.random().

     * 
     * 
     */
    public static void main(String[] args) {
                Random r1=new Random();
        Scanner leer = new Scanner(System.in);
        String[][] matriz=new String[20][20];
        String palabra1="a",palabra2="a",palabra3="a",palabra4="a",palabra5="a";
        int cont=0;
         for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j]="";
            }
        }
        do{
            System.out.println("escriba una palabra de minimo 3 caracteres y maximo 5 caracteres");
            palabra1=leer.nextLine();
        }while(palabra1.length()<3 || palabra1.length()>5);
        do{
            System.out.println("escriba otra palabra de minimo 3 caracteres y maximo 5 caracteres");
            palabra2=leer.nextLine();
        }while(palabra2.length()<3 || palabra2.length()>5);
        do{
            System.out.println("escriba otra palabra de minimo 3 caracteres y maximo 5 caracteres");
            palabra3=leer.nextLine();
        }while(palabra3.length()<3 || palabra3.length()>5);
        do{
            System.out.println("escriba otra palabra de minimo 3 caracteres y maximo 5 caracteres");
            palabra4=leer.nextLine();
        }while(palabra4.length()<3 || palabra4.length()>5);
        do{
            System.out.println("escriba otra palabra de minimo 3 caracteres y maximo 5 caracteres");
            palabra5=leer.nextLine();
        }while(palabra5.length()<3 || palabra5.length()>5);
        for (int i = 0; i < 20; i++) {
            int num=r1.nextInt(20);
            for (int j = 0; j < 20; j++) {
                if(i==0 && cont<palabra1.length()){
                    matriz[num][j]=palabra1.substring(j,j+1);
                    cont++;
                }
                if(i==1 && cont<palabra2.length()){
                    matriz[num][j]=palabra2.substring(j,j+1);
                    cont++;
                }
                if(i==2 && cont<palabra3.length()){
                    matriz[num][j]=palabra3.substring(j,j+1);
                    cont++;
                }
                if(i==3 && cont<palabra4.length()){
                    matriz[num][j]=palabra4.substring(j,j+1);
                    cont++;
                }
                if(i==4 && cont<palabra5.length()){
                    matriz[num][j]=palabra5.substring(j,j+1);
                    cont++;
                }
            }
            cont=0;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(matriz[i][j]==""){
                    int num2=r1.nextInt(10);
                    matriz[i][j]=String.valueOf(num2);
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("(" + matriz[i][j] + ")");
            }
            System.out.println("");
        }
    }
}   
        
    
    

