package Lesson10.Practice2.utility;

import Lesson10.Practice2.soccer.Game;
import Lesson10.Practice2.soccer.Goal;

import java.util.Arrays;

public class GameUtils {
    public static void addGameGoals(Game currGame) {

        //System.out.println(currGame.awayTeam + " : " + currGame.homeTeam);

        // Or possibly throw an Exception?
        if (currGame.getGoals() == null) {
            currGame.setGoals(new Goal[(int) (Math.random() * 10)]);   // If goals not initialized max will be 9
        }

        //System.out.println(currGame.goals.length);
        int i = 0;
        for (Goal currGoal : currGame.getGoals()) {
            currGoal = new Goal();
            currGoal.setTheTeam(Math.random() > 0.5 ? currGame.getHomeTeam() : currGame.getAwayTeam());
            currGoal.setThePlayer(currGoal.getTheTeam().getPlayerArray()[(int) (Math.random() * currGoal.getTheTeam().getPlayerArray().length)]);
            currGoal.setTheTime((int) (Math.random() * 90));
            currGame.getGoals()[i] = currGoal;
            i++;
        }
        Arrays.sort(currGame.getGoals(), (g1, g2) -> Double.valueOf(g1.getTheTime()).compareTo(Double.valueOf(g2.getTheTime())));

    }
}
