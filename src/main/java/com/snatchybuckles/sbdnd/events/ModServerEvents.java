package com.snatchybuckles.sbdnd.events;

import com.snatchybuckles.sbdnd.SnatchyBucklesDnD;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SnatchyBucklesDnD.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // do something when the server starts
        SnatchyBucklesDnD.LOGGER.info("Server starting with ", SnatchyBucklesDnD.MODID);
    }
}
