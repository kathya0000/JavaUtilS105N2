package com.testing;

import java.io.*;
import java.util.Properties;

public class DirectoryLister {
    private String directoryPath;
    private String outputPath;

    public DirectoryLister() {
        loadConfig();
    }

    private void loadConfig() {
        Properties prop = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties")) {
            prop.load(input);
            directoryPath = prop.getProperty("directoryPath");
            outputPath = prop.getProperty("outputPath");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void saveDirectoryTree() {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("El directorio no existe.");
            return;
        }
        if (!directory.isDirectory()) {
            System.out.println("El path ingresado no corresponde a un directorio.");
            return;
        }

        StringBuilder output = new StringBuilder();
        saveDirectoryTree(directory, 0, output);

        try (FileWriter writer = new FileWriter(outputPath)) {
            writer.write(output.toString());
            System.out.println("El árbol de directorios se ha guardado en el archivo " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveDirectoryTree(File directory, int indentation, StringBuilder output) {
        // Lógica para guardar el árbol de directorios en el StringBuilder 'output'
    }
}
