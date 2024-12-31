package com.github.username.examplemod.fabric;

import com.github.username.examplemod.ExampleModServer;
import net.fabricmc.api.DedicatedServerModInitializer;

public class ExampleModServerFabric implements DedicatedServerModInitializer {
  @Override
  public void onInitializeServer() {
    ExampleModServer.init();
  }
}
