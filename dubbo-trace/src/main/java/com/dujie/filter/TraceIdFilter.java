package com.dujie.filter;

import com.dujie.util.TraceIdUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.rpc.*;

public class TraceIdFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = RpcContext.getContext().getAttachment("traceId");
        if (!StringUtils.isEmpty(traceId)) {
            // *) 从RpcContext里获取traceId并保存
            TraceIdUtils.setTraceId(traceId);
        } else {
            // *) 交互前重新设置traceId, 避免信息丢失
            RpcContext.getContext().setAttachment("traceId", TraceIdUtils.getTraceId());
        }
        // *) 实际的rpc调用
        return invoker.invoke(invocation);
    }
}