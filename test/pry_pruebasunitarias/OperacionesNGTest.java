/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_pruebasunitarias;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Erik Vega
 */
public class OperacionesNGTest {
    
    public OperacionesNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of Suma method, of class Operaciones.
     */
    @Test
    public void testSuma() {
        System.out.println("Suma");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Suma(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Res method, of class Operaciones.
     */
    @Test
    public void testRes() {
        System.out.println("Res");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Res(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Multi method, of class Operaciones.
     */
    @Test
    public void testMulti() {
        System.out.println("Multi");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Multi(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Div method, of class Operaciones.
     */
    @Test
    public void testDiv() {
        System.out.println("Div");
        float num1 = 0.0F;
        float num2 = 0.0F;
        Operaciones instance = new Operaciones();
        float expResult = 0.0F;
        float result = instance.Div(num1, num2);
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
