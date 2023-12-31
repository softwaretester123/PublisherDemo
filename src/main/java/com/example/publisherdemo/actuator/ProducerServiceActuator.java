package com.example.publisherdemo.actuator;

import com.google.cloud.spring.pubsub.core.PubSubTemplate;
import com.google.cloud.spring.pubsub.integration.outbound.PubSubMessageHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
@EnableIntegration
public class ProducerServiceActuator {

    @Value("${spring.cloud.gcp.topic.id}")
    String topicId;

    @Bean
    @ServiceActivator(inputChannel = "outboundMsgChanel")
    public PubSubMessageHandler messageSender(PubSubTemplate pubsubTemplate) {
        return new PubSubMessageHandler(pubsubTemplate, topicId);
    }
}
