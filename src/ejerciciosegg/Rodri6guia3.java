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
public class Rodri6guia3 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
     * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
     * El programa deberá ejecutarse hasta que se elija la opción 5. 
     * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
     * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        
        int numero1, numero2; 
        
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("//      Bienvenidos a la calculadora            //");
        System.out.println("////////////* 1): Sumar       ////////////////////");
        System.out.println("////////////* 2): Restar      ////////////////////");
        System.out.println("////////////* 3): Multiplicar ////////////////////");
        System.out.println("////////////* 4): Dividir     ////////////////////");
        System.out.println("////////////* 5): Salir       ////////////////////");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("Ingrese dos numero enteros");
        Scanner read = new Scanner(System.in);
        numero1 = read.nextInt();
        numero2 = read.nextInt();
        funcionmenu(numero1,numero2);
    }

    /*  @SuppressWarnings("empty-statement")*/
    @SuppressWarnings("empty-statement")
    private static void funcionmenu(int numero1, int numero2) {
        
        int opmenu;
                
       
        opmenu = 0; 
        Scanner readopcion = new Scanner(System.in);
        System.out.println("Ingrese una opcion para realizar una operacion");
        opmenu = readopcion.nextInt();
       String opcionsalir;
       opcionsalir = "";
    
       do  switch (opmenu ) {
            case 1:
                 System.out.println(numero1 + numero2);
                continue;
            case 2:
                 System.out.println(numero1 - numero2);
               
                continue;
            case 3:
                 System.out.println(numero1 * numero2);
                
                continue;
            case 4:
                 System.out.println(numero1 / numero2);
               
                continue;
            case 5:
                  System.out.println("Are you sure you want to exit? Y/N");
                  Scanner readmenu = new Scanner(System.in);
                  opcionsalir = readmenu.nextLine();
                  if  (opcionsalir.equalsIgnoreCase("Y"))
                break;
                
        }