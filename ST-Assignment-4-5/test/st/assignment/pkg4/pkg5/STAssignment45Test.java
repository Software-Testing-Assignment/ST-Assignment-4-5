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
 * @author abdulrahman
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
         int[] kills = {16,18,20,22,10,9,11,12};
         int[] death = {3,5,8,9,2,3,10,11};
         int[] assist = {11,5,10,3,13,2,18,1};
         int[] hour = {13,15,18,20,6,2,1,5};
         int[] min = {25,10,0,0,35,58,0,0};
         int[] sec = {50,0,20,0,15,0,55,0};
         
        System.out.println("logChecker");
      
        String expResult1 = "CONGRATULATIONS! Diamond Rank ";
        String expResult2 = "Demoted ! Gold Rank.";
         
        String result1 = STAssignment45.logChecker(16, 3, 11, 13, 25, 50);
        assertEquals(expResult1, result1);
        
        for(int i=1;i<8;i++)
        {
            String result=STAssignment45.logChecker(kills[i],death[i],assist[i],hour[i],min[i],sec[i]);
             assertEquals(expResult2, result);
        }
      
     
    }

}
