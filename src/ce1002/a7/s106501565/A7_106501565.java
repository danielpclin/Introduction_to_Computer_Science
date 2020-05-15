/*
 * Assignment 7
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a7.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A7_106501565 {
    public static void main(String[] args){
        // Create a Scanner with a buffered System.in InputStreamReader
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scanner.nextInt();
        int one = scanner.nextInt();
        int five = scanner.nextInt();
        int ten = scanner.nextInt();
        int result = 0;
        if(n > 0){
            int temp = Math.min(n, ten * 2);
            result += temp;
            one += temp * 4;
            n -= temp;
        }
        if(n > 0){
            int temp = Math.min(n, five);
            result += temp;
            one += temp * 2;
            n -= temp;
        }
        if(n > 0){
            int temp = Math.min(n * 3, one);
            result += temp;
        }
        System.out.println(result);
    }
}
