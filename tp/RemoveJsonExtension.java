package tp;

import java.io.File;

public class RemoveJsonExtension {
    public static void main(String[] args) {
        String directoryPath = "/Users/adeshpadwal/Downloads/Takeout/Google Photos/Adesh"; // Replace with your directory path

        File directory = new File(directoryPath);
        if (!directory.isDirectory()) {
            System.out.println("Not a valid directory path.");
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("No files found in the directory.");
            return;
        }

        for (File file : files) {
            System.out.print("=");
            if (file.isFile() && file.getName().endsWith(".json")) {
                String newName = file.getName().replace(".json", "");
                File newFile = new File(directoryPath, newName);
                if (file.renameTo(newFile)) {
                    System.out.println("Renamed: " + file.getName() + " to " + newFile.getName());
                } else {
                    System.out.println("Failed to rename: " + file.getName());
                }
            }
        }
    }
}
