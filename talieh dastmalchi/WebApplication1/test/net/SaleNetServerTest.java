/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net;

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
public class SaleNetServerTest {

    public SaleNetServerTest() {
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
     * Test of runserver method, of class SaleNetServer.
     */
    @Test
    public void runserver() {
        System.out.println("runserver");
        SaleNetServer instance = new SaleNetServer();
        instance.runserver();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}