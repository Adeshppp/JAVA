package File_Organiser;

import java.io.*;

public class VTTFileDeleter {

    public static void main(String[] args) {
        String rootDirectory = "/Users/adeshpadwal/Courses";
        deleteVTTFiles(rootDirectory);
    }

    public static void deleteVTTFiles(String directoryPath) {
        File rootDirectory = new File(directoryPath);
        File[] files = rootDirectory.listFiles();

        if (files == null) {
            System.out.println("Source directory is empty or does not exist.");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                deleteVTTFiles(file.getAbsolutePath());
            } else {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".vtt")) {
                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getAbsolutePath());
                    } else {
                        System.out.println("Failed to delete: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
