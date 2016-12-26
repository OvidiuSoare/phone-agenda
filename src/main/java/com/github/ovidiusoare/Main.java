/**
 * Created by Ovi on 12/26/2016.
 */
package com.github.ovidiusoare;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String [] args) {
        logger.error("Hello world");
        logger.error("Test2");
    }
}