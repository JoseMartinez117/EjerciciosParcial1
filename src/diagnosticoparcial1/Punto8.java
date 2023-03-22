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
public class Punto8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int subject=0, lot=0, month=0, year=0, aux=0, big=0, small=999;
          String nbig="", nsmall="";
          System.out.print("Ingrese la cantidad de asignaturas: ");
          subject=teclado.nextInt();
          
          System.out.print("\nIngrese la cantidad de meses que estudio: ");
          month=teclado.nextInt();
          month+=1;
          lot=subject+1;
          
          String matrix[][]=new String[lot][month];
          int vec1[] = new int[lot];
          
          for(int i=0; i<lot; i++){
              if(i!=0){
              System.out.println("\nIngrese las horas de la asignatura #"+(i));
              }
              for(int h=0; h<month; h++){
                  if(i==0 && h==0){
                  matrix[i][h]="X Asignatura";
                  continue;
                  }
                  if(i==0){
                  matrix[i][h]="mes "+(h);
                  continue;
                  }
                  if(h==0){
                      System.out.println("Ingrese el nombre de la asignatura");
                      
                        matrix[i][h]=teclado.next();
                    continue;
                  }
                  
                  System.out.print("Mes #"+h+": ");
                  matrix[i][h]=teclado.next();  
                  
              }
              
          }
          
        System.out.println("\nSu candelario de estudio se ve graficamente asi");
        for(String[] i: matrix){
          for(String j: i){
              System.out.print("["+j+"]");
          
          }
            System.out.println("");
        }
        
        
        for(int i=0; i<lot; i++){
            if(i==0){
                continue;
            }
            for(int h=0; h<month; h++){
             if(h==0){
             continue;
             }
             
             aux=Integer.parseInt(matrix[i][h]);
             year+=aux;
             vec1[i]=year;
             


            }
            
            System.out.println("\nLa cantidad de horas al anio que le dedico a la Asignatura #"+(i)+" fue de "+year);
            year=0;
        }

        for(int i=0; i<vec1.length; i++){
            if(i==0){
                continue;
            }
              if(vec1[i]>big){
                big=vec1[i];
                nbig=matrix[i][0];
             }else if(vec1[i-1]>big){
                big=vec1[i-1]; 
                nbig=matrix[i][0];
             }
             
             if(vec1[i]<small){
               small=vec1[i];
               nsmall=matrix[i][0];
             }
             
            
        }
        
        System.out.println("\nLa asignatura con mas horas de estudio fue "+nbig+" con "+big+" horas estudiadas");
        System.out.println("\nLa asignatura con menos horas de estudio fue "+nsmall+" con "+small+" horas estudiadas");
        
        
        
        
        
    }
    
}

 