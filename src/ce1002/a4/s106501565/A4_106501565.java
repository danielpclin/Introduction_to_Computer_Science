/*
 * Assignment 3
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a4.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A4_106501565 {
    public static void main(String[] args){
        // Create a Scanner with a buffered System.in InputStreamReader
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scanner.nextInt();
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            for (int j = 0; j < N; j++) {
                if(str.charAt(j) == '*')
                    map[i][j] = -1;
                else
                    map[i][j] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(map[i][j] == -1) {
                    for (int k = -1; k <= 1; k++) {
                        for (int l = -1; l <= 1; l++) {
                            if (i + k < 0 || i + k >= N || j + l < 0 || j + l >= N)
                                continue;
                            if (map[i + k][j + l] != -1)
                                map[i + k][j + l]++;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == -1){
                    System.out.print('*');
                }else{
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }
}
