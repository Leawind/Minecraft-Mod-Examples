# Minecraft-Mod-Examples

A simple example of a Minecraft mod.

## What it does and doesn't contain

* [x] [Architectury Plugin](https://github.com/architectury/architectury-plugin): A simple Gradle plugin to enable
  developing multiplatform mods.
* Prepared structure for mod loaders:
	* [x] [Fabric](https://fabricmc.net): A modular, lightweight mod loader.
	* [x] [NeoForge](https://neoforged.net): Neo Modding API for Minecraft, based on Forge.
	* [ ] [Forge](https://files.minecraftforge.net): Modifications to the Minecraft base files to assist in
	  compatibility between mods.
* Recommended dependencies:
	* [x] [Mixin](https://github.com/SpongePowered/Mixin): A trait/mixin and bytecode weaving framework for Java using
	  ASM.
	* [x] [Mixinextras](https://github.com/LlamaLad7/MixinExtras): Companion library to SpongePowered Mixin with many
	  custom injectors for a more expressive experience.
	* [x] [Architectury API](https://github.com/architectury/architectury-api): An intermediary API aimed at easing the
	  development of multiplatform mods.
	* [ ] [ModMenu](https://github.com/TerraformersMC/ModMenu) (For Fabric).
* [ ] [Mod Publish Plugin](https://github.com/modmuss50/mod-publish-plugin): A Gradle plugin to publish mods to a range
  of destinations.

## How to use

If you want to create your own mod based on this example, you can replace all occurrences of identifiers like *example
mod* with your own.

You can locate all occurrences in the file contents using the regular expression `example.mod` (case-insensitive):

* Package name like `com.github.username.examplemod`
* File names:
	* `example_mod.mixins.json`
	* `example_mod-common.mixins.json`
* File contents:
	* `gradle.properties`
	* `fabric.mod.json`
	* `neoforge.mods.toml` or `mods.toml`
	* `architectury.common.json`
	* `example_mod.mixins.json`
	* `example_mod-common.mixins.json`
	* `build.gradle`
		* `loom.accessWidenerPath`
* Field `MOD_ID` in the source code

## Suggestions

* Use [Google Java Format](https://github.com/google/google-java-format) to format Java code.
* Use [Semantic Versioning](https://semver.org/).
