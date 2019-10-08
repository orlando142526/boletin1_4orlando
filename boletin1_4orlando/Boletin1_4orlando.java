/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4orlando;

import java.util.Scanner;

/**
 *
 * @author oyagualendara
 */
public class Boletin1_4orlando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Da un numero:");
        float a = sc.nextFloat();
        Scanner sca = new Scanner(System.in);       
        System.out.println("Pon outro numero:");
        float b = sca.nextFloat();
        System.out.println("Suma="+(a+b));
        System.out.println("Resta="+(a-b));
        System.out.println("Multiplicacion="+(a*b));
System.out.println("Division="+(a/b));

    }
    
}
