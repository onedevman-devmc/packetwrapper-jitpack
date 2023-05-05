package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.MinecraftKey;

import java.util.List;

public class WrapperPlayServerRecipes extends AbstractPacket {

    public static final PacketType TYPE = PacketType.Play.Server.RECIPES;

    public WrapperPlayServerRecipes() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }

    public WrapperPlayServerRecipes(PacketContainer packet) {
        super(packet, TYPE);
    }

    public Object getState() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.network.protocol.game.ClientboundRecipePacket$State
    }

    public void setState(Object value) {
        throw new UnsupportedOperationException();
    }

    public List<MinecraftKey> getRecipes() {
        return handle.getLists(com.comphenix.protocol.wrappers.MinecraftKey.getConverter()).read(0);
    }

    public void setRecipes(List<MinecraftKey> value) {
        handle.getLists(com.comphenix.protocol.wrappers.MinecraftKey.getConverter()).write(0, value);
    }

    public Object getToHighlight() {
        return handle.getLists(com.comphenix.protocol.wrappers.MinecraftKey.getConverter()).read(1);
    }

    public void setToHighlight(List<MinecraftKey> value) {
        handle.getLists(com.comphenix.protocol.wrappers.MinecraftKey.getConverter()).write(1, value);
    }

    public Object getBookSettings() {
        throw new UnsupportedOperationException(); // TODO: No modifier has been found for type class net.minecraft.stats.RecipeBookSettings
    }

    public void setBookSettings(Object value) {
        throw new UnsupportedOperationException();
    }


}
