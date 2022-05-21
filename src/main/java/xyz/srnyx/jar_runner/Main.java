package xyz.srnyx.jar_runner;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String version = null;
        final File[] files = new File(".").listFiles();
        if (files != null) for (final File file : files) if (file.isFile()) {
            final String name = file.getName();
            if (name.startsWith("srnyx-Bot-")) version = name.split("-")[2];
        }

        final String cmd = "java -jar srnyx-Bot-" + version + "-all.jar";
        Runtime.getRuntime().exec(cmd).waitFor();
    }
}