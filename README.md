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

### Lambda Legacy
- **Repository:** [lambda-client/lambda-legacy](https://github.com/lambda-client/lambda-legacy)
- **License:** LGPL-3.0
- **Description:** Free, open-source 1.12.2 utility mod for anarchy servers with a visionary plugin system. Successor to KAMI Blue. One of the most well-known free anarchy clients.
- **Directory:** `lambda-legacy/`

### KAMI Blue
- **Repository:** [kami-blue/client](https://github.com/kami-blue/client)
- **License:** LGPL-3.0
- **Description:** Continuation of 1.12.2 KAMI. Known for excellent elytra flight bypasses on 2b2t with Baritone integration.
- **Directory:** `kami-blue/`

### TrollHack
- **Repository:** [Luna5ama/TrollHack](https://github.com/Luna5ama/TrollHack)
- **License:** GPL-3.0
- **Description:** Strong hack for anarchy servers with excellent CrystalAura, various bypasses, and a wide array of combat/utility modules.
- **Directory:** `trollhack/`

### Wurst+3
- **Repository:** [WurstPlus/wurst-plus-three](https://github.com/WurstPlus/wurst-plus-three)
- **License:** AGPL-3.0
- **Description:** 1.12.2 Forge client made for crystal PvP. Popular free alternative heavily used in the HvH community.
- **Directory:** `wurst-plus-three/`

### Cosmos
- **Repository:** [momentumdevelopment/cosmos](https://github.com/momentumdevelopment/cosmos)
- **License:** GPL-3.0
- **Description:** Free, open-source 1.12.2 Forge PvP client aimed at the anarchy community with CrystalAura, KillAura, Surround and more.
- **Directory:** `cosmos/`

### Temple Client Legacy
- **Repository:** [TempleDevelopment/Temple-Client-Legacy](https://github.com/TempleDevelopment/Temple-Client-Legacy)
- **License:** GPL-3.0
- **Description:** Actively maintained free and open-source utility mod for the anarchy experience. Supports sword/crystal PvP.
- **Directory:** `temple-client/`

### CookieClient
- **Repository:** [bebeli555/CookieClient](https://github.com/bebeli555/CookieClient)
- **License:** None specified
- **Description:** Utility client for anarchy servers. Notable for its ElytraBot pathfinding module independent of Baritone.
- **Directory:** `cookieclient/`

### Ferox
- **Repository:** [olliem5/ferox](https://github.com/olliem5/ferox)
- **License:** GPL-3.0
- **Description:** An old private client, now made public. Forge 1.12.2 anarchy client with combat modules.
- **Directory:** `ferox/`

### ForgeWurst
- **Repository:** [Wurst-Imperium/ForgeWurst](https://github.com/Wurst-Imperium/ForgeWurst)
- **License:** GPL-3.0
- **Description:** Official Wurst client ported to run as a Forge mod rather than a standalone. Classic Wurst modules.
- **Directory:** `forgewurst/`

### Gate Client
- **Repository:** [TheF1xer/GateClient-1.12.2](https://github.com/TheF1xer/GateClient-1.12.2)
- **License:** Custom open-source
- **Description:** Free and open-source Forge utility mod with preset system, click GUI (Right-Shift), command system, and various utility/combat modules.
- **Directory:** `gate-client/`

### Havook
- **Repository:** [rayferric/havook-1.12.2](https://github.com/rayferric/havook-1.12.2)
- **License:** MIT
- **Description:** Lightweight cleaned client for Minecraft Forge 1.12.2 with MIT license.
- **Directory:** `havook/`

### Method Client
- **Repository:** [danmaster2/MethodClient](https://github.com/danmaster2/MethodClient)
- **License:** WTFPL
- **Description:** A clean new client for Minecraft 1.12.2 using the latest Forge version (14.23.5.2855).
- **Directory:** `method-client/`

## License & Credits

Each client retains its original license and authorship. See individual source directories for detailed license information and credits.

This is an educational collection for reference and research purposes only.
