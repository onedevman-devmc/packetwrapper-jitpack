package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerHeldItemSlot extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.HELD_ITEM_SLOT;

    public WrapperPlayServerHeldItemSlot() {
        super(TYPE);
    }

    public WrapperPlayServerHeldItemSlot(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'slot'
     *
     * @return 'slot'
     */
    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'slot'
     *
     * @param value New value for field 'slot'
     */
    public void setSlot(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
