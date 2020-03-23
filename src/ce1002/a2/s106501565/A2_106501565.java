/*
 * Assignment 2
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a2.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A2_106501565 {
    public static void main(String[] args){
        // Create a Scanner with a buffered System.in InputStreamReader
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        // Create a int named height and initialize with integer from scanner
        int height = scanner.nextInt();
        // initialize border and center with symbols from scanner.next
        // with border being the first char and center being the second char
        String symbols = scanner.next();
        String border = symbols.substring(0, 1);
        String center = symbols.substring(1, 2);
        // loop height times
        for (int i = 1; i <= height; i++) {
            // print space character height - i times for padding
            System.out.print(" ".repeat(height - i));
            if (i == 1 || i == height){
                // print i * 2 characters of border if i is 1 or height and change line
                System.out.println(border.repeat(i * 2));
            }else{
                // else print border then (i - 1) * 2 characters of center then border and change line
                System.out.println(border + center.repeat((i - 1) * 2) + border);
            }
        }
    }
}
