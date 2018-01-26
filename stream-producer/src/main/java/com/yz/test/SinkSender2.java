package com.yz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

//@EnableBinding(value = {SinkOutput.class})
public class SinkSender2 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducterApplication.class);

//    @Bean
//    @InboundChannelAdapter(value = Sink.INPUT, poller = @Poller(fixedDelay = "2000"))
//    public MessageSource<String> timerMessageSource() {
//        return () -> new GenericMessage<>("{\"name\":\"qiyazhong\", \"age\":18}");
//    }
}




