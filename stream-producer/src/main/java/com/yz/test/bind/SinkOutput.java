package com.yz.test.bind;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkOutput {
    String OUTPUT = "input";

    @Output(SinkOutput.OUTPUT)
    MessageChannel output();
}
