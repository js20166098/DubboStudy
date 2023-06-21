package com.dujie.util;

/**
 * @Description: tradeId 工具类
 * @Author: 渡劫 dujie
 * @Date: 2023/6/21 09:23
 */
public class TraceIdUtils {

    private static final ThreadLocal<String> traceIdCache
            = new ThreadLocal<String>();

    public static String getTraceId() {
        return traceIdCache.get();
    }

    public static void setTraceId(String traceId) {
        traceIdCache.set(traceId);
    }

    public static void clear() {
        traceIdCache.remove();
    }

}