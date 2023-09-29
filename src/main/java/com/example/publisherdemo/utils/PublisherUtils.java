package com.example.publisherdemo.utils;

import com.example.publisherdemo.voipworkorder.dto.avro.req.VoIPWorkOrder;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.io.*;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;

@Slf4j
public class PublisherUtils {
    public static byte[] serializeRequest(String request) {
        DatumReader<VoIPWorkOrder> reader = new SpecificDatumReader<>(VoIPWorkOrder.class);
        DatumWriter<VoIPWorkOrder> writer = new SpecificDatumWriter<>(VoIPWorkOrder.class);
        byte[] data = new byte[0];
        try (ByteArrayOutputStream stream = new ByteArrayOutputStream()) {
            Decoder decoder = DecoderFactory.get().jsonDecoder(VoIPWorkOrder.getClassSchema(), request);
            Encoder jsonEncoder = EncoderFactory.get().jsonEncoder(VoIPWorkOrder.getClassSchema(), stream);
            VoIPWorkOrder voIPWorkOrder = reader.read(null, decoder);
            writer.write(voIPWorkOrder, jsonEncoder);
            jsonEncoder.flush();
            data = stream.toByteArray();
        } catch (Exception e) {
            log.error("Exception occur in serializeLogMessage : ", e);
        }
        log.info("serializeLogMessage() End");
        return data;
    }
}
