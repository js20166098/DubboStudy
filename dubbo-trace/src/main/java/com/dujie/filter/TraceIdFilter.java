package com.dujie.filter;

import com.dujie.constant.Constants;
import com.dujie.util.ThreadCache;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.rpc.*;

/**
 * @author dujie
 */
public class TraceIdFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = RpcContext.getContext().getAttachment(Constants.TRACE_ID);
        if (!StringUtils.isEmpty(traceId)) {
            // *) 从RpcContext里获取traceId并保存
            ThreadCache.setTraceId(traceId);
        } else {
            // *) 交互前重新设置traceId, 避免信息丢失
            RpcContext.getContext().setAttachment(Constants.TRACE_ID, ThreadCache.getTraceId());
        }
        // *) 实际的rpc调用
        return invoker.invoke(invocation);
    }
}