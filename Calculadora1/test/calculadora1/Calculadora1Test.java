/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hesca
 */
public class Calculadora1Test {
    
    public Calculadora1Test() {
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
     * Test of main method, of class Calculadora1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd() {
        System.out.println("Prueba de suma");
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 4);
        System.out.println("Result");
        assertEquals(6, result);
    }    
    
    @Test
    public void testSubstract() {
        System.out.println("Prueba de resta");
        Calculator calculator = new Calculator();
        int result = calculator.substract(2, 4);
        System.out.println("Result");
        assertEquals(-2, result);
    }    
    
    @Test
    public void testMultiply() {
        System.out.println("Prueba de multiplicación");
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 4);
        System.out.println("Result");
        assertEquals(8, result);
    }    
    
    @Test
    public void testDivide() {
        System.out.println("Prueba de división");
        Calculator calculator = new Calculator();
        int result = calculator.divide(16, 4);
        System.out.println("Result");
        assertEquals(4, result);
    }    
}
