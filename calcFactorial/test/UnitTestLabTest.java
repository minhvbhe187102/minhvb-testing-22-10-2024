/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.math.BigInteger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeus
 */
public class UnitTestLabTest {
    
    public UnitTestLabTest() {
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
     * Test of logMsg method, of class UnitTestLab.
     */
    @Test
    public void testLogMsg() {
        System.out.println("logMsg");
        String msg = "";
        UnitTestLab instance = new UnitTestLab();
        instance.logMsg(msg);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of calcFactorial method, of class UnitTestLab.
     */
    @Test
    public void testCalcFactorial() {
        System.out.println("calcFactorial");
        int aNum = 4;
        UnitTestLab instance = new UnitTestLab();
        BigInteger expResult = BigInteger.valueOf(24);
        BigInteger result = instance.calcFactorial(aNum);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Test(expected = IllegalArgumentException.class)
    public void testCalcFactorial_InvalidInput() {
        System.out.println("calcFactorial invalid input");
        int aNum = 0;
        UnitTestLab instance = new UnitTestLab();
        BigInteger result = instance.calcFactorial(aNum); // This should throw an IllegalArgumentException
    }

    /**
     * Test of printFactorial method, of class UnitTestLab.
     */
    
    
    @Test
    public void testPrintFactorial() {
        System.out.println("printFactorial");
        int aNum = 3;
        UnitTestLab instance = new UnitTestLab();
        instance.printFactorial(aNum);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPrintFactorial_InvalidInput() {
        System.out.println("printFactorial invalid input");
        int aNum = 0;
        UnitTestLab instance = new UnitTestLab();
        instance.printFactorial(aNum); // This should throw an IllegalArgumentException
    }
    
    /**
     * Test of calcExtraFactorial method, of class UnitTestLab.
     */
    @Test
    public void testCalcExtraFactorial() {
        System.out.println("calcExtraFactorial");
        int a = 1;
        int b = 1;
        UnitTestLab instance = new UnitTestLab();
        long expResult = 1L;
        long result = instance.calcExtraFactorial(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
