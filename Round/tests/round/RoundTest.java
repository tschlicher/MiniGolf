/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class RoundTest {
    
    public RoundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of currentScore method, of class Round.
     */
    @Test
    public void testCurrentScore() {
        System.out.println("currentScore");
        int holesCompleted = 3;
        int parTotal = 12;
        int attempts = 10;
        Round instance = new Round();
        int expResult = 2;
        int result = instance.currentScore(holesCompleted, parTotal, attempts);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCurrentScore2() {
        System.out.println("currentScore");
        int holesCompleted = -1;
        int parTotal = 0;
        int attempts = 0;
        if(parTotal < 0 || attempts < 0){
            System.out.println("Error: There can't be negative numbers for parTotal or attemps"); 
        }
        else if(holesCompleted == 0 && parTotal == 0 && attempts == 0){
            System.out.println("Error: Game has not yet been started");
        }
        Round instance = new Round();
        int expResult = 0;
        int result = instance.currentScore(holesCompleted, parTotal, attempts);
        assertEquals(expResult, result);
    }
    
    @Test()
    public void testCurrentScore3() {
        System.out.println("currentScore");
        int holesCompleted = 3;
        int parTotal = 12;
        int attempts = 10;
        if(holesCompleted < 0){
            System.out.println("Error: There can't be negative amount of holes completed in minigolf!");  
        }
        Round instance = new Round();
        int expResult = 2;
        int result = instance.currentScore(holesCompleted, parTotal, attempts);
        assertEquals(expResult, result);
    }
    /**
     * Test of numberOfHolesPlayed method, of class Round.
     */
    @Test
    public void testNumberOfHolesPlayed() {
        System.out.println("numberOfHolesPlayed");
        Round instance = new Round();
        int expResult = 0;
        int result = instance.numberOfHolesPlayed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enterScore method, of class Round.
     */
    @Test
    public void testEnterScore() {
        System.out.println("enterScore");
        int strokes = 0;
        Round instance = new Round();
        instance.enterScore(strokes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scoreDetail method, of class Round.
     */
    @Test
    public void testScoreDetail() {
        System.out.println("scoreDetail");
        int[] score = {2,5,6,3,1,4,2,1,5};
        if(score.length == 9 || score.length == 18){
            System.out.println("There are 8 scores and 8 holes played, works fine");
        }
        else if(score.length != 9){
            System.out.println("There needs to be 9 scores exact for a 9 hole minigolf game!");
        }
        Round instance = new Round();
        int[] expResult = null;
        int[] result = instance.scoreDetail(score);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testScoreDetail2() {
        System.out.println("scoreDetail");
        int[] score = {2,5,6,3,1,4,2,1,5,6,4,6,4,2,3,3,4,5};
        if(score.length != 18){
            System.out.println("There needs to be 18 scores exact for a 9 hole minigolf game!");
        }
        Round instance = new Round();
        int[] expResult = null;
        int[] result = instance.scoreDetail(score);
        assertArrayEquals(expResult, result);
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
