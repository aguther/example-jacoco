package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * This is the UnitTest class for the Main class.
 */
public class MainTest extends TestCase {

    /**
     * This tests the private constructor.
     */
    @Test
    public void testMainConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        // get constructor information by reflection
        Constructor<Main> c = Main.class.getDeclaredConstructor();

        // enable access to private constructor
        c.setAccessible(true);

        // create object of type Main
        Main main = c.newInstance();
    }

    /**
     * This tests the main method.
     *
     * @throws Exception
     */
    @Test
    public void testMain() throws Exception {
        //com.company.Main.main(new String[]{});
        com.company.Main.main(new String[]{"One"});
        com.company.Main.main(new String[]{"One", "Two"});
        //com.company.Main.main(new String[]{"One", "Two", "Three"});
    }
}