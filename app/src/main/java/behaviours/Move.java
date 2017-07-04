package behaviours;

/**
 * Created by user on 04/07/2017.
 */

public enum Move {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private String type;
    Move(String type){
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
