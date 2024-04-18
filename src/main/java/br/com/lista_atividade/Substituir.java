package br.com.lista_atividade;

import java.io.*;

public class Substituir {
    public static void main(String[] args) {
        String inputFileName = "meuarquivo.txt";
        String outputFileName = "meuarquivo_python.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String replacedLine = line.replace("Java", "Python");
                writer.write(replacedLine);
                writer.newLine();
            }

            System.out.println("Substituicao feita com sucesso!");

        } catch (IOException e) {
            System.err.println("Erro! " + e.getMessage());
        }
    }
}
