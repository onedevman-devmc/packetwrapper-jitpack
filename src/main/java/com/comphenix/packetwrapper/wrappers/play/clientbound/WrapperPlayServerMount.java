package com.comphenix.packetwrapper.wrappers.play.clientbound;

import com.comphenix.packetwrapper.wrappers.AbstractPacket;
import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerMount extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.MOUNT;

    public WrapperPlayServerMount() {
        super(TYPE);
    }

    public WrapperPlayServerMount(PacketContainer packet) {
        super(packet, TYPE);
    }

    /**
     * Retrieves the value of field 'vehicle'
     *
     * @return 'vehicle'
     */
    public int getVehicle() {
        return this.handle.getIntegers().read(0);
    }

    /**
     * Sets the value of field 'vehicle'
     *
     * @param value New value for field 'vehicle'
     */
    public void setVehicle(int value) {
        this.handle.getIntegers().write(0, value);
    }

    /**
     * Retrieves the value of field 'passengers'
     *
     * @return 'passengers'
     */
    public int[] getPassengers() {
        return this.handle.getIntegerArrays().read(0);
    }

    /**
     * Sets the value of field 'passengers'
     *
     * @param value New value for field 'passengers'
     */
    public void setPassengers(int[] value) {
        this.handle.getIntegerArrays().write(0, value);
    }

}
