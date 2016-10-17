/*
Ngoc-Nhi Victoria Pham
CSCI111-001, Java I
Purpose: Translate the formulas listed under question 4, pg. 51 in the textbook
         and to test them using the given variables. Print all answers and
         variables used.
Last Date Modified: 09/19/2016
 */

package lab2_transformingformulas;

public class Lab2_TransformingFormulas {

    public static void main(String[] args) {
        
        /*
        test to see if formulas are programmed properly:
            a) f = 72, c = 22.22222
            b) n = 120; p = 100000; r = 0.04; pay = 4036.4755
            c) a = 1; b = 4; d = 3; root1 = -3; root2 = -1
            d) x1 = 9; y1 = 9; x2 = -7; y2 = 1; distance = 17.8885
            e) theta = 35; haversine = 0.09042397
        */
        
        // FAHRENHEIT TO CELSIUS
            byte f = 72;
            double c = ((f - 32) * 5) / 9;

            System.out.println(f + " degrees Fahrenheit is equal to " + (c) + " degrees Celsius.");
        
        // LOAN PAYMENT
            byte n = 120;
            int p = 100000;	
            double r, pay;
                r = 0.04;
                pay = (r * p) / (1 - Math.pow((1 + r), -n));

            System.out.println("Your loan payment is due: $" + pay + "."
                    + " (where n = " + n + ", p = " + p + ", and r = " + r + ".)");
       
        
        // QUADRATIC FORMULA: PRINTS NEGATIVE AND POSITIVE ROOTS
            byte a, b, d;   // datatypes for a, b, and d are all bytes
                a = 1;
                b = 4;
                d = 3;

            double root1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * d))) / (2 * a);
            double root2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * d))) / (2 * a);

            System.out.println("The inputs for the Quadratic Formula is: a = " + a + ", b = " + b + ", and c = " + d + ".");
            System.out.println("The roots for those inputs are " + root1 + " and " + root2 + ".");
		
     
        // CALCULATING DISTANCE
            byte x1, x2, y1, y2;    // the datastypes for the following variables are all bytes
                x1 = 9;
                x2 = -7;
                y1 = 9;
                y2 = 1;	
            double distance = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

            System.out.println("The coordinates for point A is: " + x1 + ", " + x2 +".");
            System.out.println("The coordinates for point B is: " + y1 + ", " + y2 +".");
            System.out.println("The distance between point A and point B is " + distance + ".");
            
        
        
        // HAVERSINE FUNCTION
            byte theta = 35;
            double haversine = ( 1 - (Math.cos(Math.toRadians(theta))) ) / 2;

            System.out.println("With theta input of " + theta + ", the haversine output is " + haversine + ".");
    }
    
}