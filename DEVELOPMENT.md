# Elementals Mod - Developer Documentation

Elementals Mod is a Minecraft Fabric mod built for Minecraft 1.21.1. This documentation outlines the technical stack, project structure, and build commands required for development.

## Technical Stack

* **Minecraft Version**: 1.21.1
* **Mod Loader**: Fabric Loader 0.18.4
* **Fabric API**: 0.116.7+1.21.1
* **Java Version**: 21
* **Build System**: Gradle with Fabric Loom 1.14
* **Mappings**: Yarn 1.21.1+build.3

## Project Structure

The project follows a standard Fabric mod structure:

* `src/main/java/net/lonk/elementals/`
    * **ElementalsMod.java**: Main entry point (Common/Server). Initializes items, blocks, and events.
    * **ElementalsModClient.java**: Client entry point. Handles rendering and HUDs.
    * **ElementalsModDataGenerator.java**: Entry point for data generation.
    * **block/ModBlocks.java**: Block registration.
    * **item/ModItems.java**: Item registration.
    * **gui/FlightPowerHud.java**: HUD overlay for the flight mechanic.
* `src/main/resources/`
    * `fabric.mod.json`: Mod metadata.
    * `elementals.mixins.json`: Mixin configuration.

## Development Setup

### Prerequisites

* JDK 21
* Git

### Build Commands

* **Build the Project**:
  ```bash
  ./gradlew build
  
* **Run Client**:
  ```bash
  ./gradlew runClient

* **Run Data Generation**: This mod uses Fabric Data Generation for recipes, loot tables and tags. Run this command to generate resources:
  ```bash
  ./gradlew runDatagen

* **Clean Build**:
  ```bash
  ./gradlew clean build

## Configuration Details
* Package: net.lonk.elementals
* Mod ID: elementals
* Version: 1.0.0
* License: GPL-3.0