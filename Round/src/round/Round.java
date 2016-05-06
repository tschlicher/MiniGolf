/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

/**
 *
 * @author thomas
 */

//all fields so far can be changed or modified to make them better!!
public class Round 
{
   //this is to test the network to see the status and on what server 
   //to run off of.  This will be run every time a new player starts
   //a new hole
   boolean netConn = true;
   
   public int currentScore()
   {
       //cuurentScore method will calculate the players score so far
       //(above or below par).
       
       //above par - anything above the maximum number of attempts on a hole
       
       //below par - anything below the minimum number of attempts on a hole
       
       //to get users current score:
       //we need to count up the number of pars for holes played: i.e. hole one
       // is a par 4, hole two is a par 3 so total is 7 pars played so far....
       
       //holesCompleted - used to get the number of holes played
       int holesCompleted;
       
       //parTotal - used to help calculate the users current score.
       int parTotal;
       
       //attemptsPerHole - used to add up all strokes a customer has done up to a hole
       //at this point if the customer has lets say 6 strokes on the first two
       //holes and the total combined par is 7 for the first two holes, then the user 
       //is -1 under par.
       int attemptsPerHole;
       
       
       
       return 0;
   }
   
   public int numberOfHolesPlayed()
   {
       //This method will need to calculate how many holes have been played
       
       //holesPerRound will hold the maximum amount of holes a user can play
       //this round. i.e. minigolf usually has 9 or 18 holes per a round.
       int holesPerRound;
       
       //holesCompleted - used to find how many holes a user has suceesfully 
       //finished.
       int holesCompleted;
       
       //holesLeft - used to hold the amount of holes a player has left until
       //the round is finished.
       int holesLeft;
       
       return 0;
   }
   
   public void enterScore(int strokes)
   {
       //this method takes in 'int strokes' which is the number of times
       //a player took to make the ball in.
       
       //numberOfSwings - used to store the total attempts for 1 hole.
       int numberOfSwings = strokes;
       
       
       
   }
   
   public int[] scoreDetail()
   {
       //allScores - used to hold all strokes per user per hole for all holes
       //in the round. i.e. hole 1 = 3 stroked, hole 2 = 1 stroke.....
       int[] allScores = {};
      return allScores;
   }
}
