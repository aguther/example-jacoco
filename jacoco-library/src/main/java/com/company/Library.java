
package com.company;

import java.util.logging.Logger;

/**
 * Library that is being used by the application.
 * @author aguther
 */
public class Library {

  /** Logger for the application. */
  private static final Logger LOG = Logger.getLogger(Library.class.getName());

  /**
   * This method returns true.
   * @return True if valid
   */
  public boolean functionZero() {
    LOG.fine("functionZero() called");

    return true;
  }

  /**
   * This method determines a result for one parameter.
   * @param first
   *          Parameter of the first argument
   * @return True if valid
   */
  public boolean functionOne(String first) {
    LOG.fine(String.format("functionOne(first='%s') called", first));

    if("One".equals(first)) {
      return true;
    }

    return false;
  }

  /**
   * This method determines a result for two parameters.
   * @param first
   *          Parameter of the first argument
   * @param second
   *          Parameter of the second argument
   * @return True if valid
   */
  public boolean functionTwo(String first, String second) {
    LOG.fine(String.format("functionTwo(first='%s', second='%s') called", first, second));

    if("Second".equals(second)) {
      return functionOne(first);
    }

    return false;
  }
}
