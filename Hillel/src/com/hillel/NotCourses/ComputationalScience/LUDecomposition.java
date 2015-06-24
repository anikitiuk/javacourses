package com.hillel.NotCourses.ComputationalScience;

import java.io.*;

/**
 * Created by Lesha on 002 02.06.15.
 */
public class LUDecomposition {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/data.txt"));
        double[][] a = {{3, -1}, {4, 0}};
        outputStream.writeObject(a);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hillel/data.txt"));
        a = (double[][]) inputStream.readObject();
        inputStream.close();

        int n = a.length;
        double detA =1;

        double[][] l = new double[n][n];
        double[][] u = new double[n][n];
        double[][] x = new double[n][n];

        System.out.println("\n"+"Matrix A:");
        matrixDisplay(a);

        luDecompose(a, u, l);

        reversedMatrix(n, l, u, x);

        detA = determinantA(n, detA, u);

        System.out.println("\n\n" + "Matrix U:");
        matrixDisplay(u);
        System.out.println("\n\n" + "Matrix L:");
        matrixDisplay(l);
        System.out.println("\n\n" + "Matrix X:");
        matrixDisplay(x);
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

    private static void luDecompose(double[][] a, double[][] u, double[][] l) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                u[0][i] = a[0][i];
                l[i][0] = a[i][0] / u[0][0];
                double sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += l[i][k] * u[k][j];
                }

                if (i > j) {
                    u[i][j] = 0;
                } else {
                    u[i][j] = a[i][j] - sum;
                }

                if (i > j) {
                    l[j][i] = 0;
                } else if (i == j) {
                    l[i][j] = 1;
                } else {
                    sum = 0;
                    for (int k = 0; k < i; k++) {
                        sum += l[j][k] * u[k][i];
                    }
                    l[j][i] = (a[j][i] - sum) / u[i][i];
                }
            }
        }
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
