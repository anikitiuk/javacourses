package com.hillel.NotCourses;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Alexey on 002 02.06.15.
 */
public class IterativeMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double eps = 0.001;
        double[][] B = {
                {0, 0.22, -0.11, 0.31},
                {0.38, 0, -0.12, 0.22},
                {0.11, 0.23, 0, -0.51},
                {0.17, -0.21, 0.31, 0}
        };
        int N = B.length;
        matrixDisplay(B);
        double[] F = {2.7, -1.5, 1.2, -0.17};
        double[] X = {0, 0, 0, 0};
        System.out.println("\n\n" + Arrays.toString(X));

        Jacobi(B, F, X, eps, N);

        System.out.println("\n" + Arrays.toString(X));


    }

    private static void Seidel(double[][] B, double[] F, double[] X, double eps, int n) {
        double tempJ;
        int c=0;
        double[] tempX = new double[n];
        double norm;
        do {
            c++;
            for (int i = 0; i < n; i++) {
                tempJ = 0;
                for (int j = 0; j < i-1; j++) {
                    tempJ += B[i][j] * X[j];
                }
                tempX[i] = tempJ + F[i];
            }
            norm = Math.abs(X[0] - tempX[0]);
            for (int h = 0; h < n; h++) {
                if (Math.abs(X[h] - tempX[h]) > norm)
                    norm = Math.abs(X[h] - tempX[h]);
                X[h] = tempX[h];

            }
        } while (norm > eps);
        System.out.println("\nSteps' Quantity: " + c);
    }

    private static void Jacobi(double[][] B, double[] F, double[] X, double eps, int n) {
        double tempJ;
        int c=0;
        double[] tempX = new double[n];
        double norm; // норма, определяемая как наибольшая разность компонент столбца иксов соседних итераций.
        do {
            c++;
            for (int i = 0; i < n; i++) {
                tempJ = 0;
                for (int j = 0; j < n; j++) {
                    tempJ += B[i][j] * X[j];
                }
                tempX[i] = tempJ + F[i];
            }
            norm = Math.abs(X[0] - tempX[0]);
            for (int h = 0; h < n; h++) {
                if (Math.abs(X[h] - tempX[h]) > norm)
                    norm = Math.abs(X[h] - tempX[h]);
                    X[h] = tempX[h];

            }
        } while (norm > eps);
        System.out.println("\nSteps' Quantity: " + c);
    }

    private static void matrixDisplay(double[][] array) throws IOException, ClassNotFoundException {
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (k != i) {
                    System.out.println("\t");
                }
                k = i;
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(array[i][j]);
            }
        }
    }
}
