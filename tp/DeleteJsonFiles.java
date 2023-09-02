package tp;

import java.io.File;

public class DeleteJsonFiles {

    public static void main(String[] args) {
        String rootDirectoryPath = "/Users/adeshpadwal/Desktop/adeshp948@gmail.com/Takeout/Google Photos";
        deleteJsonFiles(rootDirectoryPath);
    }

    public static void deleteJsonFiles(String directoryPath) {
        File directory = new File(directoryPath);

        if (!directory.exists()) {
            System.out.println("Directory does not exist: " + directoryPath);
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Error listing files in directory: " + directoryPath);
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                deleteJsonFiles(file.getAbsolutePath()); // Recursively delete in subdirectories
            } else {
                if (file.getName().endsWith(".json")) {
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
