package dev.tecni.pos.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class AppUtil {

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String encryptPassword(String password) {
        return BCrypt.withDefaults().hashToString(11, password.toCharArray());
    }
    
    public static Boolean verifyPassword(String password, String hash) {
        BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hash);
        return result.verified;
    }
}
