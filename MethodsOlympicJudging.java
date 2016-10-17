/*
Ngoc-Nhi Victoria Pham
CSCI111-001
Lab 5: Methods and Modulairty

Purpose: To ask for a judge's score input and print out the judge's number and their score six times. 
It adds all of the judges' scores together and prints out the average of six scores. 
The judge's score has to printed to one decimal place and the average has to be printed to two decimal places.
 */
package lab5_methodsandmodulairty;

import java.util.Scanner;

public class Lab5_MethodsAndModulairty {

    public static void main(String[] args) {
        byte judgeNum = 1;
        float sum = 0;
        
        while (judgeNum < 7) {
           float i = judgesScore(judgeNum);
            sum = sum + i;
            judgeNum++;
        }
        
        avgScore(sum);
    }
    
    public static float judgesScore(int judgeNum) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your score: ");
       float score = input.nextFloat();
        System.out.println();
        System.out.print("Score for Judge " + judgeNum + ": ");
        System.out.printf("%.1f", score);
        System.out.println();
        System.out.println();
        
        return score;
    }
    
    public static void avgScore(float sum) {
        float avg = sum / 6;
        System.out.print("The average score is: ");
        System.out.printf("%.2f", avg);
        System.out.println();
    }
 
}