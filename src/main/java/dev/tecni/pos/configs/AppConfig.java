package dev.tecni.pos.configs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Configurations for App Properties file
 * Read and Write properties for TD POS
 * @author TecniDEV
 */
public class AppConfig {

    private static final Properties PROPERTIES = new Properties();
    
    public static String fileName = "app.properties";

    static
    {
        try (InputStream inputFile = new FileInputStream(fileName)) {
            PROPERTIES.load(inputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void set(String key, String value)
    {
        PROPERTIES.setProperty(key, value);
        try (OutputStream outputFile = new FileOutputStream(fileName)) {
            PROPERTIES.store(outputFile, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key)
    {
        return PROPERTIES.getProperty(key);
    }

    public static String get(String key, String defaultValue)
    {
        return PROPERTIES.getProperty(key, defaultValue);
    }
}
