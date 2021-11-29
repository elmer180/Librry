package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
// you have a global scanner and  write to file
public class Main {
    private static File LIBARBY = new File("Book storage.txt");

    public static void main(String[] args) {
        DeleteFile();
        CreateFile();
        addinfo();

    }
    public static void CreateFile() {
        try {
            if (LIBARBY.createNewFile()) {
                System.out.println("File created: " + LIBARBY.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void addinfo(){
        Scanner input = new Scanner(System.in);
        try {
            FileWriter myWriter = new FileWriter(LIBARBY.getName(), true);
            System.out.println("what is the book title");
            myWriter.write(input.next()+",");
            System.out.println("what is the book ISBN");
            myWriter.write(input.next()+",");
            System.out.println("what is the book Author");
            myWriter.write(input.next()+",");
            System.out.println("what is the book Genre");
            myWriter.write(input.next()+",");
            myWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void DeleteFile() {
        if (LIBARBY.delete()) {
            System.out.println("Deleted the file: " + LIBARBY.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
