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
public class DiagnosticoParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int hh=0, dd=0, mm=0, ss=0;
        
        System.out.println("Ingrese el tiempo en SEGUNDOS");
        ss=keyboard.nextInt();
        
        while(ss>=60){
            mm++;
            ss=ss-60;
        }
        
        while(mm>=60){
            hh++;
            mm=mm-60;
        }
        
        while(hh>=24){
            dd++;
            hh=hh-24;
        }
        
        System.out.println("\n"+dd+" dias "+hh+" horas "+mm+" minutos "+ss+" segundos");
    }
    
}
