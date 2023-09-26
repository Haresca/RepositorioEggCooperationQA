/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;
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
public class RectanguloPOOTest {
    
    public RectanguloPOOTest() {
    }
    
    RectanguloServicio rs;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before        //Antes de ejecutarse cada test, se inicializa esto
    public void setUp() {
        rs = new RectanguloServicio();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void deberiainicializarbase() {
        assertNotNull(new Rectangulo().getBase());
    }
    
    @Test
    public void deberianoinicializaraltura() {
        assertNull(new Rectangulo().getAltura());
    }
    
    @Test
    public void deberiacalcularperimetro() {
        assertEquals(34, rs.calcularPerimetro(new Rectangulo(12, 5)), 0);
        assertEquals(54, rs.calcularPerimetro(new Rectangulo(17, 10)), 0);
        assertEquals(66, rs.calcularPerimetro(new Rectangulo(21, 12)), 0);
    }
    
    @Test
    public void deberiacalcularsuperficie() {
    assertEquals(36, rs.calcularSuperficie(new Rectangulo(9,4)), 0);
    assertEquals(45, rs.calcularSuperficie(new Rectangulo(11,4)), 1);
    assertEquals(30, rs.calcularSuperficie(new Rectangulo(6,5)), 0);
    }
}
