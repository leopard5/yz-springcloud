package com.yz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.sleuth.Span;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {
    private final Logger logger = LoggerFactory.getLogger(getClass());

//	@Bean
//	public AlwaysSampler defaultSampler() {
//		return new AlwaysSampler();
//	}

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping(value = "/trace-2", method = RequestMethod.GET)
    public String trace(HttpServletRequest request) {
        logger.info("===<call trace-2, TraceId={}, SpanId={}, ParentId={}>===",
                request.getHeader(Span.TRACE_ID_NAME),
                request.getHeader(Span.SPAN_ID_NAME),
                request.getHeader(Span.PARENT_ID_NAME)
                );
        return restTemplate().getForEntity("http://sleuth-trace3/trace-3", String.class).getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);
    }

}
