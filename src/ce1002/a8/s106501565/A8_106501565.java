/*
 * Assignment 8
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a8.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A8_106501565 {
    public static void main(String[] args){
        // Create a Scanner with a buffered System.in InputStreamReader
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        scanner.nextLine();
        char[][] matrix = new char[M][N];
        for (int i = 0; i < M; i++) {
            String s2 = scanner.nextLine();
            for (int j = 0; j < N; j++)
                matrix[i][j] = s2.charAt(j);
        }
        for (int q = 0; q < Q; q++){
            int radius = 0;
            boolean check = true;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x>M-1 || y>N-1)
            {
                System.out.println(0);
                continue;
            }
            char chr = matrix[x][y];
            while (true) {
                int i = x - radius - 1, j = y - radius - 1;
                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < (radius+1) * 2; l++) {
                        if (k == 0)
                            i++;
                        else if (k==1)
                            j++;
                        else if (k==2)
                            i--;
                        else
                            j--;
                        if (i < 0 || j < 0 || i >= M || j >= N || matrix[i][j] != chr){
                            check = false;
                            break;
                        }
                    }
                    if (!check) break;
                }
                if (!check) break;
                radius++;
            }
            System.out.println(2 * radius + 1);
        }
    }
}
