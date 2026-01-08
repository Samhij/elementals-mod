# Elementals Mod - Project Context

## Project Overview
Elementals Mod is a Minecraft Fabric mod for Minecraft 1.21.1. The mod adds elemental-themed content to the game.

## Technical Stack
- **Minecraft Version**: 1.21.1
- **Mod Loader**: Fabric Loader 0.18.4
- **Fabric API**: 0.116.7+1.21.1
- **Java Version**: 21
- **Build System**: Gradle with Fabric Loom 1.14
- **Yarn Mappings**: 1.21.1+build.3

## Project Structure

```
elementals-mod/
├── src/main/java/net/lonk/elementals/
│   ├── ElementalsMod.java           # Main mod initialization
│   ├── ElementalsModClient.java     # Client-side initialization
│   ├── ElementalsModDataGenerator.java  # Data generation entry point
│   ├── block/
│   │   └── ModBlocks.java           # Block registration
│   ├── item/
│   │   ├── ModItems.java            # Item registration
│   │   ├── ModItemGroups.java       # Creative tab registration
│   │   ├── ModArmorMaterials.java   # Custom armor materials
│   │   └── ModToolMaterials.java    # Custom tool materials
│   ├── datagen/
│   │   ├── ModAdvancementProvider.java
│   │   ├── ModBlockTagProvider.java
│   │   ├── ModItemTagProvider.java
│   │   ├── ModLootTableProvider.java
│   │   ├── ModModelProvider.java
│   │   └── ModRecipeProvider.java
│   ├── event/
│   │   └── ModEvents.java           # Event handlers
│   └── gui/
│       └── FlightPowerHud.java      # HUD overlay for flight power
└── src/main/resources/
    ├── fabric.mod.json              # Mod metadata
    ├── elementals.mixins.json       # Mixin configuration
    └── assets/elementals/
        └── lang/en_us.json          # English translations

```

## Key Components

### Main Classes
- **ElementalsMod**: Main mod class, handles server-side and common initialization
  - Mod ID: `elementals`
  - Initializes items, blocks, item groups, and events

- **ElementalsModClient**: Client-side initialization and rendering

### Features
- Custom items and blocks
- Custom tool and armor materials
- Flight power system with HUD display
- Event handling system
- Full data generation support (models, recipes, tags, loot tables, advancements)

## Development Commands

### Building
```bash
./gradlew build
```

### Running Client
```bash
./gradlew runClient
```

### Data Generation
```bash
./gradlew runDatagen
```

### Clean Build
```bash
./gradlew clean build
```

## Mod Configuration
- **Package**: `net.lonk.elementals`
- **Mod ID**: `elementals`
- **Version**: 0.0.1
- **License**: GPL-3.0

## Important Files
- `build.gradle`: Build configuration and dependencies
- `gradle.properties`: Version properties and mod metadata
- `fabric.mod.json`: Fabric mod manifest
- `elementals.mixins.json`: Mixin configuration for runtime modifications

## Entrypoints
1. **Main** (`fabric-datagen`): ElementalsModDataGenerator - Generates game data
2. **Client**: ElementalsModClient, FlightPowerHud - Client-side rendering and UI
3. **Server/Common**: ElementalsMod - Core mod logic

## Notes
- The project uses Fabric data generation for all JSON assets
- Custom materials are defined for both tools and armor
- The mod includes a custom flight power mechanic with HUD integration
- All game content is registered through static registration methods in the main mod class
