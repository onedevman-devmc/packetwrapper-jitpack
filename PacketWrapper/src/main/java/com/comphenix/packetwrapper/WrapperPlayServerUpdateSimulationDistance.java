package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerUpdateSimulationDistance extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.UPDATE_SIMULATION_DISTANCE;

    public WrapperPlayServerUpdateSimulationDistance() {
        super(TYPE);
    }

    public WrapperPlayServerUpdateSimulationDistance(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSimulationDistance() {
        return this.handle.getIntegers().read(0);
    }

    public void setSimulationDistance(int value) {
        this.handle.getIntegers().write(0, value);
    }


}
