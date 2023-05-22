package com.testing;

public class Main {
    public static void main(String[] args) {
        DirectoryLister directoryLister = new DirectoryLister();

        // Ejecución desde el editor (IntelliJ)
        directoryLister.saveDirectoryTree();

        // Ejecución desde la línea de comandos
        if (args.length > 0 && args[0].equals("saveDirectoryTree")) {
            directoryLister.saveDirectoryTree();
        }
    }
}