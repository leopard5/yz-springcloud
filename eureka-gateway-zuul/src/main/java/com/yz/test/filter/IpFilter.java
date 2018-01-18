package com.yz.test.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;
import org.bouncycastle.asn1.ocsp.ResponseData;

public class IpFilter extends ZuulFilter {
//    @Autowired
//    private BasicConf basicConf;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        Object success = ctx.get("isSuccess");
        return success == null ? true : Boolean.parseBoolean(success.toString());
    }

    @Override
    public Object run() {
//        RequestContext ctx = RequestContext.getCurrentContext();
//        String ip = IpUtils.getIpAddr(ctx.getRequest());

//        if (StringUtils.isNotBlank(ip) && basicConf != null && basicConf.getIpStr().contains(ip)) {
//            ctx.set("isSuccess", false);
//            ctx.setSendZuulResponse(false);
//            ResponseData data = ResponseData.fail("非法请求", ResponseCode.NO_AUTH_CODE.getCode());
//            ctx.setResponseBody(JsonUtils.toJson(data));
//            ctx.getResponse().setContentType("application/json; charset=utf-8");
//            return null;
//        }
        return null;
    }
}
