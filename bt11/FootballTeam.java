package bts16.bt11;

public class FootballTeam {
    private int Id,numberOfPlayer,score;
    private String Name;

    public FootballTeam() {
    }

    public FootballTeam(int id, int numberOfPlayer, int score, String name) {
        Id = id;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
