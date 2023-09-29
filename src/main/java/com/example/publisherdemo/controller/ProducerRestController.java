package com.example.publisherdemo.controller;

import com.example.publisherdemo.gateway.OutboundChanel;
import com.example.publisherdemo.utils.PublisherUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Component
@RestController
@Slf4j
public class ProducerRestController {

    @Autowired
    OutboundChanel gateway;

    @PostMapping("/publishMessage")
    public String publishMessage(@RequestBody String request) throws IOException {
        log.info(request);
        byte[] serializeRequest = PublisherUtils.serializeRequest(request);
//        gateway.sendMsgToPubSub(new String(serializeRequest));
        return "Message sent to PubSub successfully";
    }

}