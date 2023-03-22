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
public class Punto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x=0, espace=0, i=0, row, j=0, h=0, validate=0;
        
        
        System.out.println("Digite un numero entero");
        x=keyboard.nextInt();
        
        System.out.println("Ingrse la orientaci[on del triangulo 1->Derecha, 0->Izquierda");
        validate=keyboard.nextInt();
        
        System.out.println("//////////////////////////////////////////");
        
    if(validate==1){
        for(row=0; row<=x; row++){
         espace=x-row;
         
            for(i=0; i<=espace; i++){
                System.out.print(" ");  // "    "
                
            }
            
            
            
            for(j=1; j<row;j++){
                if(j==x){
                
                }
                System.out.print("*");
                
            }
           
            System.out.println("");
   
        }         
         
        }else if(validate==0){
                for(row=0; row<=x; row++){
         espace=x-row;
         
            for(j=1; j<row;j++){
                if(j==x){
                
                }
                System.out.print("*");
                
            }
         
            for(i=0; i<=espace; i++){
                System.out.print(" ");  // "    "
                
            }
            
            
            System.out.println("");
   
        } 
        
        }else{
        System.out.println("No digito de manera correcta");
        }

        
        

                
        
        
        
    }
    
}       
        
        

