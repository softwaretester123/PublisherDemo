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
public class InstallPhone extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8832788485378766644L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InstallPhone\",\"namespace\":\"com.example.publisherdemo.voipworkorder.dto.avro.req\",\"fields\":[{\"name\":\"Number\",\"type\":[\"null\",\"string\"]},{\"name\":\"Type\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InstallPhone> ENCODER =
      new BinaryMessageEncoder<InstallPhone>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InstallPhone> DECODER =
      new BinaryMessageDecoder<InstallPhone>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<InstallPhone> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<InstallPhone> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<InstallPhone> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InstallPhone>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this InstallPhone to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a InstallPhone from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a InstallPhone instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static InstallPhone fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence Number;
  @Deprecated public java.lang.CharSequence Type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InstallPhone() {}

  /**
   * All-args constructor.
   * @param Number The new value for Number
   * @param Type The new value for Type
   */
  public InstallPhone(java.lang.CharSequence Number, java.lang.CharSequence Type) {
    this.Number = Number;
    this.Type = Type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Number;
    case 1: return Type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Number = (java.lang.CharSequence)value$; break;
    case 1: Type = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Number' field.
   * @return The value of the 'Number' field.
   */
  public java.lang.CharSequence getNumber() {
    return Number;
  }


  /**
   * Sets the value of the 'Number' field.
   * @param value the value to set.
   */
  public void setNumber(java.lang.CharSequence value) {
    this.Number = value;
  }

  /**
   * Gets the value of the 'Type' field.
   * @return The value of the 'Type' field.
   */
  public java.lang.CharSequence getType() {
    return Type;
  }


  /**
   * Sets the value of the 'Type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.Type = value;
  }

  /**
   * Creates a new InstallPhone RecordBuilder.
   * @return A new InstallPhone RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder newBuilder() {
    return new com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder();
  }

  /**
   * Creates a new InstallPhone RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InstallPhone RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder(other);
    }
  }

  /**
   * Creates a new InstallPhone RecordBuilder by copying an existing InstallPhone instance.
   * @param other The existing instance to copy.
   * @return A new InstallPhone RecordBuilder
   */
  public static com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder newBuilder(com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone other) {
    if (other == null) {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder();
    } else {
      return new com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder(other);
    }
  }

  /**
   * RecordBuilder for InstallPhone instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InstallPhone>
    implements org.apache.avro.data.RecordBuilder<InstallPhone> {

    private java.lang.CharSequence Number;
    private java.lang.CharSequence Type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Number)) {
        this.Number = data().deepCopy(fields()[0].schema(), other.Number);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.Type)) {
        this.Type = data().deepCopy(fields()[1].schema(), other.Type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing InstallPhone instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.Number)) {
        this.Number = data().deepCopy(fields()[0].schema(), other.Number);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.Type)) {
        this.Type = data().deepCopy(fields()[1].schema(), other.Type);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'Number' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumber() {
      return Number;
    }


    /**
      * Sets the value of the 'Number' field.
      * @param value The value of 'Number'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder setNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Number = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Number' field has been set.
      * @return True if the 'Number' field has been set, false otherwise.
      */
    public boolean hasNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Number' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder clearNumber() {
      Number = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'Type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return Type;
    }


    /**
      * Sets the value of the 'Type' field.
      * @param value The value of 'Type'.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder setType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.Type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'Type' field has been set.
      * @return True if the 'Type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'Type' field.
      * @return This builder.
      */
    public com.example.publisherdemo.voipworkorder.dto.avro.req.InstallPhone.Builder clearType() {
      Type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InstallPhone build() {
      try {
        InstallPhone record = new InstallPhone();
        record.Number = fieldSetFlags()[0] ? this.Number : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.Type = fieldSetFlags()[1] ? this.Type : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InstallPhone>
    WRITER$ = (org.apache.avro.io.DatumWriter<InstallPhone>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InstallPhone>
    READER$ = (org.apache.avro.io.DatumReader<InstallPhone>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.Number == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.Number);
    }

    if (this.Type == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.Type);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.Number = null;
      } else {
        this.Number = in.readString(this.Number instanceof Utf8 ? (Utf8)this.Number : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.Type = null;
      } else {
        this.Type = in.readString(this.Type instanceof Utf8 ? (Utf8)this.Type : null);
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.Number = null;
          } else {
            this.Number = in.readString(this.Number instanceof Utf8 ? (Utf8)this.Number : null);
          }
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.Type = null;
          } else {
            this.Type = in.readString(this.Type instanceof Utf8 ? (Utf8)this.Type : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










