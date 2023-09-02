package tp;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class MoveMediaFiles {

    public static void main(String[] args) {
        String sourceDirectoryPath = "/Users/adeshpadwal/Downloads/Takeout/Google Photos";
        String destinationDirectoryPath = "/Users/adeshpadwal/Desktop/adeshp948@gmail.com/photos";

        File sourceDirectory = new File(sourceDirectoryPath);
        File destinationDirectory = new File(destinationDirectoryPath);

        if (!sourceDirectory.exists() || !sourceDirectory.isDirectory()) {
            System.out.println("Source directory does not exist: " + sourceDirectoryPath);
            return;
        }

        if (!destinationDirectory.exists()) {
            destinationDirectory.mkdirs();
        }

        moveMediaFiles(sourceDirectory, destinationDirectory);
    }

    public static void moveMediaFiles(File sourceDirectory, File destinationDirectory) {
        File[] files = sourceDirectory.listFiles();
        if (files == null) {
            System.out.println("Error listing files in directory: " + sourceDirectory.getAbsolutePath());
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                moveMediaFiles(file, destinationDirectory);
            } else {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") ||
                        fileName.endsWith(".png") || fileName.endsWith(".gif") ||
                        fileName.endsWith(".mp4") || fileName.endsWith(".avi") ||
                        fileName.endsWith(".heic") || fileName.endsWith(".dng")) {

                    Path sourceFilePath = file.toPath();
                    Path destinationFilePath = new File(destinationDirectory, file.getName()).toPath();

                    try {
                        Files.move(sourceFilePath, destinationFilePath, StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Moved: " + file.getAbsolutePath());
                    } catch (IOException e) {
                        System.out.println("Error moving file: " + file.getAbsolutePath());
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
