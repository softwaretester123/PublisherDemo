package com.example.publisherdemo.gateway;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name="myPubSubGateway", defaultRequestChannel = "outboundMsgChanel")
public interface OutboundChanel {
    void sendMsgToPubSub(String msg);
}
