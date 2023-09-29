/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.publisherdemo.voipworkorder.dto.avro.res;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderInformation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5730511433952470399L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderInformation\",\"namespace\":\"com.example.publisherdemo.voipworkorder.dto.avro.res\",\"fields\":[{\"name\":\"SAN\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderInformation> ENCODER =
      new BinaryMessageEncoder<OrderInformation>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderInformation> DECODER =
      new BinaryMessageDecoder<OrderInformation>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderInformation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderInformation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderInformation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderInformation>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderInformation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderInformation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderInformation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderInformation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence SAN;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderInformation() {}

  /**
   * All-args constructor.
   * @param SAN The new value for SAN
   */
  public OrderInformation(java.lang.CharSequence SAN) {
    this.SAN = SAN;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return SAN;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: SAN = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'SAN' field.
   * @return The value of the 'SAN' field.
   */
  public java.lang.CharSequence getSAN() {
    return SAN;
  }


  /**
   * Sets the value of the 'SAN' field.
   * @param value the value to set.
   */
  public void setSAN(java.lang.CharSequence value) {
    this.SAN = value;
  }

  /**
   * Creates a new OrderInformation RecordBuilder.
   * @return A new OrderInformation RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder newBuilder() {
    return new com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder();
  }

  /**
   * Creates a new OrderInformation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderInformation RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder(other);
    }
  }

  /**
   * Creates a new OrderInformation RecordBuilder by copying an existing OrderInformation instance.
   * @param other The existing instance to copy.
   * @return A new OrderInformation RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderInformation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderInformation>
    implements org.apache.avro.data.RecordBuilder<OrderInformation> {

    private java.lang.CharSequence SAN;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.SAN)) {
        this.SAN = data().deepCopy(fields()[0].schema(), other.SAN);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderInformation instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.SAN)) {
        this.SAN = data().deepCopy(fields()[0].schema(), other.SAN);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'SAN' field.
      * @return The value.
      */
    public java.lang.CharSequence getSAN() {
      return SAN;
    }


    /**
      * Sets the value of the 'SAN' field.
      * @param value The value of 'SAN'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder setSAN(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.SAN = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'SAN' field has been set.
      * @return True if the 'SAN' field has been set, false otherwise.
      */
    public boolean hasSAN() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'SAN' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.res.OrderInformation.Builder clearSAN() {
      SAN = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderInformation build() {
      try {
        OrderInformation record = new OrderInformation();
        record.SAN = fieldSetFlags()[0] ? this.SAN : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderInformation>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderInformation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderInformation>
    READER$ = (org.apache.avro.io.DatumReader<OrderInformation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.SAN == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.SAN);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.SAN = null;
      } else {
        this.SAN = in.readString(this.SAN instanceof Utf8 ? (Utf8)this.SAN : null);
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.SAN = null;
          } else {
            this.SAN = in.readString(this.SAN instanceof Utf8 ? (Utf8)this.SAN : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









