package day30_Inheritance2.SportTask;

public class Baseball extends Sport{

    private static int numberOfBases, numberOfStrikes;

    private String theGreatBambino;

    static {
        numberOfBases = 4;
        numberOfStrikes = 3;
    }

    public Baseball(String rules, int numberOfPlayers, int numberOfReferees, String theGreatBambino) {
        super(rules, numberOfPlayers, numberOfReferees);
        setTheGreatBambino(theGreatBambino);
    }

    public static int getNumberOfBases() {
        return numberOfBases;
    }

    public static void setNumberOfBases(int numberOfBases) {
        Baseball.numberOfBases = numberOfBases;
    }

    public static int getNumberOfStrikes() {
        return numberOfStrikes;
    }

    public static void setNumberOfStrikes(int numberOfStrikes) {
        Baseball.numberOfStrikes = numberOfStrikes;
    }

    public String getTheGreatBambino() {
        return theGreatBambino;
    }

    public void setTheGreatBambino(String theGreatBambino) {
        this.theGreatBambino = theGreatBambino;
    }

    public void homerun(){
        System.out.println(theGreatBambino + " hit 714 home runs in his career " +
                "solidifying him as one of the all time greats!");
    }

    public String toString() {
        return "Baseball{" +
                ", rules='" + getRules() + '\'' +
                ", numberOfPlayers=" + getNumberOfPlayers() +
                ", numberOfReferees=" + getNumberOfReferees() +
                ", numberOfBases='" + numberOfBases + '\'' +
                ", numberOfStrikes='" + numberOfStrikes + '\'' +
                ", theGreatBambino='" + theGreatBambino + '\'' +
                '}';
    }
}
