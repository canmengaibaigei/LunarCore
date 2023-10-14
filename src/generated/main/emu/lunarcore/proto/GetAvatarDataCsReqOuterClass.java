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
import us.hebi.quickbuf.RepeatedInt;

public final class GetAvatarDataCsReqOuterClass {
  /**
   * Protobuf type {@code GetAvatarDataCsReq}
   */
  public static final class GetAvatarDataCsReq extends ProtoMessage<GetAvatarDataCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional bool is_get_all = 6;</code>
     */
    private boolean isGetAll;

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     */
    private final RepeatedInt baseAvatarIdList = RepeatedInt.newEmptyInstance();

    private GetAvatarDataCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetAvatarDataCsReq}
     */
    public static GetAvatarDataCsReq newInstance() {
      return new GetAvatarDataCsReq();
    }

    /**
     * <code>optional bool is_get_all = 6;</code>
     * @return whether the isGetAll field is set
     */
    public boolean hasIsGetAll() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional bool is_get_all = 6;</code>
     * @return this
     */
    public GetAvatarDataCsReq clearIsGetAll() {
      bitField0_ &= ~0x00000001;
      isGetAll = false;
      return this;
    }

    /**
     * <code>optional bool is_get_all = 6;</code>
     * @return the isGetAll
     */
    public boolean getIsGetAll() {
      return isGetAll;
    }

    /**
     * <code>optional bool is_get_all = 6;</code>
     * @param value the isGetAll to set
     * @return this
     */
    public GetAvatarDataCsReq setIsGetAll(final boolean value) {
      bitField0_ |= 0x00000001;
      isGetAll = value;
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     * @return whether the baseAvatarIdList field is set
     */
    public boolean hasBaseAvatarIdList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     * @return this
     */
    public GetAvatarDataCsReq clearBaseAvatarIdList() {
      bitField0_ &= ~0x00000002;
      baseAvatarIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBaseAvatarIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBaseAvatarIdList() {
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBaseAvatarIdList() {
      bitField0_ |= 0x00000002;
      return baseAvatarIdList;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     * @param value the baseAvatarIdList to add
     * @return this
     */
    public GetAvatarDataCsReq addBaseAvatarIdList(final int value) {
      bitField0_ |= 0x00000002;
      baseAvatarIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 base_avatar_id_list = 2;</code>
     * @param values the baseAvatarIdList to add
     * @return this
     */
    public GetAvatarDataCsReq addAllBaseAvatarIdList(final int... values) {
      bitField0_ |= 0x00000002;
      baseAvatarIdList.addAll(values);
      return this;
    }

    @Override
    public GetAvatarDataCsReq copyFrom(final GetAvatarDataCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        isGetAll = other.isGetAll;
        baseAvatarIdList.copyFrom(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public GetAvatarDataCsReq mergeFrom(final GetAvatarDataCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasIsGetAll()) {
        setIsGetAll(other.isGetAll);
      }
      if (other.hasBaseAvatarIdList()) {
        getMutableBaseAvatarIdList().addAll(other.baseAvatarIdList);
      }
      return this;
    }

    @Override
    public GetAvatarDataCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      isGetAll = false;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public GetAvatarDataCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      baseAvatarIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetAvatarDataCsReq)) {
        return false;
      }
      GetAvatarDataCsReq other = (GetAvatarDataCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasIsGetAll() || isGetAll == other.isGetAll)
        && (!hasBaseAvatarIdList() || baseAvatarIdList.equals(other.baseAvatarIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeBoolNoTag(isGetAll);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < baseAvatarIdList.length(); i++) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(baseAvatarIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * baseAvatarIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(baseAvatarIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetAvatarDataCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // isGetAll
            isGetAll = input.readBool();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // baseAvatarIdList [packed=true]
            input.readPackedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000002;
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
          case 16: {
            // baseAvatarIdList [packed=false]
            tag = input.readRepeatedUInt32(baseAvatarIdList, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeBool(FieldNames.isGetAll, isGetAll);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.baseAvatarIdList, baseAvatarIdList);
      }
      output.endObject();
    }

    @Override
    public GetAvatarDataCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -575333323:
          case 1425508131: {
            if (input.isAtField(FieldNames.isGetAll)) {
              if (!input.trySkipNullValue()) {
                isGetAll = input.readBool();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1212654461:
          case 914628490: {
            if (input.isAtField(FieldNames.baseAvatarIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(baseAvatarIdList);
                bitField0_ |= 0x00000002;
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
    public GetAvatarDataCsReq clone() {
      return new GetAvatarDataCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetAvatarDataCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), data).checkInitialized();
    }

    public static GetAvatarDataCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), input).checkInitialized();
    }

    public static GetAvatarDataCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetAvatarDataCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetAvatarDataCsReq messages
     */
    public static MessageFactory<GetAvatarDataCsReq> getFactory() {
      return GetAvatarDataCsReqFactory.INSTANCE;
    }

    private enum GetAvatarDataCsReqFactory implements MessageFactory<GetAvatarDataCsReq> {
      INSTANCE;

      @Override
      public GetAvatarDataCsReq create() {
        return GetAvatarDataCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName isGetAll = FieldName.forField("isGetAll", "is_get_all");

      static final FieldName baseAvatarIdList = FieldName.forField("baseAvatarIdList", "base_avatar_id_list");
    }
  }
}
