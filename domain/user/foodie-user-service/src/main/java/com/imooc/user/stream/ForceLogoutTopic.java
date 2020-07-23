package com.imooc.user.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by 半仙.
 */
public interface ForceLogoutTopic {

    String INPUT = "force-logout-consumer";

    String OUTPUT = "force-logout-producer";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();
}
