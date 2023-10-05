package com.example.publisherdemo.actuator;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.gax.rpc.ApiException;
import com.google.cloud.pubsub.v1.Publisher;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import com.google.pubsub.v1.TopicName;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class PublishWithOrderingKey {

    public static void publishWithOrderingKeysExample(String message) throws IOException, InterruptedException {

        TopicName topicName = TopicName.of("playground-s-11-e95e3395", "nad.sit.ord.voip.workorder");
        Publisher publisher = Publisher.newBuilder(topicName)
                .setEndpoint("us-east4-pubsub.googleapis.com:443")
                .setEnableMessageOrdering(true)
                .build();

        try {
            ByteString data = ByteString.copyFromUtf8(message);
            PubsubMessage pubsubMessage = PubsubMessage.newBuilder()
                    .setData(data).setOrderingKey("A").build();
            ApiFuture<String> future = publisher.publish(pubsubMessage);

            ApiFutures.addCallback(future,
                    new ApiFutureCallback<String>() {
                        @Override
                        public void onFailure(Throwable throwable) {
                            if (throwable instanceof ApiException) {
                                ApiException apiException = ((ApiException) throwable);
                                // Details on the API exception.
                                log.info("Code : " + apiException.getStatusCode().getCode());
                                log.info("Message : " + apiException.getMessage());
                                log.info("Retryable : " + apiException.isRetryable());
                            }
                           log.info("Error publishing message : " + pubsubMessage.getData());
                        }

                        @Override
                        public void onSuccess(String messageId) {
                            log.info(pubsubMessage.getData() + " : " + messageId);
                        }
                    }, MoreExecutors.directExecutor());
        } catch (Exception e) {
            log.error("Exception occur in publishing : ", e);
        } finally {
            // When finished with the publisher, shutdown to free up resources.
            publisher.shutdown();
            publisher.awaitTermination(1, TimeUnit.MINUTES);
        }
    }
}
