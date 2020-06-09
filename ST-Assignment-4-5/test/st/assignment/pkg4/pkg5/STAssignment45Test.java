/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.assignment.pkg4.pkg5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abdul
 */
public class STAssignment45Test {
    
    public STAssignment45Test() {
    }
    
  
    
    @Before
    public void  beforeDisplay(){
         System.out.println("Function are being tested.");
    }
    
    @After
    public void afterDisplay(){
        System.out.println("Function are successfully tested.");
    }

    /**
     * Test of logChecker method, of class STAssignment45.
     */
    @Test
    public void testLogChecker() {
        System.out.println("logChecker");
      
        String expResult1 = "CONGRATULATIONS! Diamond Rank ";
        String expResult2 = "Demoted ! Gold Rank.";
         
        String result1 = STAssignment45.logChecker(16, 3, 11, 13, 25, 50);
        assertEquals(expResult1, result1);
        
        String result2 = STAssignment45.logChecker(18,5,5,15,10,0);
        assertEquals(expResult2, result2);
        
        String result3 = STAssignment45.logChecker(20,8,10,18,0,20);
        assertEquals(expResult2, result3);
        
        String result4 = STAssignment45.logChecker(22,9,3,20,0,0);
        assertEquals(expResult2, result4);
        
        String result5 = STAssignment45.logChecker(10,2,13,6,35,15);
        assertEquals(expResult2, result5);
        
        String result6 = STAssignment45.logChecker(9,3,2,2,58,0);
        assertEquals(expResult2, result6);
        
        String result7 = STAssignment45.logChecker(11,10,18,1,0,55);
        assertEquals(expResult2, result7);
        
        String result8 = STAssignment45.logChecker(12,11,1,5,0,0);
        assertEquals(expResult2, result8);
        
     
    }

}
