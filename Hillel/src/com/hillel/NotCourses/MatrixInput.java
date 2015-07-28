package com.hillel.NotCourses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Alexey on 008 08.07.15.
 */
public class MatrixInput implements ActionListener{
    private final String directory;

    public MatrixInput (String directory){
        this.directory = directory;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //ex1();
        /*ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/data.txt"));
        double[][] a = {{3, -1}, {4, 0}};
        outputStream.writeObject(a);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hillel/data.txt"));
        a = (double[][]) inputStream.readObject();
        inputStream.close();*/
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert quantity of equations");
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        N = scanner.nextInt();
        double[][] A = new double[N][N];
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("C:\\Users\\Alexey\\Desktop\\Matrix.txt")));
        String line;
        int i = 0;
        while ((line = inputStream.readLine()) != null) {
            String[] strs = line.split(" ");
            int k = 0;
            for (String str : strs) {
                A[i][k] = Double.parseDouble(str);
                k++;
            }
            i++;
        }
        for (int p = 0; p < 4; ++p, System.out.println())
            for (int j = 0; j < 4; ++j)
                System.out.print(A[p][j] + " ");
        inputStream.close();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /*private static void ex1() throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Alexey\\Desktop\\Matrix2.txt")));
        String sizes = br.readLine();
        st = new StringTokenizer(sizes, " \n", false);

        int aWidth, aHeight;

        //read 4 numbers
        aHeight = Integer.parseInt(st.nextToken());
        aWidth = Integer.parseInt(st.nextToken());
        Double [][]a = new Double[aHeight][aWidth];

        StringBuilder sb = new StringBuilder();

        String str;
        while((str = br.readLine()) != null)
            sb.append(str);
        st = new StringTokenizer(sb.toString(), " \n", false);

        //reading A matrix
        for(int i = 0; i < aHeight; i++){
            for(int j = 0; j < aWidth; j++)
                a[i][j] = Double.parseDouble(st.nextToken());
        }
        for (int i = 0; i < aHeight; ++i, System.out.println())
            for (int j = 0; j < aWidth; ++j)
                System.out.print(a[i][j] + " ");
    }*/
}
