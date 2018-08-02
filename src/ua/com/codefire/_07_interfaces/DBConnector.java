package ua.com.codefire._07_interfaces;

/**
 * API <- Application Programming Interface
 */
public interface DBConnector {

    /**
     * Initializer for storage driver
     */
    default void init() {
        System.out.println("Init connector object...");
    }

    /**
     * Connect with data-storage
     * @return true if connected, false if not connected
     */
    boolean connect();

    /**
     * Disconnect from data-storage
     */
    void disconnect();
}
