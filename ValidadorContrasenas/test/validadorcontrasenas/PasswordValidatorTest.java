/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validadorcontrasenas;

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
public class PasswordValidatorTest {
    
    PasswordValidator pv;
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pv = new PasswordValidator();
    }
    
    
    @After
    public void tearDown() {
    }

    /**
     * Test of longitudMinima method, of class PasswordValidator.
     */
    @Test
    public void testLongitudMinima() {
        System.out.println("longitudMinima");
        String password = "califragilistico";
        boolean expResult = true;
        boolean result = pv.longitudMinima(password);
        assertEquals(expResult, result);
    }

    /**
     * Test of mayusculas method, of class PasswordValidator.
     */
    @Test
    public void testMayusculas() {
        System.out.println("mayusculas");
        String password = "aBracadabRa123@";
        boolean expResult = true;
        boolean result = pv.mayusculas(password);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of minusculas method, of class PasswordValidator.
     */
    @Test
    public void testMinusculas() {
        System.out.println("minusculas");
        String password = "aBracadabRa123@";
        boolean expResult = true;
        boolean result = pv.minusculas(password);
        assertEquals(expResult, result);
    }
    
    
    
    /**
     * Test of caracteresEspeciales method, of class PasswordValidator.
     */
    @Test
    public void testCaracteresEspeciales() {
        System.out.println("caracteresEspeciales");
        String password = "gragea@";
        boolean expResult = true;
        boolean result = pv.caracteresEspeciales(password);
        assertEquals(expResult, result);
    }
    
}
