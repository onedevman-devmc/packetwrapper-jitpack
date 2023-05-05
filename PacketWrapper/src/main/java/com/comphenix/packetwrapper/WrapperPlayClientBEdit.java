package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.Converters;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;

public class WrapperPlayClientBEdit extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Client.B_EDIT;

    public WrapperPlayClientBEdit() {
        super(TYPE);
    }

    public WrapperPlayClientBEdit(PacketContainer packet) {
        super(packet, TYPE);
    }

    public int getSlot() {
        return this.handle.getIntegers().read(0);
    }

    public void setSlot(int value) {
        this.handle.getIntegers().write(0, value);
    }

    public List<String> getPages() {
        return this.handle.getLists(Converters.passthrough(String.class)).read(0);
    }

    public void setPages(List<String> value) {
        this.handle.getLists(Converters.passthrough(String.class)).write(0, value);
    }

    public Optional<String> getTitle() {
        return this.handle.getOptionals(Converters.passthrough(String.class)).read(0);
    }

    public void setTitle(@Nullable String value) {
        this.handle.getOptionals(Converters.passthrough(String.class)).write(0, Optional.ofNullable(value));
    }


}
