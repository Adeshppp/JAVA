package tp;

import java.io.*;

public class SRTFileDeleter {

    public static void main(String[] args) {
        String rootDirectory = "/Users/adeshpadwal/Courses";
        deleteSRTFiles(rootDirectory);
    }

    public static void deleteSRTFiles(String directoryPath) {
        File rootDirectory = new File(directoryPath);
        File[] files = rootDirectory.listFiles();

        if (files == null) {
            System.out.println("Source directory is empty or does not exist.");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                deleteSRTFiles(file.getAbsolutePath());
            } else {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".srt")) {
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
