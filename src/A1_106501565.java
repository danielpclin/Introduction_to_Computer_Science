/*
 * Assignment 1
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1_106501565 {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader with a System.in InputStreamReader (buffered input stream reader)
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Create two ints, one called sum and another called average and initialize sum with 0
        int sum = 0, average;
        // repeat three times
        for (int i = 0; i<3; i++){
            // read in a line and turn it into an integer then add it to the var sum
            sum += Integer.parseInt(bufferedReader.readLine());
        }
        // initialize average as sum divided by 3
        average = sum/3;
        // print out the average
        System.out.println(average);
        // print out respective grades by if else-if else
        if (average >= 90){
            // if average >= 90 print A skip rest
            System.out.println("A");
        }else if (average >= 80){
            // if average >= 80 and < 90 print B skip rest
            System.out.println("B");
        }else if (average >= 70){
            // if average >= 70 and < 80 print B skip rest
            System.out.println("C");
        }else if (average >= 60){
            // if average >= 60 and < 70 print B skip rest
            System.out.println("D");
        }else{
            // else print F
            System.out.println("F");
        }
    }
}
