package com.github.username.examplemod.fabric;

import com.github.username.examplemod.ExampleModClient;
import net.fabricmc.api.ClientModInitializer;

public class ExampleModClientFabric implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ExampleModClient.init();
  }
}
