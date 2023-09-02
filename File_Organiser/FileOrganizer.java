package File_Organiser;



import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FileOrganizer {

    public static void main(String[] args) {
        String sourceDirectory = "/Users/adeshpadwal/Desktop/adeshp948@gmail.com/Takeout";
        String destinationDirectory = "/Users/adeshpadwal/Desktop/adeshp948@gmail.com/final";

        organizeFiles(sourceDirectory, destinationDirectory);
    }

    public static void organizeFiles(String sourceDir, String destDir) {
        File sourceDirectory = new File(sourceDir);
        File[] files = sourceDirectory.listFiles();

        if (files == null) {
            System.out.println("Source directory is empty or does not exist.");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                organizeFiles(file.getAbsolutePath(), destDir);
            } else {
                String fileName = file.getName().toLowerCase();
                String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

                String destSubdirectory = determineSubdirectory(extension);
                if (destSubdirectory != null) {
                    File destSubdir = new File(destDir + File.separator + destSubdirectory);
                    destSubdir.mkdirs();

                    File destFile = new File(destSubdir.getAbsolutePath() + File.separator + fileName);
                    file.renameTo(destFile);
                    System.out.println("Moved: " + file.getAbsolutePath() + " to " + destFile.getAbsolutePath());
                }
            }
        }
    }

    public static String determineSubdirectory(String extension) {
        Map<String, String> extensionToFolderMap = new HashMap<>();
        extensionToFolderMap.put("jpg", "Images");
        extensionToFolderMap.put("jpeg", "Images");
        extensionToFolderMap.put("png", "Images");
        extensionToFolderMap.put("gif", "Images");
        extensionToFolderMap.put("mp4", "Videos");
        extensionToFolderMap.put("avi", "Videos");
        extensionToFolderMap.put("mkv", "Videos");
        extensionToFolderMap.put("pdf", "PDFs");
        extensionToFolderMap.put("heic", "Images");
        extensionToFolderMap.put("dng", "Images");
        extensionToFolderMap.put("3gp", "Videos");   // 3GP files go to the Videos folder
        extensionToFolderMap.put("json", "JSON");    // JSON files go to the JSON folder
        extensionToFolderMap.put("mov", "Videos");   // MOV files go to the Videos folder
        extensionToFolderMap.put("docx", "Documents"); // DOCX files go to the Documents folder
        extensionToFolderMap.put("doc", "Documents");  // DOC files go to the Documents folder
        extensionToFolderMap.put("xlsx", "Documents"); // XLSX files go to the Documents folder
        // Add more extensions and corresponding folders as needed

        return extensionToFolderMap.getOrDefault(extension, "OtherFiles");
    }
}
