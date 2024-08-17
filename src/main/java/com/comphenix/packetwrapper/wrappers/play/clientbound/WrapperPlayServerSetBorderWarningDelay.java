package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerSetBorderWarningDelay extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.SET_BORDER_WARNING_DELAY;

    public WrapperPlayServerSetBorderWarningDelay() {
        super(TYPE);
    }

    public WrapperPlayServerSetBorderWarningDelay(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'warningDelay'
     *
     * @return 'warningDelay'
     */
    public int getWarningDelay() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'warningDelay'
     *
     * @param value New value for field 'warningDelay'
     */
    public void setWarningDelay(int value) {
        this.handle.getIntegers().write(0, value);
    }

}
