package com.fractalmc.ecologicraft.utils;

public class Constants
{
    // Basic Mod Constants

    public static final String MOD_ID = "ecologicraft";
    public static final String MOD_NAME = "EcologiCraft";

    // Versioning Constants

    public static final String VERSION_CAT = "Alpha ";

    public static final int VERSION_MAJ = 1;
    public static final int VERSION_MIN = 0;
    public static final int VERSION_PAT = 0;
    public static final int VERSION_MIN_PAT = 0;

    public static final String COMPILED_VERSION = VERSION_CAT + VERSION_MAJ + "." + VERSION_MIN + "." + VERSION_PAT + "." + VERSION_MIN_PAT;

    public static final String VERSION_BLD = "Build 0000a";

    public static final String VERSION_MC = "[1.12]";

    // Dependency Constants

    public static final String DEPENDENCIES_FORGE = "required-after:forge@[14.23.5.2815,); "; // The space is important!
    public static final String DEPENDENCIES_MODS = "after:ic2; after:tconstruct; after:mantle;";

    public static final String DEPENDENCIES = DEPENDENCIES_FORGE + DEPENDENCIES_MODS;

    // Proxy Constants

    public static final String COMMON_PROXY_PATH = "com.fractalmc.ecologicraft.proxy.CommonProxy";
    public static final String CLIENT_PROXY_PATH = "com.fractalmc.ecologicraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_PATH = "com.fractalmc.ecologicraft.proxy.ServerProxy";

    // Other Constants

    public static final boolean USE_METADATA = true;
}
