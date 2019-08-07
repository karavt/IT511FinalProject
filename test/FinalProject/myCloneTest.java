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
public class myCloneTest {
    
    public myCloneTest() {
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
     * Test of getName method, of class myClone.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        myClone instance = new myClone();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFavColor method, of class myClone.
     */
    @Test
    public void testGetFavColor() {
        System.out.println("getFavColor");
        myClone instance = new myClone();
        String expResult = "";
        String result = instance.getFavColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testColor() {
        String favColor = "red";
    }
    @Test
    public void testColorNumber(){
        String favColor = "4";
    }
    /**
     * Test of setName method, of class myClone.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        myClone instance = new myClone();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void TestName() {
       String fName = "7";
    }
    
    @Test 
    public void TestMName(){
        String mName = "4";
    }
    @Test
    public void testLname() {
        String lName = "898";
    }
    
    @Test
    public void TestfName(){
        String fName = "Kara";
    }
    @Test
    public void testMname(){
        String mName = "Lynn";
    }
    @Test
    public void testLName(){
        String lName = "Rajchel";
    }
    @Test
    public void testFirstName(){
        String fName = "Sally";
    }
    @Test
    public void TestMiddleName(){
        String mName = "Kelly";
    }
    @Test
    public void TestLastName(){
        String lName = "Vorhees";
    }

    /**
     * Test of setNameMiddle method, of class myClone.
     */
    @Test
    public void testSetNameMiddle() {
        System.out.println("setNameMiddle");
        String middlename = "";
        myClone instance = new myClone();
        instance.setNameMiddle(middlename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNameLast method, of class myClone.
     */
    @Test
    public void testSetNameLast() {
        System.out.println("setNameLast");
        String lastname = "";
        myClone instance = new myClone();
        instance.setNameLast(lastname);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFavColor method, of class myClone.
     */
    @Test
    public void testSetFavColor() {
        System.out.println("setFavColor");
        String favColor = "";
        myClone instance = new myClone();
        instance.setFavColor(favColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class myClone.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        myClone.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of introduction method, of class myClone.
     */
    @Test
    public void testIntroduction() {
        System.out.println("introduction");
        myClone instance = new myClone();
        instance.introduction();
        // TODO review the generated test code and remove the default call to fail.
           String visitorfName = "Danny";
            
        fail("The test case is a prototype.");
    }
    @Test
    public void testIntroNumber() {
        String visitorfName = "4";
    }
    @Test
    public void TestVisitorName(){
        String visitorfName = "Billy";
    }
}

