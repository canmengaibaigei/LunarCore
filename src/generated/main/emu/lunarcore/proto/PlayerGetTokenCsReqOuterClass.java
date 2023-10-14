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
import us.hebi.quickbuf.Utf8String;

public final class PlayerGetTokenCsReqOuterClass {
  /**
   * Protobuf type {@code PlayerGetTokenCsReq}
   */
  public static final class PlayerGetTokenCsReq extends ProtoMessage<PlayerGetTokenCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 uid = 9;</code>
     */
    private int uid;

    /**
     * <code>optional uint32 platform_type = 10;</code>
     */
    private int platformType;

    /**
     * <code>optional string token = 1;</code>
     */
    private final Utf8String token = Utf8String.newEmptyInstance();

    /**
     * <code>optional string account_uid = 8;</code>
     */
    private final Utf8String accountUid = Utf8String.newEmptyInstance();

    private PlayerGetTokenCsReq() {
    }

    /**
     * @return a new empty instance of {@code PlayerGetTokenCsReq}
     */
    public static PlayerGetTokenCsReq newInstance() {
      return new PlayerGetTokenCsReq();
    }

    /**
     * <code>optional uint32 uid = 9;</code>
     * @return whether the uid field is set
     */
    public boolean hasUid() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 uid = 9;</code>
     * @return this
     */
    public PlayerGetTokenCsReq clearUid() {
      bitField0_ &= ~0x00000001;
      uid = 0;
      return this;
    }

    /**
     * <code>optional uint32 uid = 9;</code>
     * @return the uid
     */
    public int getUid() {
      return uid;
    }

    /**
     * <code>optional uint32 uid = 9;</code>
     * @param value the uid to set
     * @return this
     */
    public PlayerGetTokenCsReq setUid(final int value) {
      bitField0_ |= 0x00000001;
      uid = value;
      return this;
    }

    /**
     * <code>optional uint32 platform_type = 10;</code>
     * @return whether the platformType field is set
     */
    public boolean hasPlatformType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 platform_type = 10;</code>
     * @return this
     */
    public PlayerGetTokenCsReq clearPlatformType() {
      bitField0_ &= ~0x00000002;
      platformType = 0;
      return this;
    }

    /**
     * <code>optional uint32 platform_type = 10;</code>
     * @return the platformType
     */
    public int getPlatformType() {
      return platformType;
    }

    /**
     * <code>optional uint32 platform_type = 10;</code>
     * @param value the platformType to set
     * @return this
     */
    public PlayerGetTokenCsReq setPlatformType(final int value) {
      bitField0_ |= 0x00000002;
      platformType = value;
      return this;
    }

    /**
     * <code>optional string token = 1;</code>
     * @return whether the token field is set
     */
    public boolean hasToken() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional string token = 1;</code>
     * @return this
     */
    public PlayerGetTokenCsReq clearToken() {
      bitField0_ &= ~0x00000004;
      token.clear();
      return this;
    }

    /**
     * <code>optional string token = 1;</code>
     * @return the token
     */
    public String getToken() {
      return token.getString();
    }

    /**
     * <code>optional string token = 1;</code>
     * @return internal {@code Utf8String} representation of token for reading
     */
    public Utf8String getTokenBytes() {
      return this.token;
    }

    /**
     * <code>optional string token = 1;</code>
     * @return internal {@code Utf8String} representation of token for modifications
     */
    public Utf8String getMutableTokenBytes() {
      bitField0_ |= 0x00000004;
      return this.token;
    }

    /**
     * <code>optional string token = 1;</code>
     * @param value the token to set
     * @return this
     */
    public PlayerGetTokenCsReq setToken(final CharSequence value) {
      bitField0_ |= 0x00000004;
      token.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string token = 1;</code>
     * @param value the token to set
     * @return this
     */
    public PlayerGetTokenCsReq setToken(final Utf8String value) {
      bitField0_ |= 0x00000004;
      token.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @return whether the accountUid field is set
     */
    public boolean hasAccountUid() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @return this
     */
    public PlayerGetTokenCsReq clearAccountUid() {
      bitField0_ &= ~0x00000008;
      accountUid.clear();
      return this;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @return the accountUid
     */
    public String getAccountUid() {
      return accountUid.getString();
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @return internal {@code Utf8String} representation of accountUid for reading
     */
    public Utf8String getAccountUidBytes() {
      return this.accountUid;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @return internal {@code Utf8String} representation of accountUid for modifications
     */
    public Utf8String getMutableAccountUidBytes() {
      bitField0_ |= 0x00000008;
      return this.accountUid;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @param value the accountUid to set
     * @return this
     */
    public PlayerGetTokenCsReq setAccountUid(final CharSequence value) {
      bitField0_ |= 0x00000008;
      accountUid.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string account_uid = 8;</code>
     * @param value the accountUid to set
     * @return this
     */
    public PlayerGetTokenCsReq setAccountUid(final Utf8String value) {
      bitField0_ |= 0x00000008;
      accountUid.copyFrom(value);
      return this;
    }

    @Override
    public PlayerGetTokenCsReq copyFrom(final PlayerGetTokenCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        uid = other.uid;
        platformType = other.platformType;
        token.copyFrom(other.token);
        accountUid.copyFrom(other.accountUid);
      }
      return this;
    }

    @Override
    public PlayerGetTokenCsReq mergeFrom(final PlayerGetTokenCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUid()) {
        setUid(other.uid);
      }
      if (other.hasPlatformType()) {
        setPlatformType(other.platformType);
      }
      if (other.hasToken()) {
        getMutableTokenBytes().copyFrom(other.token);
      }
      if (other.hasAccountUid()) {
        getMutableAccountUidBytes().copyFrom(other.accountUid);
      }
      return this;
    }

    @Override
    public PlayerGetTokenCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      uid = 0;
      platformType = 0;
      token.clear();
      accountUid.clear();
      return this;
    }

    @Override
    public PlayerGetTokenCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      token.clear();
      accountUid.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerGetTokenCsReq)) {
        return false;
      }
      PlayerGetTokenCsReq other = (PlayerGetTokenCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasUid() || uid == other.uid)
        && (!hasPlatformType() || platformType == other.platformType)
        && (!hasToken() || token.equals(other.token))
        && (!hasAccountUid() || accountUid.equals(other.accountUid));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(platformType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 10);
        output.writeStringNoTag(token);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 66);
        output.writeStringNoTag(accountUid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(platformType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(token);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(accountUid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerGetTokenCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // uid
            uid = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // platformType
            platformType = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // token
            input.readString(token);
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // accountUid
            input.readString(accountUid);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.uid, uid);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.platformType, platformType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeString(FieldNames.token, token);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeString(FieldNames.accountUid, accountUid);
      }
      output.endObject();
    }

    @Override
    public PlayerGetTokenCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 115792: {
            if (input.isAtField(FieldNames.uid)) {
              if (!input.trySkipNullValue()) {
                uid = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 155581005:
          case 538062726: {
            if (input.isAtField(FieldNames.platformType)) {
              if (!input.trySkipNullValue()) {
                platformType = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 110541305: {
            if (input.isAtField(FieldNames.token)) {
              if (!input.trySkipNullValue()) {
                input.readString(token);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -803342621:
          case 866492222: {
            if (input.isAtField(FieldNames.accountUid)) {
              if (!input.trySkipNullValue()) {
                input.readString(accountUid);
                bitField0_ |= 0x00000008;
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
    public PlayerGetTokenCsReq clone() {
      return new PlayerGetTokenCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerGetTokenCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerGetTokenCsReq(), data).checkInitialized();
    }

    public static PlayerGetTokenCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerGetTokenCsReq(), input).checkInitialized();
    }

    public static PlayerGetTokenCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerGetTokenCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerGetTokenCsReq messages
     */
    public static MessageFactory<PlayerGetTokenCsReq> getFactory() {
      return PlayerGetTokenCsReqFactory.INSTANCE;
    }

    private enum PlayerGetTokenCsReqFactory implements MessageFactory<PlayerGetTokenCsReq> {
      INSTANCE;

      @Override
      public PlayerGetTokenCsReq create() {
        return PlayerGetTokenCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName uid = FieldName.forField("uid");

      static final FieldName platformType = FieldName.forField("platformType", "platform_type");

      static final FieldName token = FieldName.forField("token");

      static final FieldName accountUid = FieldName.forField("accountUid", "account_uid");
    }
  }
}
