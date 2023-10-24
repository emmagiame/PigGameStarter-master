package edu.up.cs301.pig;

import edu.up.cs301.game.Game;
import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {

    private int playerId;
    private int player0Score;
    private int player1Score;
    private int currentTotal;
    private int valueOfDie;

    public PigGameState() {
        this.playerId = 0;
        this.player0Score = 0;
        this.player1Score = 0;
        this.currentTotal = 0;
        this.valueOfDie = 1;
    }

    public PigGameState(PigGameState copyState){
        this.playerId = copyState.playerId;
        this.player0Score = copyState.player0Score;
        this.player1Score = copyState.player1Score;
        this.currentTotal = copyState.currentTotal;
        this.valueOfDie = copyState.valueOfDie;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getPlayer0Score() {
        return player0Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getCurrentTotal() {
        return currentTotal;
    }

    public int getValueOfDie() {
        return valueOfDie;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setPlayer0Score(int player0Score) {
        this.player0Score = player0Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setCurrentTotal(int currentTotal) {
        this.currentTotal = currentTotal;
    }

    public void setValueOfDie(int valueOfDie) {
        this.valueOfDie = valueOfDie;
    }


}
