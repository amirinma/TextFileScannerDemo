package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileScannerDemo {
    public static void main(String [] args){
        PrintWriter outputStream = null;
        try {
            outputStream = new PrintWriter(new FileOutputStream("moreStaff.txt"));
        } catch (FileNotFoundException e){
            System.out.println("Error opening the file to write.");
            System.exit(0);
        }
        outputStream.println("1 2");
        outputStream.println("3 4");
        outputStream.println("I am alright");
        outputStream.close();

        System.out.println("I will read three numbers and a line");
        System.out.println("of text from the file morestaff.txt");

        Scanner inputStream = null;
        try {
            inputStream = new Scanner(new FileInputStream("moreStaff.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File moreStaff.txt was not found.");
            System.out.println("or could not be opened.");
            System.exit(0);
        }

        int n1 = inputStream.nextInt();
        int n2 = inputStream.nextInt();
        int n3 = inputStream.nextInt();
        int n4 = inputStream.nextInt();
        inputStream.nextLine(); // to go to the next line
        String line = inputStream.nextLine();

        System.out.println("The three numbers read from the file are: ");
        System.out.println(n1 + ", " + n2 + ", and " + n3 + " last " + n4);

        System.out.println("The line read from the file is: ");
        System.out.println(line);

        inputStream.close();
        System.out.println("This is for commiting to github");
        System.out.println("This is for commiting to github");
    }
}
