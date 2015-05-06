package com.company;

import java.util.logging.Logger;

/**
 * Class holding the main function of the application.
 */
public class Main {

    // Logger for the application
    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    /**
     * Private constructor.
     */
    private Main() {
    }

    /**
     * Main function of the application.
     *
     * @param args Arguments for the application
     */
    public static void main(String[] args) {

        // create library
        Library library = new Library();

        // string builder for result
        StringBuilder resultInfo = new StringBuilder();

        // decide on number of arguments
        if (args.length == 0) {

            // execute library function
            library.functionZero();

            // create result information
            resultInfo.append("Zero parameters provided ");

        } else if (args.length == 1) {

            // get result from library for one parameter
            boolean result = library.functionOne(args[0]);

            // create result information
            resultInfo.append("One parameter provided: ");
            resultInfo.append(String.format("%s|%s", args[0], result));

        } else if (args.length == 2) {

            // get result from library for one parameter
            boolean result = library.functionTwo(args[0], args[1]);

            // create result information
            resultInfo.append("Two parameters provided: ");
            resultInfo.append(String.format("%s,%s|%s", args[0], args[1], result));

        } else {

            // create result information
            resultInfo.append("More than two parameters provided: ");

            // iterate over all arguments
            for (int i = 0; i < args.length; ++i) {

                // get result for current argument
                boolean result = library.functionOne(args[i]);

                // append result
                resultInfo.append(String.format("%s|%s", args[i], result));

                // if not last argument, add comma
                if (i < (args.length - 1)) {
                    resultInfo.append(",");
                }
            }
        }

        // close the result string
        resultInfo.append(";");

        // LOG the result
        LOG.info(resultInfo.toString());
    }
}
