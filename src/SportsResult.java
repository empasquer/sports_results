import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class SportsResult {
    private String team1;
    private String team2;
    private String result;

    public SportsResult(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    // Method to generate a random result (winner or draw)
    public void generateRandomResult() {
        Random random = new Random();
        int winner = random.nextInt(3);

        switch (winner) {
            case 0:
                setResult(getTeam1() + " wins");
                break;
            case 1:
                setResult(getTeam2() + " wins");
                break;
            case 2:
                setResult("Draw");
                break;
        }
    }

}

