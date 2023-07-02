package com.dujie.interceptor;

import com.dujie.constant.Constants;
import com.dujie.util.TradeIdUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author dujie
 */
@Slf4j
public class TraceInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        MDC.put(Constants.TRACE_URI, StringUtils.defaultIfBlank(request.getRequestURI(), Constants.UNKNOWN));
        MDC.put(Constants.MDC_UUID, StringUtils.defaultIfBlank(request.getHeader(Constants.TRACE_ID), TradeIdUtil.generateWithoutSeparator()));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        MDC.clear();
    }
}