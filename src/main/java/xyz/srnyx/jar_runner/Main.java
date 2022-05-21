package xyz.srnyx.jar_runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) throws IOException {
        // Get the file version
        String version = null;
        final File[] files = new File(".").listFiles();
        if (files != null) for (final File file : files) if (file.isFile()) {
            final String name = file.getName();
            if (name.startsWith(args[0])) version = name.split("-")[2];
        }

        // Run the jar
        final String cmd = "java -jar " + args[0] + version + args[1] + ".jar";
        Process exec = Runtime.getRuntime().exec(cmd);

        // Output the input stream
        final BufferedReader input = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String inLine;
        while ((inLine = input.readLine()) != null) Logger.getLogger("jar_runner").info(inLine);
        // Output the error stream
        final BufferedReader error = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
        String errLine;
        while ((errLine = error.readLine()) != null) Logger.getLogger("jar_runner").warning(errLine);
    }
}