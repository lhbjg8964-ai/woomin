package a0812.file.Travel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TravelRead {
    public static void main(String[] args) {
        Path filePath = Path.of("C:/abcdf/travel.txt");

        try {
            BufferedReader reader =
                    Files.newBufferedReader(filePath, StandardCharsets.UTF_8);

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("파일을 읽을 수 없습니다.");
        }
    }
}