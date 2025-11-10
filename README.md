# Empty ItemStack Fix

A Fabric mod for Minecraft 1.21.1 that fixes empty ItemStack issues.

## Features

- Fixes edge cases where ItemStack might not be properly detected as empty
- Uses Mixin to patch ItemStack behavior
- Lightweight and compatible with other mods

## Requirements

- Minecraft 1.21.1
- Fabric Loader 0.15.11 or higher
- Java 17 or higher

## Installation

1. Download the latest release from the [Releases](https://github.com/maciejos21151337/-empty-itemstack-fix/releases) page
2. Place the JAR file in your `.minecraft/mods` folder
3. Launch Minecraft with Fabric Loader

## Building

To build the mod from source:

```bash
./gradlew build
```

The built JAR will be in `build/libs/`.

## License

This project is licensed under the MIT License.