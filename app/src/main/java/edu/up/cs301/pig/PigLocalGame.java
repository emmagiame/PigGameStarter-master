package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.infoMsg.GameState;

import android.util.Log;

import java.util.Random;

// dummy comment, to see if commit and push work from srvegdahl account

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

    private PigGameState pigGameState;

    /**
     * This ctor creates a new game state
     */
    public PigLocalGame() {
        pigGameState = new PigGameState();
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        if(pigGameState.getPlayerId() == playerIdx){
            return true;
        }
        return false;
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        //TODO  You will implement this method
        if(action instanceof PigHoldAction){
           //int turn = pigGameState.getPlayerId();
           int whoisasking = getPlayerIdx(action.getPlayer());
           int numPlayers = players.length;

            if(canMove(whoisasking)){
                if(whoisasking == 0) {
                    int new0Score = pigGameState.getCurrentTotal() + pigGameState.getPlayer0Score();
                    pigGameState.setPlayer0Score(new0Score);
                    pigGameState.setCurrentTotal(0);
                    return true;
                }
                else if(whoisasking == 1){
                    int new1Score = pigGameState.getCurrentTotal() + pigGameState.getPlayer1Score();
                    pigGameState.setPlayer0Score(new1Score);
                    pigGameState.setCurrentTotal(0);
                    return true;
                }
                if(numPlayers == 2){
                    if(whoisasking == 0){
                        pigGameState.setPlayerId(1);
                    }
                    else{
                        pigGameState.setPlayerId(0);
                    }
                }
            }
        }
        else if(action instanceof PigRollAction){
            Random rand = new Random();

        }
        return false;
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method
        return null;
    }

}// class PigLocalGame
