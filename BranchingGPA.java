/*
Ngoc-Nhi Victoria Pham
CSCI111-001
Purpose: Asks user to input a student's name and GPA, determines graduation status,
	and displays student's name and gradution status.
*/
package lab3_branchingprogramming;

import java.util.Scanner;

public class Lab3_BranchingProgramming {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Enter student's name: ");
    String studentName = input.nextLine();

    System.out.print("What is " + studentName + "'s final GPA? ");
    float gpa = input.nextFloat();

    System.out.print(studentName);

                if ( (gpa >= 0.00) && (gpa <= 2.00) ) {
                    System.out.println("  is not eligible to graduate.");

                } else if ( (gpa > 2.00) && (gpa <= 3.20) ) {
                    System.out.println(" is eligible to graduate.");

                } else if  ( (gpa > 3.20) && (gpa <= 3.60) ) {
                    System.out.println(" is eligible to graduate with Latin Honors (Cum Laude).");

                } else if ( (gpa > 3.60) && (gpa <= 3.80) ) {
                    System.out.println(" is eligible to graduate with Latin Honors (Magna Cum Laude).");

                } else if ( (gpa > 3.80) && (gpa <= 4.00) ) {
                    System.out.println(" is eligible to graduate with Latin Honors (Summa Cum Laude).");

                 // the else statement doesn't need a parameter it runs if all of the other else...if statements aren't fulfilled
                } else {
                    System.out.println("'s GPA is invalid. Please check that you entered the student's correct GPA.");
                }
        }

}