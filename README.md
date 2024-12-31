# Minecraft-Mod-Examples

A simple example mod of Minecraft.

## What does it have

* [x] [Architectury Plugin](https://github.com/architectury/architectury-plugin) A simple gradle plugin to enable
  developing multiplatform mods.
* Prepared structure for mod loaders
	* [x] [Fabric](https://fabricmc.net) A modular, lightweight mod loader.
	* [x] [NeoForge](https://neoforged.net) Neo Modding API for Minecraft, based on Forge.
	* [ ] [Forge](https://files.minecraftforge.net) Modifications to the Minecraft base files to assist in compatibility
	  between mods.
* Dependencies you may want to use
	* [x] [Mixin](https://github.com/SpongePowered/Mixin) A trait/mixin and bytecode weaving framework for Java using
	  ASM.
	* [x] [Mixinextras](https://github.com/LlamaLad7/MixinExtras) Companion library to SpongePowered Mixin with many
	  custom injectors for a more expressive experience.
	* [x] [Architectury API](https://github.com/architectury/architectury-api) An intermediary api aimed at easing
	  development of multiplatform mods.
	* [ ] [ModMenu](https://github.com/TerraformersMC/ModMenu) (For Fabric)
* [ ] [Mod Publish Plugin](https://github.com/modmuss50/mod-publish-plugin) A Gradle plugin to publish mods to a range
  of destinations

## How to use

If you want to make your own mod based on this example, you can replace all occurences of identifiers like
*example mod* to yours.

You can find all occurrences in files content by regular expression `example.mod` (ignore case)

* Package name like `com.github.username.examplemod`
* Name of file:
	* `example_mod.mixins.json`
	* `example_mod-common.mixins.json`
* Content in files:
	* `gradle.properties`
	* `fabric.mod.json`
	* `neoforge.mods.toml` or `mods.toml`
	* `architectury.common.json`
	* `example_mod.mixins.json`
	* `example_mod-common.mixins.json`
	* `build.gradle`
		* `loom.accessWidenerPath`
* Field `MOD_ID` in source code

## Suggestions

* Use [Google Java format](https://github.com/google/google-java-format) to format java code.
* Use [Semantic Versioning](https://semver.org/)
