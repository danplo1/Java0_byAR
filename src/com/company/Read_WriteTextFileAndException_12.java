package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Daniel_D'AGE on 22.10.2018.
 * #12 - Odczyt/zapis pliku tekstowego i wyjątki
 */

public class Read_WriteTextFileAndException_12 {

    public static void main(String[] args) throws IOException {

        String fileName = "plik.txt";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write("Tekst 1\n"); // \n znak nowego wiersza na końcu linii
            fileWriter.write("Tekst 2\n");
            fileWriter.write("Tekst 3\n");
            fileWriter.write("Tekst 4\n");
            fileWriter.write("Tekst 5\n"); /*gdy plik.txt jest zapisany jako tylko do odczytu to java  nie dopisze
             go i rzuci wyjątek, wówczas*/
            //fileWriter.close();
            //fileWriter.flush(); // po zakonczeniu strumienia, będzie on opróżniony
        } catch (IOException exception) {
            System.out.println("Problem z dostępem do pliku");
        } finally {
            if (fileWriter == null) {
                System.out.println("Houston mamy problem!");
            } else {
                fileWriter.close();
            }
        }

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = null;
            do {
                line = bufferedReader.readLine();
                if (line != null)
                    System.out.println(line);
            } while (line != null);

        } catch (IOException exception) {
            System.out.println("Problem z dostepem do pliku");
        } finally {
            /*if (bufferedReader != null) {
                System.out.println("Mamy problem!");
                bufferedReader.close();
            } else { */
            bufferedReader.close();
        }
    }

}


