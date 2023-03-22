/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagnosticoparcial1;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner keyboard= new Scanner (System.in);
        
        int limit=0,x=1,x2=1, fibo=0;
        System.out.println("Algoritmo serie fibonacci");
        
        System.out.println("Ingrese la cantidad de series que desee ver");
        limit=keyboard.nextInt();
        System.out.println("");
        
        for(int i=0; i<limit; i++){
            System.out.println("#"+(i+1)+": "+fibo);
            fibo=x+x2;
            x=x2;
            x2=fibo;
                
            
        }
        
        
        
        
    
    }
}