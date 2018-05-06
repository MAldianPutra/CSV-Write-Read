package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CSV_Writer {
    private static final String newline = ("\n");
    private static final String header = ("Tanggal,Baterai,Altitude,Roll,Pitch,Yaw,Latitude,Longitude,Speed,Status");
    FileWriter fileWriter = null;
    public CSV_Writer() {
    }

    public void WriteCSV(String data, String filepath){
        try {
            fileWriter = new FileWriter(filepath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            printWriter.println(header.toString());
            printWriter.println(newline);
            printWriter.println(data);
            printWriter.println(newline);
            fileWriter.flush();
        }
        catch(Exception e){
            System.out.println("CSV Write Error");
        }
        finally {
            System.out.println("Done Writing");

        }
    }

}
