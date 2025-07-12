package dev.tecni.pos.configs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Configurations for App Properties file
 * Read and Write properties for TD POS
 * @author TecniDEV
 */
public class AppConfig {

    private static final Logger LOGGER = Logger.getLogger(AppConfig.class.getName());
    private static final Properties PROPERTIES = new Properties();
    public static String fileName = "app.properties";

    /**
     * Static constructor
     */
    static
    {
        try (InputStream inputFile = new FileInputStream(fileName)) {
            PROPERTIES.load(inputFile);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * 
     * @param key
     * @param value
     */
    public static void set(String key, String value)
    {
        PROPERTIES.setProperty(key, value);
        try (OutputStream outputFile = new FileOutputStream(fileName)) {
            PROPERTIES.store(outputFile, null);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage());
        }
    }

    /**
     * 
     * @param key
     * @return
     */
    public static String get(String key)
    {
        return PROPERTIES.getProperty(key);
    }

    public static String get(String key, String defaultValue)
    {
        return PROPERTIES.getProperty(key, defaultValue);
    }
}
