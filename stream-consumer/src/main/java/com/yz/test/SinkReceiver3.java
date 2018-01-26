package com.yz.test;

import com.yz.resp.UserODTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@EnableBinding(value = {Sink.class})
public class SinkReceiver3 {

    private static Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);

//
//    @StreamListener(Sink.INPUT)
//    public void receive(UserODTO user) {
//        logger.info("Received: " + user);
//    }

//    配置属性如下：
//    # consumer Group:input
//    spring.cloud.stream.bindings.input.group=Service-A
//
//    # Partition
//    spring.cloud.stream.bindings.input.destination=greetings
//    spring.cloud.stream.bindings.input.consumer.partitioned=true
//    spring.cloud.stream.instanceCount=2
//    spring.cloud.stream.instanceIndex=0

}
