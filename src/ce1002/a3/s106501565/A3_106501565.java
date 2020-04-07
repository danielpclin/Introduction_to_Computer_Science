/*
 * Assignment 3
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a3.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A3_106501565 {
    public static void main(String[] args){
        // Create a Scanner with a buffered System.in InputStreamReader
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while (true){
            // get line from scanner
            String line = scanner.nextLine();
            if (line.equals("STOP")){
                break;
            }
            String[] inputs = line.split(" ");
            // Sort array reversed and print second element
            int[] ints = Arrays.stream(inputs).map(Integer::valueOf).distinct().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
            System.out.println(ints[1]);
        }
    }
}
