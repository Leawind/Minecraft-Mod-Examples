# Minecraft-Mod-Examples

Simple example mod of Minecraft.

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
