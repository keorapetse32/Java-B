package Lesson15.play;

import Lesson15.event.GameEvent;
import Lesson15.event.Goal;


public class GameResult {
    
 
    private final Team homeTeam;
    private final Team awayTeam;
    private Team winner;
    private int homeTeamGoals;
    private int awayTeamGoals;
    private boolean isDrawn;

 
    public boolean isDrawnGame() {
        return isDrawn;
    } 
    

    public Team getWinner()  {
        return this.winner;
    }  
    public int getHomeTeamScore(){
        return this.homeTeamGoals;
    }
    public int getAwayTeamScore(){
        return this.awayTeamGoals;
    }
   

   public GameResult(Game currGame) {
        this.homeTeam = currGame.getHomeTeam();
        this.awayTeam = currGame.getAwayTeam();
        getScore(currGame);       
         if (homeTeamGoals == awayTeamGoals){
            this.isDrawn = true;       
        } else if (homeTeamGoals > awayTeamGoals) {
            this.winner = this.homeTeam;
        } else {
            this.winner = this.awayTeam;
        }

    }
    
    private void getScore(Game currGame) {
       for (GameEvent currEvent: currGame.getEvents()) {
            if (currEvent instanceof Goal) {
                if (currEvent.getTheTeam()==currGame.getHomeTeam()){
                    this.homeTeamGoals++;
                } else {
                    this.awayTeamGoals++;
                }

            }
       }
    } 


    public Team getHomeTeam() {
        return homeTeam;
    }


    public Team getAwayTeam() {
        return awayTeam;
    }
 
}
