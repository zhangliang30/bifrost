package com.zl.bifrost.utils;

import java.util.Random;

/**
 * password ustils
 *
 * @author zhangliang30
 */
public class PasswordUtil {
    private static final int DEFAULT_PASSWORD_LENGTH = 16;
    private static final String PASSWORD_CHAIN = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";

    public static String password(int length) {
        String passwordString = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int a = random.nextInt(PASSWORD_CHAIN.length());
            passwordString = passwordString + PASSWORD_CHAIN.substring(a, a+1);
        }
        return passwordString;
    }

    public static String password() {
        return password(DEFAULT_PASSWORD_LENGTH);
    }
}
