package day30_Inheritance2.SportTask;

public class Football extends Sport{

    private static String gameTime = "90 minutes";

    private String bestTeam;

    public Football(String rules, int numberOfPlayers, int numberOfReferees, String bestTeam) {
        super(rules, numberOfPlayers, numberOfReferees);
        setBestTeam(bestTeam);
    }

    public static String getGameTime() {
        return gameTime;
    }

    public static void setGameTime(String gameTime) {
        Football.gameTime = gameTime;
    }

    public String getBestTeam() {
        return bestTeam;
    }

    public void setBestTeam(String bestTeam) {
        this.bestTeam = bestTeam;
    }

    public void champions(){
        System.out.println(bestTeam + " will win the Champions League");
    }

    public String toString() {
        return "Football{" +
                "bestTeam='" + bestTeam + '\'' +
                ", gameTime='" + gameTime + '\'' +
                ", rules='" + getRules() + '\'' +
                ", numberOfPlayers=" + getNumberOfPlayers() +
                ", numberOfReferees=" + getNumberOfReferees() +
                '}';
    }
}
