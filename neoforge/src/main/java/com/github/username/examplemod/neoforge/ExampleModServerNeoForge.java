package com.github.username.examplemod.neoforge;

import com.github.username.examplemod.ExampleMod;
import com.github.username.examplemod.ExampleModServer;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = ExampleMod.MOD_ID, dist = Dist.DEDICATED_SERVER)
public class ExampleModServerNeoForge {
  public ExampleModServerNeoForge(IEventBus modBus) {
    ExampleModServer.init();
  }
}
