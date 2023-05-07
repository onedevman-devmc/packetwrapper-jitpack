package com.comphenix.packetwrapper;

import com.comphenix.protocol.reflect.accessors.Accessors;
import com.comphenix.protocol.utility.MinecraftReflection;
import com.comphenix.protocol.utility.MinecraftVersion;

public class MinecraftReflectionTestUtil {

	public static final String RELEASE_TARGET = "1.19.4";
	public static final String PACKAGE_VERSION = "v1_19_R3";
	public static final String NMS = "net.minecraft";
	public static final String OBC = "org.bukkit.craftbukkit." + PACKAGE_VERSION;

	public static void init() {
		Accessors.getMethodAccessor(MinecraftReflection.class, "setMinecraftPackage", String.class, String.class).invoke(null, NMS, OBC);
		MinecraftVersion.setCurrentVersion(MinecraftVersion.LATEST);
	}
}
