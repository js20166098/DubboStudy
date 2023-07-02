package com.dujie.util;

import java.util.UUID;

/**
 * @author dujie
 */
public class TradeIdUtil {
    public static String generateWithoutSeparator() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        char[] array = new char[32];
        int idx = 0;
        for (char c : uuid.toCharArray()) {
            if (c != 45) {
                array[idx++] = c;
            }
        }
        return new String(array);
    }

}
