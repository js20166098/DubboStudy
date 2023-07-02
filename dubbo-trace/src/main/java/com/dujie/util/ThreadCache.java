package com.dujie.util;

public class ThreadCache {

    private static final ThreadLocal<String> TRACE_ID_CACHE
            = new ThreadLocal<>();

    public static String getTraceId() {
        return TRACE_ID_CACHE.get();
    }

    public static void setTraceId(String traceId) {
        TRACE_ID_CACHE.set(traceId);
    }

    public static void clear() {
        TRACE_ID_CACHE.remove();
    }
}