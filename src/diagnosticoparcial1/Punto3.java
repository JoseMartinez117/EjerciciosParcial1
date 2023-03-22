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
public class Punto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int lot=0, row=0, cans=0, validate=0, compare=0;
        
        
        System.out.println("Digite la cantidad de latas que desea apilar");
        lot=keyboard.nextInt();
        
        while(lot>cans){
        row++;
        cans+=row;
        }
         
        validate=(cans-row)-lot;
        compare=cans-lot;
        
        if(validate<0){
        validate=validate*-1;
        }
        
        if(compare<0){
        compare=compare*-1;
        }
        
       if(cans==lot){
           System.out.println("Las "+lot+" que ingreso SI se pueden apilar");
       }else if(validate<compare){
           System.out.println("Necesitas "+validate+" menos para poder apilar");
           
       }else{
           System.out.println("Necesitas "+compare+" mas para poder apilar");
       }
        
        
    }
    
}       
        
        
