package dev.tecni.pos.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 * Utility for Application
 * Static utility functions for application management
 * @author TecniDEV
 */
public class AppUtil {

    /**
     *  
     * @param String 
     * @return 
     */
    protected static String capitalize(String str) 
    {
        if (str == null || str.isEmpty()) 
            return str;
        
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * 
     * @param password
     * @return
     */
    protected static String encryptPassword(String password) 
    {
        if (password == null || password.isEmpty()) 
            return password;
        
        return BCrypt.withDefaults().hashToString(11, password.toCharArray());
    }
    
    /**
     * 
     * @param password
     * @param hash
     * @return
     */
    protected static Boolean verifyPassword(String password, String hash) 
    {
        if (password == null || hash == null || password.isEmpty() || hash.isEmpty()) 
            return false;
        
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hash);
        return result.verified;
    }
}
