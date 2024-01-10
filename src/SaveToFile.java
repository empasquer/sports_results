import java.io.*;

public class SaveToFile {
    public void save(String fileName, SportsResult sportResult) {
        String team1 = sportResult.getTeam1();
        String team2 = sportResult.getTeam2();
        String result = sportResult.getResult();

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append(team1)
                    .append(",")
                    .append(team2)
                    .append(",")
                    .append(result)
                    .append(";")
                    .append("\n");
            writer.close(); // redundant -> try catch auto end in its scope
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
