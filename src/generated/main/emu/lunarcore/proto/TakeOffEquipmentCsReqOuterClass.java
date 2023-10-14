// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class TakeOffEquipmentCsReqOuterClass {
  /**
   * Protobuf type {@code TakeOffEquipmentCsReq}
   */
  public static final class TakeOffEquipmentCsReq extends ProtoMessage<TakeOffEquipmentCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     */
    private int baseAvatarId;

    private TakeOffEquipmentCsReq() {
    }

    /**
     * @return a new empty instance of {@code TakeOffEquipmentCsReq}
     */
    public static TakeOffEquipmentCsReq newInstance() {
      return new TakeOffEquipmentCsReq();
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return this
     */
    public TakeOffEquipmentCsReq clearBaseAvatarId() {
      bitField0_ &= ~0x00000001;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 10;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public TakeOffEquipmentCsReq setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000001;
      baseAvatarId = value;
      return this;
    }

    @Override
    public TakeOffEquipmentCsReq copyFrom(final TakeOffEquipmentCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        baseAvatarId = other.baseAvatarId;
      }
      return this;
    }

    @Override
    public TakeOffEquipmentCsReq mergeFrom(final TakeOffEquipmentCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      return this;
    }

    @Override
    public TakeOffEquipmentCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarId = 0;
      return this;
    }

    @Override
    public TakeOffEquipmentCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TakeOffEquipmentCsReq)) {
        return false;
      }
      TakeOffEquipmentCsReq other = (TakeOffEquipmentCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(baseAvatarId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TakeOffEquipmentCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 80: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      output.endObject();
    }

    @Override
    public TakeOffEquipmentCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public TakeOffEquipmentCsReq clone() {
      return new TakeOffEquipmentCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TakeOffEquipmentCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TakeOffEquipmentCsReq(), data).checkInitialized();
    }

    public static TakeOffEquipmentCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeOffEquipmentCsReq(), input).checkInitialized();
    }

    public static TakeOffEquipmentCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TakeOffEquipmentCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating TakeOffEquipmentCsReq messages
     */
    public static MessageFactory<TakeOffEquipmentCsReq> getFactory() {
      return TakeOffEquipmentCsReqFactory.INSTANCE;
    }

    private enum TakeOffEquipmentCsReqFactory implements MessageFactory<TakeOffEquipmentCsReq> {
      INSTANCE;

      @Override
      public TakeOffEquipmentCsReq create() {
        return TakeOffEquipmentCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");
    }
  }
}
