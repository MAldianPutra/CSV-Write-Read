package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String Altitude = "10";
        String Pitch = "20";
        String Yaw = "40";
        String Filepath = "test.txt";
        CSVWriter(Altitude, Pitch, Yaw, Filepath);
    }
    public static void CSVWriter(String Altitude, String Pitch, String Yaw, String Filepath){
        try{
            FileWriter fileWriter = new FileWriter(Filepath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(Altitude+","+Pitch+","+Yaw);
            printWriter.flush();
            printWriter.close();
        }catch(Exception e){

        }finally {
            System.out.println("Done Writing");
        }
    }
}
