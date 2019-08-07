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
public class shoutOutCannedMessagesTest {
    
    public shoutOutCannedMessagesTest() {
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
     * Test of cannedMessages method, of class shoutOutCannedMessages.
     */
    @Test
    public void testCannedMessages() {
        System.out.println("cannedMessages");
        shoutOutCannedMessages instance = new shoutOutCannedMessages();
        instance.cannedMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test 
    public void testI(){
        int i = 11;
    }
    @Test
    public void testInegative(){
        int i = -33;
    }
    @Test
    public void testIright(){
        int i = 4;
    }
}
