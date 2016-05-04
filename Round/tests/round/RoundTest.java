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
        if(holesCompleted < 0 || holesCompleted > 18){
              System.out.println("Error: There can't be less than 1 hole in minigolf and no greater than 18 holes.");  
            }
        else if(parTotal < 0 || attempts < 0){
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
        Round instance = new Round();
        int[] expResult = null;
        int[] result = instance.scoreDetail();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
