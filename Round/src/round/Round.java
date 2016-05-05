/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

/** 
 *
 * @author Alexander Infante
 */
public class Round 
{
   //this is to test the network to see the status and on what server 
   //to run off of.  This will be run every time a new player starts
   //a new hole
   boolean netConn = true;
   
   //total holes is 18
   int totHoles = 18;
   
   public int currentScore()
   {
       //cuurentScore method will calculate the players score so far
       //(above or below par).
       
       //above par - anything above the maximum number of attempts on a hole
       
       //below par - anything below the minimum number of attempts on a hole
       
       //to get users current score:
       //we need to count up the number of pars for holes played: i.e. hole one
       // is a par 4, hole two is a par 3 so total is 7 pars played so far....
       
       //holesPlayed - used to get the number of holes played
       int holesPlayed;
       
       //this will be used to help calculate the users current score.
       int parTotal;
       
       //this will be used to add up all strokes a customer has done up to a hole
       //at this point if the customer has lets say 6 strokes on the first two
       //holes and the total combined par is 7 for the first two holes, then the user 
       //is -1 under par.
       int attemptsPerHole;
       
       
       
       return 0;
   }
   
   @Test
   public int numberOfHolesPlayed(int holesPlayed, int totHoles)
   {
       //This method will need to calculate how many holes have been played
       //This will be calculated on how many times the ball has fallen into a hole which has 
       //sensors to indicate and return the new numberOfHoles played
       int numberOfHoles = holesPlayed;
       
       //This will calculate the number of holes that are left in the game
       int holesLeft = totHoles - numberOfHoles;
       
       return numberOfHoles;
   }
   
   @Test
   public void enterScore(int strokes)
   {
       //this method takes in 'int strokes' which is the number of times
       //a player took to make the ball in.
       
       //numberOfSwings is storing total attempts for 1 hole.
       int numberOfSwings = strokes;

   }
   
   @Test
   public int[] scoreDetail()
   {
      //this is where the player will swipe his/her card at the end of all the holes
       int[] madeUp = {};
      return madeUp;
   }
   
   @Test 
   public boolean NetworkConnection( boolean netConn )
   {
       //this will test the network connection to see if where it stands
       boolean check = netConn;
       
       //check to see if we should stay on the main server or switch to the in 
       //house server

       return check;
   }
   
}
