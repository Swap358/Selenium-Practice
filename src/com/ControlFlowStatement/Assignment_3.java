package com.ControlFlowStatement;

import java.util.Scanner;

public class Assignment_3 {

    public static void main(String[] args) {

        // program to grade students based on their marks
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total marks:");
        int totalMarks = sc.nextInt();

        System.out.println("Enter obtained marks:");
        int marksObtained = sc.nextInt();

        // FIX: use float conversion
        float per = (marksObtained * 100.0f) / totalMarks;

        System.out.println("Percentage -> " + per);

        if (per >= 75) {
            System.out.println("You got " + per + "% and Grade A");
        } else if (per >= 60) {
            System.out.println("You got " + per + "% and Grade B");
        } else if (per >= 50) {
            System.out.println("You got " + per + "% and Grade C");
        } else if (per >= 40) {
            System.out.println("You got " + per + "% and Grade D");
        } else {
            System.out.println("You got " + per + "% and Fail");
        }

        sc.close();
    }
}
