package com.hillel.io;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * Created by ANikitiuk on 01.06.2015.
 */
public class IoMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/data.txt"));
        long[] array = {12L, 13L, 243434545345L};
        outputStream.writeObject(array);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hillel/data.txt"));
        array = (long[]) inputStream.readObject();
        System.out.println(Arrays.toString(array));
        inputStream.close();

    }

    private static void prmitives() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("hillel/data.txt"));
        long[] array = {12L, 13L, 243434545345L};

        for (long l : array) {
            dataOutputStream.writeLong(l);
        }
        dataOutputStream.close();

        DataInputStream dataInputStream = new DataInputStream( new FileInputStream("hillel/data.txt"));

        while (true) {
            try {
                long l = dataInputStream.readLong();
                System.out.println(l);
            }catch (EOFException e){
                break;
            }
        }

        dataInputStream.close();
    }

    private static void bufferedVsUnbuffered() throws IOException {
        Instant begin = Instant.now();
        bufferedCopy();
        Instant end = Instant.now();
        System.out.println("buffered copy: " + Duration.between(begin, end).toMillis());

        begin = Instant.now();
        byteCopy();
        end = Instant.now();
        System.out.println("unbuffered copy: " + Duration.between(begin, end).toMillis());
    }

    private static void bufferedCopy() throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader("hillel/myFile.txt"));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter("hillel/copy_myFile.txt"));
        String value;
        while ((value = inputStream.readLine()) != null) {
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();
    }

    private static void streamReader() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("hillel/myFile.txt"));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("hillel/copy_myFile.txt"));
        int value;
        while ((value = inputStreamReader.read()) != -1) {
            outputStreamWriter.write(value);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }

    private static void swingFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(null);

        if (res == 0) {
            File file = fileChooser.getSelectedFile();
            Path path = file.toPath();
        }
    }

    private static void byteCopy() {
        try (InputStream inputStream = new FileInputStream("hillel/myFile.txt");
             OutputStream outputStream = new FileOutputStream("hillel/copy_myFile.txt")) {

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void uglyPriorJava() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("hillel/myFile.txt");

            outputStream = new FileOutputStream("hillel/copy_myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {

                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {

                }
            }
        }
    }

    private static void fileCreation() throws IOException {
        Path path = Paths.get("hillel/myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("/hillel/myFile.txt");
        System.out.println(absolutePath);
        System.out.println(absolutePath.toAbsolutePath());

        System.out.println(path.toString() + " exists: " + Files.exists(path));

        Files.createFile(path);
    }

    private static void differentPathes() {
        System.out.println("yes\\no"); //экранирование слэша
        String path = "c:\\program files\\myProgram";
        String path2 = "c:/program files/myProgram";
        String path3 = "c:\\program files/myProgram";
    }
}
