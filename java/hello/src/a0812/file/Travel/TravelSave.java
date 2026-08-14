package a0812.file.Travel;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TravelSave {
    public static void main(String[] args) {
        Travel[] travels = {
            new Travel("제주", 3, 400000),
            new Travel("부산", 2, 250000),
            new Travel("도쿄", 5, 1200000)
        };

        Path folderPath = Path.of("C:/abcdf");
        Path filePath = folderPath.resolve("travel.txt");

        try {
            // 폴더가 없으면 자동으로 생성
            Files.createDirectories(folderPath);

            BufferedWriter writer =
                    Files.newBufferedWriter(filePath, StandardCharsets.UTF_8);

            writer.write("===== 여행 정보 =====");
            writer.newLine();

            for (Travel travel : travels) {
                writer.write("도시 : " + travel.getCity());
                writer.newLine();

                writer.write("일수 : " + travel.getDays());
                writer.newLine();

                writer.write("비용 : " + travel.getCost());
                writer.newLine();
                writer.newLine();
            }

            writer.close();

            System.out.println("여행 정보 저장 완료");

        } catch (IOException e) {
            System.out.println("저장 실패");
        }
    }
}