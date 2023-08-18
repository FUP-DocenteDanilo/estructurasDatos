/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglo1;

/**
 *
 * @author idiomas
 */
import java.util.Scanner;
public class arreglo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lectura= new Scanner(System.in);
        final int MAX=10;
        int edades[] = new int[MAX];
        
        for(int i=0;i<MAX;i++){
            System.out.println("\n Igrese Edad:");
            edades[i]=lectura.nextInt();
        }
        
        System.out.println("\n Imprimir Edades");
        for(int i=0; i<MAX; i++){
            System.out.println(edades[i] + " ");
        }
        System.out.println("\n Buscar el elemento ingresado");
    }
    
}
