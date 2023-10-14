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
import us.hebi.quickbuf.RepeatedMessage;

public final class DoGachaScRspOuterClass {
  /**
   * Protobuf type {@code DoGachaScRsp}
   */
  public static final class DoGachaScRsp extends ProtoMessage<DoGachaScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 gacha_id = 3;</code>
     */
    private int gachaId;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 gacha_num = 5;</code>
     */
    private int gachaNum;

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     */
    private final RepeatedMessage<GachaItemOuterClass.GachaItem> gachaItemList = RepeatedMessage.newEmptyInstance(GachaItemOuterClass.GachaItem.getFactory());

    private DoGachaScRsp() {
    }

    /**
     * @return a new empty instance of {@code DoGachaScRsp}
     */
    public static DoGachaScRsp newInstance() {
      return new DoGachaScRsp();
    }

    /**
     * <code>optional uint32 gacha_id = 3;</code>
     * @return whether the gachaId field is set
     */
    public boolean hasGachaId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 gacha_id = 3;</code>
     * @return this
     */
    public DoGachaScRsp clearGachaId() {
      bitField0_ &= ~0x00000001;
      gachaId = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_id = 3;</code>
     * @return the gachaId
     */
    public int getGachaId() {
      return gachaId;
    }

    /**
     * <code>optional uint32 gacha_id = 3;</code>
     * @param value the gachaId to set
     * @return this
     */
    public DoGachaScRsp setGachaId(final int value) {
      bitField0_ |= 0x00000001;
      gachaId = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public DoGachaScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public DoGachaScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 gacha_num = 5;</code>
     * @return whether the gachaNum field is set
     */
    public boolean hasGachaNum() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 gacha_num = 5;</code>
     * @return this
     */
    public DoGachaScRsp clearGachaNum() {
      bitField0_ &= ~0x00000004;
      gachaNum = 0;
      return this;
    }

    /**
     * <code>optional uint32 gacha_num = 5;</code>
     * @return the gachaNum
     */
    public int getGachaNum() {
      return gachaNum;
    }

    /**
     * <code>optional uint32 gacha_num = 5;</code>
     * @param value the gachaNum to set
     * @return this
     */
    public DoGachaScRsp setGachaNum(final int value) {
      bitField0_ |= 0x00000004;
      gachaNum = value;
      return this;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     * @return whether the gachaItemList field is set
     */
    public boolean hasGachaItemList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     * @return this
     */
    public DoGachaScRsp clearGachaItemList() {
      bitField0_ &= ~0x00000008;
      gachaItemList.clear();
      return this;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGachaItemList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<GachaItemOuterClass.GachaItem> getGachaItemList() {
      return gachaItemList;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<GachaItemOuterClass.GachaItem> getMutableGachaItemList() {
      bitField0_ |= 0x00000008;
      return gachaItemList;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     * @param value the gachaItemList to add
     * @return this
     */
    public DoGachaScRsp addGachaItemList(final GachaItemOuterClass.GachaItem value) {
      bitField0_ |= 0x00000008;
      gachaItemList.add(value);
      return this;
    }

    /**
     * <pre>
     *  IMLHGEIOOHE
     * </pre>
     *
     * <code>repeated .GachaItem gacha_item_list = 9;</code>
     * @param values the gachaItemList to add
     * @return this
     */
    public DoGachaScRsp addAllGachaItemList(final GachaItemOuterClass.GachaItem... values) {
      bitField0_ |= 0x00000008;
      gachaItemList.addAll(values);
      return this;
    }

    @Override
    public DoGachaScRsp copyFrom(final DoGachaScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        gachaId = other.gachaId;
        retcode = other.retcode;
        gachaNum = other.gachaNum;
        gachaItemList.copyFrom(other.gachaItemList);
      }
      return this;
    }

    @Override
    public DoGachaScRsp mergeFrom(final DoGachaScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGachaId()) {
        setGachaId(other.gachaId);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasGachaNum()) {
        setGachaNum(other.gachaNum);
      }
      if (other.hasGachaItemList()) {
        getMutableGachaItemList().addAll(other.gachaItemList);
      }
      return this;
    }

    @Override
    public DoGachaScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaId = 0;
      retcode = 0;
      gachaNum = 0;
      gachaItemList.clear();
      return this;
    }

    @Override
    public DoGachaScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      gachaItemList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DoGachaScRsp)) {
        return false;
      }
      DoGachaScRsp other = (DoGachaScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasGachaId() || gachaId == other.gachaId)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasGachaNum() || gachaNum == other.gachaNum)
        && (!hasGachaItemList() || gachaItemList.equals(other.gachaItemList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(gachaNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < gachaItemList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(gachaItemList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gachaNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * gachaItemList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(gachaItemList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DoGachaScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // gachaId
            gachaId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // gachaNum
            gachaNum = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // gachaItemList
            tag = input.readRepeatedMessage(gachaItemList, tag);
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.gachaId, gachaId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.gachaNum, gachaNum);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.gachaItemList, gachaItemList);
      }
      output.endObject();
    }

    @Override
    public DoGachaScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -204751299:
          case -2052301576: {
            if (input.isAtField(FieldNames.gachaId)) {
              if (!input.trySkipNullValue()) {
                gachaId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -2052317532:
          case 803166025: {
            if (input.isAtField(FieldNames.gachaNum)) {
              if (!input.trySkipNullValue()) {
                gachaNum = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 725790195:
          case -1418891315: {
            if (input.isAtField(FieldNames.gachaItemList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(gachaItemList);
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
    public DoGachaScRsp clone() {
      return new DoGachaScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DoGachaScRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DoGachaScRsp(), data).checkInitialized();
    }

    public static DoGachaScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DoGachaScRsp(), input).checkInitialized();
    }

    public static DoGachaScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DoGachaScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating DoGachaScRsp messages
     */
    public static MessageFactory<DoGachaScRsp> getFactory() {
      return DoGachaScRspFactory.INSTANCE;
    }

    private enum DoGachaScRspFactory implements MessageFactory<DoGachaScRsp> {
      INSTANCE;

      @Override
      public DoGachaScRsp create() {
        return DoGachaScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName gachaId = FieldName.forField("gachaId", "gacha_id");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName gachaNum = FieldName.forField("gachaNum", "gacha_num");

      static final FieldName gachaItemList = FieldName.forField("gachaItemList", "gacha_item_list");
    }
  }
}
