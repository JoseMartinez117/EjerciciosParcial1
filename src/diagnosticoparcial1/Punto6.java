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
public class Punto6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        int amountW=0, amountCh=0;
        
        System.out.println("Digite la frase");
        word=keyboard.nextLine();
        String[] separar = word.split(" ");
        amountW=separar.length;
        
        
        System.out.println("");
        System.out.println("La frase tiene "+amountW+" de palabras");
        
        for(int i=0; i<separar.length; i++){
        amountCh+=separar[i].length();
        
            
        }
        System.out.println("La frase tiene "+amountCh+" de caracteres");
        
    }
    
}
