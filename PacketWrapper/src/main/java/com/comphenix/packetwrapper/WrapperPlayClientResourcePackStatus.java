package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.EnumWrappers.ResourcePackStatus;

public class WrapperPlayClientResourcePackStatus extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.RESOURCE_PACK_STATUS;

    public WrapperPlayClientResourcePackStatus() {
        super(TYPE);
    }

    public WrapperPlayClientResourcePackStatus(PacketContainer packet) {
        super(packet, TYPE);
    }

    public ResourcePackStatus getAction() {
        return this.handle.getResourcePackStatus().read(0);
    }

    public void setAction(ResourcePackStatus value) {
        this.handle.getResourcePackStatus().write(0, value);
    }


}
