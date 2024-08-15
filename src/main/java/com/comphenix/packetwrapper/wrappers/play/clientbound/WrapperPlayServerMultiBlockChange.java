package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.BlockPosition;
import com.comphenix.protocol.wrappers.WrappedBlockData;

/**
 * Send by server to client when 2 or more blocks are changed within the same chunk on the same tick.
 */
public class WrapperPlayServerMultiBlockChange extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MULTI_BLOCK_CHANGE;

    /**
     * Constructs a new wrapper and initialize it with a packet handle with default values
     */
    public WrapperPlayServerMultiBlockChange() {
        super(TYPE);
    }

    public WrapperPlayServerMultiBlockChange(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'sectionPos'
     *
     * @return 'sectionPos'
     */
    public BlockPosition getSectionPos() {
        return this.handle.getSectionPositions().read(0);
    }

    /**
     * Sets the value of field 'sectionPos'
     *
     * @param value New value for field 'sectionPos'
     */
    public void setSectionPos(BlockPosition value) {
        this.handle.getSectionPositions().write(0, value);
    }

    /**
     * Retrieves the value of field 'positions'
     *
     * @return 'positions'
     */
    public short[] getPositions() {
        return this.handle.getShortArrays().read(0);
    }

    /**
     * Sets the value of field 'positions'
     *
     * @param value New value for field 'positions'
     */
    public void setPositions(short[] value) {
        this.handle.getShortArrays().write(0, value);
    }

    /**
     * Retrieves the value of field 'states'
     *
     * @return 'states'
     */
    public WrappedBlockData[] getStates() {
        return this.handle.getBlockDataArrays().read(0);
    }

    /**
     * Sets the value of field 'states'
     *
     * @param value New value for field 'states'
     */
    public void setStates(WrappedBlockData[] value) {
        this.handle.getBlockDataArrays().write(0, value);
    }

    /**
     * Retrieves the value of field 'suppressLightUpdates'
     *
     * @return 'suppressLightUpdates'
     */
    public boolean getSuppressLightUpdates() {
        return this.handle.getBooleans().read(0);
    }

    /**
     * Sets the value of field 'suppressLightUpdates'
     *
     * @param value New value for field 'suppressLightUpdates'
     */
    public void setSuppressLightUpdates(boolean value) {
        this.handle.getBooleans().write(0, value);
    }

}
