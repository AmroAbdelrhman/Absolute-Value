/*
 * Amro Abdelrhman
 * Math Mehtod
 * 21/02/2020
 */
package absolutevalue;

import java.util.Scanner;

/**
 *
 * @author Amro
 */
public class Absolutevalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("please enter your number here");
        double num1 = input.nextDouble();
        System.out.println(Math.abs(num1));
    }
    
}