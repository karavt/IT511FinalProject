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
public class myPetTest {
    
    public myPetTest() {
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
     * Test of getName method, of class myPet.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        myPet instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecies method, of class myPet.
     */
    @Test
    public void testGetSpecies() {
        System.out.println("getSpecies");
        myPet instance = null;
        String expResult = "";
        String result = instance.getSpecies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class myPet.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        myPet instance = null;
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class myPet.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        myPet instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class myPet.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        myPet instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpecies method, of class myPet.
     */
    @Test
    public void testSetSpecies() {
        System.out.println("setSpecies");
        String species = "";
        myPet instance = null;
        instance.setSpecies(species);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class myPet.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        myPet instance = null;
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class myPet.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        myPet instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testAge(){
        int age= -1;
    }
    @Test 
    public void testAge2() {
        int age = 88;
    }

    /**
     * Test of setNickName method, of class myPet.
     */
    @Test
    public void testSetNickName() {
        System.out.println("setNickName");
        String nickName = "";
        myPet instance = null;
        instance.setNickName(nickName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void TestNick(){
        String nickName = "Baby";
    }
    @Test 
    public void TestNickName(){
        String nickName = "7";
    }
    /**
     * Test of main method, of class myPet.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        myPet.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of petSound method, of class myPet.
     */
    @Test
    public void testPetSound() {
        System.out.println("petSound");
        String sound = "";
        myPet instance = null;
        String expResult = "";
        String result = instance.petSound(sound);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void TestSound(){
        String petSound = "Moo";
    }
    @Test
    public void TestSoundRIght(){
        String petSound = "Meow";
    }
    @Test
    public void TestSpecies() {
        String species = "Dog";
        
    }
    
}
