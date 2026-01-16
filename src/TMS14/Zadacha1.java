package TMS14;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Zadacha1 {
    public static void main(String[] args){
        String inputFile = "E:/ДЗ ТМС/Romeo.txt";
        String outputFile = "longword.txt";
        try {
            String book = Files.readString(Path.of(inputFile));
            String[] words = book.split("[\\s\\p{Punct}]+");
            String longword = "";
            for (String word : words) {
                if (word.length() > longword.length()) {
                    longword = word;
                }
            }
            Files.writeString(Path.of(outputFile), longword);
            System.out.println("Самое длинное слово "+ longword);
            System.out.println("Результат в файле "+ outputFile);
        }  catch (IOException e){
            System.out.println("Ошибка " + e.getMessage());
        }
    }
}

