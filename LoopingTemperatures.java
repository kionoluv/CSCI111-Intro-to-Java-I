/*
Ngoc-Nhi Victoria Pham
CSCI111-001
Lab 4: Looping

Purpose: Take a user's input temperature in Celsius and print a table with 41 temperatures (20 values below and 20 values above
    user's original input). The table  displays the  Celsius value and its corresponding Fahrenheit value. Outputand clculations needs
    to be accurate to a tenth of a degree.

Requirements:
 input starting temp in Celsius
 produce a table with 41 temp conversions
    table includes int Celsius from 20 below input and 20 above input (hence 41 values)
doesn't need to use ints, could use floats
    accurate to .1 of a degree
table needs to display celsius value and its corresponding fahrenhait value.
 */
 
package lab4_looping;

import java.util.Scanner;
import java.text.*;

public class Lab4_Looping {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i;
        
        System.out.println("What is the name of your city?");
        String cityName = input.nextLine();
        
        System.out.println( "What is the temperature of " + cityName + " in degrees Celsius?");        
            float c = input.nextFloat();
        
        System.out.println("Celsius | Fahrenheit");
        System.out.println("--------+-----------");
        
//        for (i = -20; i <= 0; i++) {
//            System.out.printf("%3.1f     |    ", c);
//            double f = ((9.0 / 5.0) * c) + 32.0;
//            System.out.printf("%3.1f", f);
//            System.out.println();
//            c =  c - 1;
//        }
        
        for (i = 0; i <20; i++) {
            double f = ((9.0 / 5.0) * c) + 32.0;
            System.out.printf("%3.1f     |    ", c);
            System.out.printf("%3.1f", f);
            System.out.println();
            c = c + 1;
        }
        
    }
    
}
