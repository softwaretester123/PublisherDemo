package com.example.publisherdemo.gateway;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "outboundMsgChanel")
public interface OutboundChanel {
    void sendMsgToPubSub(String msg);
}
