package com.company;

/**
 * Library that is being used by the application.
 * 
 * @author aguther
 *
 */
public class Library {

    /**
     * This method returns true.
     *
     * @return True if valid
     */
    public boolean functionZero() {
        return true;
    }

    /**
     * This method determines a result for one parameter.
     *
     * @param first Parameter of the first argument
     * @return True if valid
     */
    public boolean functionOne(String first) {
        if ("One".equals(first)) {
            return true;
        }

        return false;
    }

    /**
     * This method determines a result for two parameters.
     *
     * @param first  Parameter of the first argument
     * @param second Parameter of the second argument
     * @return True if valid
     */
    public boolean functionTwo(String first, String second) {
        if ("Second".equals(second)) {
            return functionOne(first);
        }

        return false;
    }
}
