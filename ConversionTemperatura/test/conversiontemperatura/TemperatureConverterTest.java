/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperatura;

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
public class TemperatureConverterTest {
    
    TemperatureConverter tc;
    
    public TemperatureConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tc = new TemperatureConverter();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of celsiusaFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testCelsiusaFahrenheit() {
        System.out.println("celsiusaFahrenheit");
        double gradosC = 80;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 176;
        double result = instance.celsiusaFahrenheit(gradosC);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fahrenheitaCelsius method, of class TemperatureConverter.
     */
    @Test
    public void testFahrenheitaCelsius() {
        System.out.println("fahrenheitaCelsius");
        double gradosF = 68;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 20;
        double result = instance.fahrenheitaCelsius(gradosF);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of celsiusaKelvin method, of class TemperatureConverter.
     */
    @Test
    public void testCelsiusaKelvin() {
        System.out.println("celsiusaKelvin");
        double gradosC = 25.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 298;
        double result = instance.celsiusaKelvin(gradosC);
        assertEquals(expResult, result, 0.05);
    }

    /**
     * Test of kelvinaCelsius method, of class TemperatureConverter.
     */
    @Test
    public void testKelvinaCelsius() {
        System.out.println("kelvinaCelsius");
        double gradosK = 125.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = -148.0;
        double result = instance.kelvinaCelsius(gradosK);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of fahrenheitaKelvin method, of class TemperatureConverter.
     */
    @Test
    public void testFahrenheitaKelvin() {
        System.out.println("fahrenheitaKelvin");
        double gradosF = 41.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 278.0;
        double result = instance.fahrenheitaKelvin(gradosF);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of kelvinaFahrenheit method, of class TemperatureConverter.
     */
    @Test
    public void testKelvinaFahrenheit() {
        System.out.println("kelvinaFahrenheit");
        double gradosK = 273.0;
        TemperatureConverter instance = new TemperatureConverter();
        double expResult = 32;
        double result = instance.kelvinaFahrenheit(gradosK);
        assertEquals(expResult, result, 0.0);
    }
    
}
