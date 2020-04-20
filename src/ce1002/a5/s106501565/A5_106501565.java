/*
 * Assignment 3
 * Course: CE1002
 * Name: 林柏臣
 * Student ID: 106501565
 */
package ce1002.a5.s106501565;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class A5_106501565 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        boolean shouldQuit = false;
        ArrayList<Transaction> transactions = new ArrayList<>();
        int maxStringLength = 0, maxIncomeLength = 0, maxPayLength = 0;
        while (!shouldQuit){
            int input = scanner.nextInt();
            Transaction transaction;
            String name;
            int income, pay;
            switch (input){
                case 1:
                    name = scanner.next();
                    maxStringLength = Math.max(maxStringLength, name.length());
                    income = scanner.nextInt();
                    maxIncomeLength = Math.max(maxIncomeLength, String.valueOf(income).length());
                    transaction = new Transaction(name);
                    transaction.setIncome(income);
                    transactions.add(transaction);
                    break;
                case 2:
                    name = scanner.next();
                    maxStringLength = Math.max(maxStringLength, name.length());
                    pay = scanner.nextInt();
                    maxPayLength = Math.max(maxPayLength, String.valueOf(pay).length());
                    transaction = new Transaction(name);
                    transaction.setPay(pay);
                    transactions.add(transaction);
                    break;
                case 3:
                    printTransactions(transactions, maxStringLength, maxIncomeLength, maxPayLength);
                    break;
                case 4:
                    shouldQuit = true;
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        }
    }

    static void printTransactions(ArrayList<Transaction> transactions, int maxNameLength, int maxIncomeLength, int maxPayLength){
        int sum = 0;
        for (Transaction transaction : transactions){
            sum += transaction.getIncome();
            sum -= transaction.getPay();
            System.out.printf("%-" + maxNameLength + "s  %-" + maxIncomeLength + "d  %-" + maxPayLength + "d\n", transaction.getName(), transaction.getIncome(), transaction.getPay());
        }
        System.out.println("Total: " + sum);
    }

}
