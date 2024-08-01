package cuesz.allure.reporting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AllureServeRunner {

    public static void runAllureServe() {
        String allureResultsPath = getAllureResultsPath();
        try {
            ProcessBuilder processBuilder;
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                // For Windows
                processBuilder = new ProcessBuilder("cmd.exe", "/c", "allure serve " + allureResultsPath);
            } else {
                // For Unix-based systems (e.g., macOS, Linux)
                processBuilder = new ProcessBuilder("/bin/sh", "-c", "/usr/local/Cellar/allure/2.29.0/libexec/bin/allure serve " + allureResultsPath);
            }

            // Print the command for debugging purposes
            System.out.println("Running command: " + String.join(" ", processBuilder.command()));

            processBuilder.inheritIO();
            Process process = processBuilder.start();
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String getAllureResultsPath() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String allureResultsDir = properties.getProperty("allure.results.path", "allure-results");

        // Get the project root directory
        String projectRoot = new File("").getAbsolutePath();

        // Construct the full path to the allure results directory
        return new File(projectRoot, allureResultsDir).getAbsolutePath();
    }

    public static void main(String[] args) {
        runAllureServe();
    }
}
