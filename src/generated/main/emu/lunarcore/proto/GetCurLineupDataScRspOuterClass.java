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

public final class GetCurLineupDataScRspOuterClass {
  /**
   * Protobuf type {@code GetCurLineupDataScRsp}
   */
  public static final class GetCurLineupDataScRsp extends ProtoMessage<GetCurLineupDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 9;</code>
     */
    private int retcode;

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     */
    private final LineupInfoOuterClass.LineupInfo lineup = LineupInfoOuterClass.LineupInfo.newInstance();

    private GetCurLineupDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetCurLineupDataScRsp}
     */
    public static GetCurLineupDataScRsp newInstance() {
      return new GetCurLineupDataScRsp();
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return this
     */
    public GetCurLineupDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 9;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetCurLineupDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     * @return whether the lineup field is set
     */
    public boolean hasLineup() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     * @return this
     */
    public GetCurLineupDataScRsp clearLineup() {
      bitField0_ &= ~0x00000002;
      lineup.clear();
      return this;
    }

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLineup()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public LineupInfoOuterClass.LineupInfo getLineup() {
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public LineupInfoOuterClass.LineupInfo getMutableLineup() {
      bitField0_ |= 0x00000002;
      return lineup;
    }

    /**
     * <code>optional .LineupInfo lineup = 3;</code>
     * @param value the lineup to set
     * @return this
     */
    public GetCurLineupDataScRsp setLineup(final LineupInfoOuterClass.LineupInfo value) {
      bitField0_ |= 0x00000002;
      lineup.copyFrom(value);
      return this;
    }

    @Override
    public GetCurLineupDataScRsp copyFrom(final GetCurLineupDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        lineup.copyFrom(other.lineup);
      }
      return this;
    }

    @Override
    public GetCurLineupDataScRsp mergeFrom(final GetCurLineupDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasLineup()) {
        getMutableLineup().mergeFrom(other.lineup);
      }
      return this;
    }

    @Override
    public GetCurLineupDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      lineup.clear();
      return this;
    }

    @Override
    public GetCurLineupDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      lineup.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetCurLineupDataScRsp)) {
        return false;
      }
      GetCurLineupDataScRsp other = (GetCurLineupDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasLineup() || lineup.equals(other.lineup));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 26);
        output.writeMessageNoTag(lineup);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(lineup);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetCurLineupDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // lineup
            input.readMessage(lineup);
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.lineup, lineup);
      }
      output.endObject();
    }

    @Override
    public GetCurLineupDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1102671473: {
            if (input.isAtField(FieldNames.lineup)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(lineup);
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
    public GetCurLineupDataScRsp clone() {
      return new GetCurLineupDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetCurLineupDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetCurLineupDataScRsp(), data).checkInitialized();
    }

    public static GetCurLineupDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetCurLineupDataScRsp(), input).checkInitialized();
    }

    public static GetCurLineupDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetCurLineupDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetCurLineupDataScRsp messages
     */
    public static MessageFactory<GetCurLineupDataScRsp> getFactory() {
      return GetCurLineupDataScRspFactory.INSTANCE;
    }

    private enum GetCurLineupDataScRspFactory implements MessageFactory<GetCurLineupDataScRsp> {
      INSTANCE;

      @Override
      public GetCurLineupDataScRsp create() {
        return GetCurLineupDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName lineup = FieldName.forField("lineup");
    }
  }
}
