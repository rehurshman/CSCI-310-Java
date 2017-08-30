/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randy
 */
public class JavaApplication2Test {
    
    public JavaApplication2Test() {
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
     * Test of main method, of class JavaApplication2.
     */
   
    /**
     * Test of square method, of class JavaApplication2.
     */
    @Test
    public void testSquare() {
        System.out.println("square");
        double num = 2.0;
        JavaApplication2 instance = new JavaApplication2();
        double expResult = 4.0;
        double result = instance.square(num);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    @Test
     public void testSquare1() {
        System.out.println("square");
        double num = 4.0;
        JavaApplication2 instance = new JavaApplication2();
        double expResult = 16.0;
        double result = instance.square(num);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
     
    }
     @Test
      public void testSquare2() {
        System.out.println("square");
        double num = 0.0;
        JavaApplication2 instance = new JavaApplication2();
        double expResult = 0.0;
        double result = instance.square(num);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
     
    }
       @Test
      public void testSquare3() {
        System.out.println("square");
        double num = 2.5;
        JavaApplication2 instance = new JavaApplication2();
        double expResult = 6.25;
        double result = instance.square(num);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
     
    }
}
