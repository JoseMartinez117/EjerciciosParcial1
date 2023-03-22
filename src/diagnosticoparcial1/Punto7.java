/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagnosticoparcial1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int amount=0, count=0;
        System.out.println("Ingresa la cantidad de los 2 vectores");
        amount=teclado.nextInt();
        int[] vec1= new int[amount];
        int[] vec2= new int[amount];
        int[] vec3= new int[amount*2];
        
        System.out.println("Ingrese los datos para el primer vector");
        for(int i=0; i<amount; i++){
            System.out.print("#"+(i+1)+": ");
            vec1[i]=teclado.nextInt();
        
        }
        
        System.out.println("Ingrese los datos para el segundo vector");
        for(int i=0; i<amount; i++){
            System.out.print("#"+(i+1)+": ");
            vec2[i]=teclado.nextInt();
        
        }
        
        for(int i=0; i<vec1.length; i++){
            vec3[count]=vec1[i];
            count++;
            vec3[count]=vec2[i];
            count++;
        }
        
        Arrays.sort(vec3);
        System.out.println("Los datos seran");
        for(int i=0; i<vec3.length; i++){
            System.out.println("#"+(i+1)+": "+vec3[i]);
        }
        
        
        
        
        
    }
    
}
