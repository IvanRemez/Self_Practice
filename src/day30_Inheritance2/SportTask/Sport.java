package day30_Inheritance2.SportTask;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferees;

    public Sport(String rules, int numberOfPlayers, int numberOfReferees) {
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferees(numberOfReferees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {

        if (numberOfPlayers <= 0){
            System.err.println("numberOfPlayers cannot be set to zero or negative");
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferees() {
        return numberOfReferees;
    }

    public void setNumberOfReferees(int numberOfReferees) {

        if (numberOfReferees <= 0){
            System.err.println("numberOfReferees cannot be set to zero or negative");
            System.exit(1);
        }
        this.numberOfReferees = numberOfReferees;
    }

    public void play(){
        System.out.println(numberOfPlayers + " players are playing " + name);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferees=" + numberOfReferees +
                '}';
    }
}
/*
sportTask:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			Encapsulate all the fields
					Conditions:
						1. numberOfPlayers can not be set to zero or negative
						2. numberOfReferre can not be set to zero or negative

			Add a constructor that can set all the fields

			methods:
				play()
				toString()

		2. create the following subclasses of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on Google
 */