/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

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
public class JavaApplication1Test {
    
    public JavaApplication1Test() {
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
     * Test of getArea method, of class JavaApplication1.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        double radius = 0.0;
        JavaApplication1 instance = new JavaApplication1();
        double expResult = 0.0;
        double result = instance.getArea(radius);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     public void testGetAreaMoon() {
        System.out.println("getArea");
        double radius = 1.737e6;
        JavaApplication1 instance = new JavaApplication1();
        double expResult = 0;
        double result = instance.getArea(radius);
        assertEquals(expResult, result, 1e-10);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class JavaApplication1.
     */
    @Test
    public void testMain() {
        System.out.println("main skipped");
       
    }

    /**
     * Test of run method, of class JavaApplication1.
     */
    @Test
    public void testRun() {
        System.out.println("run skipped");
       
    }

    /**
     * Test of getColorForCode method, of class JavaApplication1.
     */
    @Test
    public void testGetColorForCodeBlue() {
        System.out.println("getColorForCode");
        int code = JavaApplication1.BLUE;
        JavaApplication1 instance = new JavaApplication1();
        String expResult = "blue";
        String result = instance.getColorForCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }
      @Test
    public void testGetColorForCodeRed() {
        System.out.println("getColorForCode");
        int code = JavaApplication1.RED;
        JavaApplication1 instance = new JavaApplication1();
        String expResult = "red";
        String result = instance.getColorForCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
 
    }
    @Test
    public void testGetColorForCodeWrong() {
        System.out.println("getColorForCode");
        int code = -1;
        JavaApplication1 instance = new JavaApplication1();
        boolean passed =false;
        try{
            String expResult ="anything";
            String result = instance.getColorForCode(code);
            assertEquals(expResult,result);
        }catch (IllegalArgumentException ex){
            passed = true;
        }
       assertTrue(passed);
        // TODO review the generated test code and remove the default call to fail.
 
    }
}
