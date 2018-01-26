package com.yz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

//@EnableBinding(value = {Source.class})
public class SinkSender3 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducterApplication.class);

//    @Bean
//    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "2000"))
//    public MessageSource<String> timerMessageSource() {
//        return () -> new GenericMessage<>("{\"name\":\"qiyazhong\", \"age\":30}");
//    }

//    配置属性
//    # Partition
//    spring.cloud.stream.bindings.output.destination=greetings
//    spring.cloud.stream.bindings.output.producer.partitionKeyExpression=payload
//    spring.cloud.stream.bindings.output.producer.partitionCount=2
}




