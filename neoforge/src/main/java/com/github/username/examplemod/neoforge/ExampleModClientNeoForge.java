package com.github.username.examplemod.neoforge;

import com.github.username.examplemod.ExampleMod;
import com.github.username.examplemod.ExampleModClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(value = ExampleMod.MOD_ID, dist = Dist.CLIENT)
public class ExampleModClientNeoForge {
  public ExampleModClientNeoForge(IEventBus modBus) {
    ExampleModClient.init();
  }
}
