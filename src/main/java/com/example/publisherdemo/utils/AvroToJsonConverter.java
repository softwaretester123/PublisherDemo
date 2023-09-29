package com.example.publisherdemo.utils;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroToJsonConverter {
    public static <T extends SpecificRecordBase> String convertAvroToJson(byte[] avroData, Schema schema) throws IOException {
        SpecificDatumReader<T> reader = new SpecificDatumReader<>(schema);
        Decoder decoder = DecoderFactory.get().binaryDecoder(new ByteArrayInputStream(avroData), null);
        T specificRecord = reader.read(null, decoder);

        // Convert SpecificRecord to JSON string
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Encoder jsonEncoder = EncoderFactory.get().jsonEncoder(schema, outputStream, true);
        SpecificDatumWriter<T> jsonDatumWriter = new SpecificDatumWriter<>(schema);

        jsonDatumWriter.write(specificRecord, jsonEncoder);
        jsonEncoder.flush();

        return outputStream.toString();
    }
}
