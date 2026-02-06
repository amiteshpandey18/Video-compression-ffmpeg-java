package com.videoReduce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VideoCompressor {

    public static void main(String[] args) {
        try {
            String inputFile = "C:\\video\\video.mp4";
            String outputFile = "C:\\video\\compress.mp4";

            ProcessBuilder builder = new ProcessBuilder(
                    "ffmpeg",
                    "-i", inputFile,
                    "-vcodec", "libx264",
                    "-crf", "28",
                    "-preset", "fast",
                    outputFile
            );

            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
                    System.out.println("BufferReader COmpleted");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Video compressed successfully!");
            } else {
                System.out.println("Compression failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
