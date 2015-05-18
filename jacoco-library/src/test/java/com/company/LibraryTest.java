package com.company;

import org.junit.Ignore;

import junit.framework.TestCase;

public class LibraryTest extends TestCase {

    private static final String tokenOne = "One";
    private static final String tokenSecond = "Second";
    private static final String tokenFail = "Fail";

    private Library myLibrary;

    public void setUp() throws Exception {

        // call super setup method
        super.setUp();

        // create library object
        myLibrary = new Library();
    }

    public void tearDown() throws Exception {

        // delete library object
        myLibrary = null;
    }

    public void testFunctionZero() throws Exception {

        // test functionZero function
        assertTrue(myLibrary.functionZero());
    }

    public void testFunctionOneWorking() throws Exception {

        // test functionZero function
        assertTrue(myLibrary.functionOne(tokenOne));

    }

//    public void testFunctionOneNotWorking() throws Exception {
//
//        // test functionZero function
//        assertFalse(myLibrary.functionOne(tokenFail));
//
//    }

    public void testFunctionTwoWorking() throws Exception {

        // test functionZero function
        assertTrue(myLibrary.functionTwo(tokenOne, tokenSecond));

    }

//    public void testFunctionTwoNotWorking() throws Exception {
//
//        // test functionZero function
//        assertFalse(myLibrary.functionTwo(tokenFail, tokenFail));
//
//    }
}