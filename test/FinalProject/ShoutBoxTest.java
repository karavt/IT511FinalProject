/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kara.rajchel
 */
public class ShoutBoxTest {
    
    public ShoutBoxTest() {
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
     * Test of shoutOutRandomMessages method, of class ShoutBox.
     */
    @Test
    public void testShoutOutRandomMessages() {
        System.out.println("shoutOutRandomMessages");
        ShoutBox instance = new ShoutBox();
        instance.shoutOutRandomMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testChoice(){
        int choice = -3;
    }
    @Test
    public void testChoiceGood(){
        int choice = 2;
    }
    @Test
    public void testChoiceHigh(){
        int choice = 87633;
    }
}
