/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.publisherdemo.voipworkorder.dto.avro.req;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MessageHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6747329811190912111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"com.example.publisherdemo.voipworkorder.dto.avro.req\",\"fields\":[{\"name\":\"TransactionSequenceId\",\"type\":\"string\"},{\"name\":\"TransactionDateTime\",\"type\":\"string\"},{\"name\":\"MessageName\",\"type\":\"string\"},{\"name\":\"Origin\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageHeader> ENCODER =
      new BinaryMessageEncoder<MessageHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageHeader> DECODER =
      new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MessageHeader> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MessageHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MessageHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MessageHeader to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MessageHeader from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MessageHeader instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MessageHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence TransactionSequenceId;
  @Deprecated public java.lang.CharSequence TransactionDateTime;
  @Deprecated public java.lang.CharSequence MessageName;
  @Deprecated public java.lang.CharSequence Origin;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageHeader() {}

  /**
   * All-args constructor.
   * @param TransactionSequenceId The new value for TransactionSequenceId
   * @param TransactionDateTime The new value for TransactionDateTime
   * @param MessageName The new value for MessageName
   * @param Origin The new value for Origin
   */
  public MessageHeader(java.lang.CharSequence TransactionSequenceId, java.lang.CharSequence TransactionDateTime, java.lang.CharSequence MessageName, java.lang.CharSequence Origin) {
    this.TransactionSequenceId = TransactionSequenceId;
    this.TransactionDateTime = TransactionDateTime;
    this.MessageName = MessageName;
    this.Origin = Origin;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return TransactionSequenceId;
    case 1: return TransactionDateTime;
    case 2: return MessageName;
    case 3: return Origin;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: TransactionSequenceId = (java.lang.CharSequence)value$; break;
    case 1: TransactionDateTime = (java.lang.CharSequence)value$; break;
    case 2: MessageName = (java.lang.CharSequence)value$; break;
    case 3: Origin = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'TransactionSequenceId' field.
   * @return The value of the 'TransactionSequenceId' field.
   */
  public java.lang.CharSequence getTransactionSequenceId() {
    return TransactionSequenceId;
  }


  /**
   * Sets the value of the 'TransactionSequenceId' field.
   * @param value the value to set.
   */
  public void setTransactionSequenceId(java.lang.CharSequence value) {
    this.TransactionSequenceId = value;
  }

  /**
   * Gets the value of the 'TransactionDateTime' field.
   * @return The value of the 'TransactionDateTime' field.
   */
  public java.lang.CharSequence getTransactionDateTime() {
    return TransactionDateTime;
  }


  /**
   * Sets the value of the 'TransactionDateTime' field.
   * @param value the value to set.
   */
  public void setTransactionDateTime(java.lang.CharSequence value) {
    this.TransactionDateTime = value;
  }

  /**
   * Gets the value of the 'MessageName' field.
   * @return The value of the 'MessageName' field.
   */
  public java.lang.CharSequence getMessageName() {
    return MessageName;
  }


  /**
   * Sets the value of the 'MessageName' field.
   * @param value the value to set.
   */
  public void setMessageName(java.lang.CharSequence value) {
    this.MessageName = value;
  }

  /**
   * Gets the value of the 'Origin' field.
   * @return The value of the 'Origin' field.
   */
  public java.lang.CharSequence getOrigin() {
    return Origin;
  }


  /**
   * Sets the value of the 'Origin' field.
   * @param value the value to set.
   */
  public void setOrigin(java.lang.CharSequence value) {
    this.Origin = value;
  }

  /**
   * Creates a new MessageHeader RecordBuilder.
   * @return A new MessageHeader RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder newBuilder() {
    return new com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder();
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder(other);
    }
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing MessageHeader instance.
   * @param other The existing instance to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for MessageHeader instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageHeader>
    implements org.apache.avro.data.RecordBuilder<MessageHeader> {

    private java.lang.CharSequence TransactionSequenceId;
    private java.lang.CharSequence TransactionDateTime;
    private java.lang.CharSequence MessageName;
    private java.lang.CharSequence Origin;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.TransactionSequenceId)) {
        this.TransactionSequenceId = data().deepCopy(fields()[0].schema(), other.TransactionSequenceId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.TransactionDateTime)) {
        this.TransactionDateTime = data().deepCopy(fields()[1].schema(), other.TransactionDateTime);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.MessageName)) {
        this.MessageName = data().deepCopy(fields()[2].schema(), other.MessageName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.Origin)) {
        this.Origin = data().deepCopy(fields()[3].schema(), other.Origin);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing MessageHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.TransactionSequenceId)) {
        this.TransactionSequenceId = data().deepCopy(fields()[0].schema(), other.TransactionSequenceId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.TransactionDateTime)) {
        this.TransactionDateTime = data().deepCopy(fields()[1].schema(), other.TransactionDateTime);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.MessageName)) {
        this.MessageName = data().deepCopy(fields()[2].schema(), other.MessageName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Origin)) {
        this.Origin = data().deepCopy(fields()[3].schema(), other.Origin);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'TransactionSequenceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionSequenceId() {
      return TransactionSequenceId;
    }


    /**
      * Sets the value of the 'TransactionSequenceId' field.
      * @param value The value of 'TransactionSequenceId'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder setTransactionSequenceId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.TransactionSequenceId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionSequenceId' field has been set.
      * @return True if the 'TransactionSequenceId' field has been set, false otherwise.
      */
    public boolean hasTransactionSequenceId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'TransactionSequenceId' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder clearTransactionSequenceId() {
      TransactionSequenceId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'TransactionDateTime' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionDateTime() {
      return TransactionDateTime;
    }


    /**
      * Sets the value of the 'TransactionDateTime' field.
      * @param value The value of 'TransactionDateTime'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder setTransactionDateTime(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.TransactionDateTime = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'TransactionDateTime' field has been set.
      * @return True if the 'TransactionDateTime' field has been set, false otherwise.
      */
    public boolean hasTransactionDateTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'TransactionDateTime' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder clearTransactionDateTime() {
      TransactionDateTime = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'MessageName' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessageName() {
      return MessageName;
    }


    /**
      * Sets the value of the 'MessageName' field.
      * @param value The value of 'MessageName'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder setMessageName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.MessageName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'MessageName' field has been set.
      * @return True if the 'MessageName' field has been set, false otherwise.
      */
    public boolean hasMessageName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'MessageName' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder clearMessageName() {
      MessageName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Origin' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrigin() {
      return Origin;
    }


    /**
      * Sets the value of the 'Origin' field.
      * @param value The value of 'Origin'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder setOrigin(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Origin = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Origin' field has been set.
      * @return True if the 'Origin' field has been set, false otherwise.
      */
    public boolean hasOrigin() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Origin' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.MessageHeader.Builder clearOrigin() {
      Origin = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageHeader build() {
      try {
        MessageHeader record = new MessageHeader();
        record.TransactionSequenceId = fieldSetFlags()[0] ? this.TransactionSequenceId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.TransactionDateTime = fieldSetFlags()[1] ? this.TransactionDateTime : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.MessageName = fieldSetFlags()[2] ? this.MessageName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Origin = fieldSetFlags()[3] ? this.Origin : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageHeader>
    READER$ = (org.apache.avro.io.DatumReader<MessageHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.TransactionSequenceId);

    out.writeString(this.TransactionDateTime);

    out.writeString(this.MessageName);

    if (this.Origin == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.Origin);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.TransactionSequenceId = in.readString(this.TransactionSequenceId instanceof Utf8 ? (Utf8)this.TransactionSequenceId : null);

      this.TransactionDateTime = in.readString(this.TransactionDateTime instanceof Utf8 ? (Utf8)this.TransactionDateTime : null);

      this.MessageName = in.readString(this.MessageName instanceof Utf8 ? (Utf8)this.MessageName : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.Origin = null;
      } else {
        this.Origin = in.readString(this.Origin instanceof Utf8 ? (Utf8)this.Origin : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.TransactionSequenceId = in.readString(this.TransactionSequenceId instanceof Utf8 ? (Utf8)this.TransactionSequenceId : null);
          break;

        case 1:
          this.TransactionDateTime = in.readString(this.TransactionDateTime instanceof Utf8 ? (Utf8)this.TransactionDateTime : null);
          break;

        case 2:
          this.MessageName = in.readString(this.MessageName instanceof Utf8 ? (Utf8)this.MessageName : null);
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.Origin = null;
          } else {
            this.Origin = in.readString(this.Origin instanceof Utf8 ? (Utf8)this.Origin : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










