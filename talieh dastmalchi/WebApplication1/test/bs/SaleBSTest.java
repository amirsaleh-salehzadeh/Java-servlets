/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bs;

import common.CategoryENT;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Talieh
 */
public class SaleBSTest {

    public SaleBSTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getCategory method, of class SaleBS.
     */
    @Test
    public void getCategory() {
        System.out.println("getCategory");
        int categoryid = 0;
        SaleBS instance = new SaleBS();
        CategoryENT expResult = null;
        CategoryENT result = instance.getCategory(categoryid);
                
                if(result!=null){
                    System.out.println(result.getCategoryid());
                    System.out.println(result.getName());
                }else{
            fail("The test case is a prototype.");
                }
        
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}