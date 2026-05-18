# Minecraft 1.12.2 HvH Client Collection

A curated collection of open-source Minecraft 1.12.2 utility mods designed for anarchy servers and HvH (Hacker vs Hacker) crystal/sword PvP.

## Included Clients

### 3arthh4ck
- **Repository:** [3arthqu4ke/3arthh4ck](https://github.com/3arthqu4ke/3arthh4ck) (original, archived)
- **Repository:** [3arthh4ckDevelopment/3arthh4ck-client](https://github.com/3arthh4ckDevelopment/3arthh4ck-client) (continued)
- **License:** MIT
- **Description:** Utility mod and proxy server for 1.12.2 anarchy PvP. Originally developed by 3arthqu4ke.
- **Directories:** `3arthh4ck-original/`, `3arthh4ck-client/`

### ThunderHack+
- **Repository:** [Gentleman2292/ThunderHackPlus](https://github.com/Gentleman2292/ThunderHackPlus)
- **License:** Based on GPL-3.0 components
- **Description:** 1.12.2 utility mod for Crystal/Sword HvH. Code incorporates elements from Wurst+3, Seppuku, Konas, 3arthh4ck, and others.
- **Directory:** `ThunderHackPlus/`

### GameSense
- **Repository:** [IUDevman/gamesense-client](https://github.com/IUDevman/gamesense-client)
- **License:** GPL-3.0
- **Description:** Minecraft 1.12.2 utility mod for anarchy and crystal PvP. Discontinued since May 2021.
- **Directory:** `gamesense-client/`

### SpiderSense
- **Repository:** [HausemasterIssue/spidersense](https://github.com/HausemasterIssue/spidersense)
- **License:** GPL-3.0
- **Description:** A discontinued continuation of the GameSense client.
- **Directory:** `spidersense/`

### SalHack
- **Repository:** [ionar2/spidermod](https://github.com/ionar2/spidermod) / [ionar2/salhack](https://github.com/ionar2/salhack)
- **Repository (Creepy):** [CreepyOrb924/creepy-salhack](https://github.com/CreepyOrb924/creepy-salhack)
- **License:** Custom open-source
- **Description:** Utility mod for anarchy servers. Originally private, later made open-source.
- **Directories:** `SalHack-original/`, `SalHack-alt/`, `creepy-salhack/`

## Requirements

- Minecraft 1.12.2
- Minecraft Forge 14.23.5.2855 (latest 1.12.2 build)

## Installation

1. Install Minecraft Forge for 1.12.2
2. Build the desired client using Gradle (`gradlew build`)
3. Place the built `.jar` from `build/libs/` into your `.minecraft/mods/` folder
4. Launch Minecraft with the Forge profile

## Building

Each client includes a Gradle wrapper. Build with:

```bash
cd <client-directory>
./gradlew build
```

The output `.jar` will be located in `build/libs/`.

## License & Credits

Each client retains its original license and authorship. See individual source directories for detailed license information and credits.

This is an educational collection for reference and research purposes only.
