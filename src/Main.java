import java.io.File;

public class Main {
    File file = new File("sport_results.csv");
    SaveToFile saveToFile = new SaveToFile();

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {

        SportsResult franceDenmarkResults = new SportsResult("France", "Denmark");

        franceDenmarkResults.generateRandomResult();
        saveToFile.save(file.getName(), franceDenmarkResults);
    }
}
