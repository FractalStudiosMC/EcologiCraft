package com.fractalmc.ecologicraft;

import com.fractalmc.ecologicraft.utils.Constants;
import com.fractalmc.ecologicraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
          modid = Constants.MOD_ID,
          name = Constants.MOD_NAME,
          version = Constants.COMPILED_VERSION,
          acceptedMinecraftVersions = Constants.VERSION_MC,
          dependencies = Constants.DEPENDENCIES,
          useMetadata = Constants.USE_METADATA
)
public class EcologiCraft
{
    @Mod.Instance(Constants.MOD_ID)
    public static EcologiCraft instance;

    @SidedProxy(clientSide = Constants.CLIENT_PROXY_PATH, serverSide = Constants.SERVER_PROXY_PATH)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
