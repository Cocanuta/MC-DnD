package com.snatchybuckles.sbdnd.init;

import com.snatchybuckles.sbdnd.SnatchyBucklesDnD;
import com.snatchybuckles.sbdnd.blocks.entity.renderer.PodiumRenderer;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = SnatchyBucklesDnD.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {

        });
    }
}
