package com.example.publisherdemo.controller;

import com.example.publisherdemo.gateway.OutboundChanel;
import com.hughes.billing.voipworkorder.dto.avro.req.VoIPWorkOrder;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;

@Component
@RestController
@Slf4j
public class ProducerRestController {

    @Autowired
    OutboundChanel gateway;

    @PostMapping("/publishMessage")
    public String publishMessage(@RequestBody VoIPWorkOrder request) {
        log.info("Request received:" + request);
        DatumReader<VoIPWorkOrder> reader = new SpecificDatumReader<>(VoIPWorkOrder.class);
        DatumWriter<VoIPWorkOrder> writer = new SpecificDatumWriter<>(VoIPWorkOrder.class);
        byte[] data;
        try(ByteArrayOutputStream stream = new ByteArrayOutputStream()) {
            Decoder decoder = DecoderFactory.get().jsonDecoder(VoIPWorkOrder.getClassSchema(), request.toString());
            Encoder jsonEncoder = EncoderFactory.get().jsonEncoder(VoIPWorkOrder.getClassSchema(), stream);
            VoIPWorkOrder voIPWorkOrder = reader.read(null, decoder);
            log.info("Verified voIPWorkOrder:" + voIPWorkOrder);
            writer.write(voIPWorkOrder, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
            gateway.sendMsgToPubSub(new String(data));
        } catch (Exception e) {
            log.error("Exception occur in serializing : ", e);
            return "Exception occur in serializing";
        }
        return "Message sent to PubSub successfully";
    }
}