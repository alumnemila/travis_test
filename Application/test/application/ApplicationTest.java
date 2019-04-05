/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bernat
 */
public class ApplicationTest {
    
    public ApplicationTest() {
    }

     /**
     * Test of suma method, of class Application.
     */
    @Test
    public void testSuma() {
        Application a = new Application();
        assertEquals( 3+4,  a.suma(3, 4));
    }
    
}
