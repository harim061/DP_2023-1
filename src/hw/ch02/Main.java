package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties(); // 어댑터 생성
        System.out.println("20210985 노하림");
        System.out.println();

        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2002");
            f.setValue("StudentId", "20210985");
            f.setValue("Name", "HaRimNoh");
            f.setValue("Location", "Gwangju");
            f.writeToFile("HaRimNoh.txt");
            System.out.println("HaRimNoh.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
