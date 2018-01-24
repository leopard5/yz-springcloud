package com.yz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.Span;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace3Application {
    private final Logger logger = LoggerFactory.getLogger(getClass());

//	@Bean
//	public AlwaysSampler defaultSampler() {
//		return new AlwaysSampler();
//	}

    @RequestMapping(value = "/trace-3", method = RequestMethod.GET)
    public String trace3(HttpServletRequest request) {
        logger.info("===<call trace-3, TraceId={}, SpanId={}, ParentId={}>===",
                request.getHeader(Span.TRACE_ID_NAME),
                request.getHeader(Span.SPAN_ID_NAME),
                request.getHeader(Span.PARENT_ID_NAME)
        );
        return "Trace3";
    }

    public static void main(String[] args) {
        SpringApplication.run(Trace3Application.class, args);
    }

}
