/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglo1;

/**
 *
 * @author idiomas
 */
public class EjercicoArreglo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arregloA[]; // Declarar el arreglo
        arregloA= new String[4]; // Creamos el Arreglo
        // Llenarlo
        arregloA[0]="hola";
        arregloA[1]="casa";
        arregloA[2]="perro";
        arregloA[3]="oso";
        
        // Obteniendo la información
        System.out.println("Valor de Arreglo en la posición 0 :"+arregloA[0]);
        System.out.println("Valor de Arreglo en la posición 1 :"+ arregloA[1]);
        System.out.println("Valor de Arreglo en la posición 2 :"+arregloA[2]);
        System.out.println("Valor de Arreglo en la posición 3 :"+arregloA[3]);
        //System.out.println("Valor de Arreglo en la posición 4 :"+arregloA[4]);
    }
    
}
