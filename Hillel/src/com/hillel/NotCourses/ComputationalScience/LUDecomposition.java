package com.hillel.notCourses.computationalScience;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Lesha on 002 02.06.15.
 */
public class LUDecomposition {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/data.txt"));
        double[][] A = {{3, -1}, {4, 0}};
        outputStream.writeObject(A);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hillel/data.txt"));
        A = (double[][]) inputStream.readObject();
        inputStream.close();

        int n = A.length;
        double detA = 1;
        double[][] L = new double[n][n];
        double[][] U = new double[n][n];
        double[][] X = new double[n][n];

        System.out.println("Matrix A:" + "\n");
        matrixDisplay(A, n);

        LUDecompositionMethod(A, U, L, n);

        reversedMatrix(n, L, U, X);

        detA = determinantA(n, detA, U);

        System.out.println("\n\n" + "Matrix U:");
        matrixDisplay(U, n);
        System.out.println("\n\n" + "Matrix L:");
        matrixDisplay(L, n);
        System.out.println("\n\n" + "Matrix X:");
        matrixDisplay(X, n);
        System.out.println("\n\n" + "Determinant of A: " + detA);
    }

    private static double determinantA(int n, double detA, double[][] u) {
        for (int i = 0; i < n; i++) {
            detA *= u[i][i];
        }
        return detA;
    }

    private static void reversedMatrix(int n, double[][] l, double[][] u, double[][] x) {
        x[n - 1][n - 1] = 1 / u[n - 1][n - 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {


                double sum;


                if (i == j) {
                    sum = 0;
                    for (int p = j + 1; p < n; p++) {
                        sum += u[j][p] * x[p][j];
                    }
                    x[j][j] = (1 - sum) / u[j][j];
                } else if (i < j) {
                    sum = 0;
                    for (int p = i + 1; p < n; p++) {
                        sum += u[i][p] * x[p][j];
                    }
                    x[i][j] = -sum / u[i][i];
                } else {
                    sum = 0;
                    for (int p = j + 1; p < n; p++) {
                        sum += x[i][p] * l[p][j];
                    }
                    x[i][j] = -sum;
                }
            }
        }
    }

    private static void LUDecompositionMethod(double[][] a, double[][] U, double[][] L, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                U[0][i] = a[0][i];
                L[i][0] = a[i][0] / U[0][0];
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += L[i][k] * U[k][j];
                }

                if (i > j) {
                    U[i][j] = 0;
                } else {
                    U[i][j] = a[i][j] - sum;
                }

                if (i > j) {
                    L[j][i] = 0;
                } else if (i == j) {
                    L[i][j] = 1;
                } else {
                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += L[j][k] * U[k][i];
                    }
                    L[j][i] = (a[j][i] - sum) / U[i][i];
                }
            }
        }
    }

    private static void matrixDisplay(double[][] array, int length) throws IOException, ClassNotFoundException {
        int k = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
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
