# Minecraft 1.12.2 HvH Client Collection

> A curated collection of **50 open-source** Minecraft 1.12.2 utility mods designed for anarchy servers and HvH (Hacker vs Hacker) crystal/sword PvP.

---

## Quick Start Guide :rocket:

### 1. Prerequisites :wrench:
- Minecraft **1.12.2** (Java Edition)
- Minecraft **Forge 14.23.5.2855** (latest 1.12.2 build) — [download here](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.12.2.html)
- **Java 8** or higher (some clients may need **Java 17**)

### 2. Build a Client :hammer_and_wrench:
```bash
cd <client-directory>
./gradlew build
```
The compiled `.jar` will be in `build/libs/`.

> :bulb: If `gradlew` fails, try `chmod +x gradlew` first, or use `gradle build` if you have Gradle installed globally.

### 3. Install :package:
1. Locate your `.minecraft` folder:
   - **Windows:** `%appdata%/.minecraft`
   - **Linux/macOS:** `~/.minecraft`
2. Create a `mods` folder if it doesn't exist
3. Copy the built `.jar` into `.minecraft/mods/`
4. Launch Minecraft using the **Forge** profile

---

## Usage Guide :video_game:

### Opening the ClickGUI
Different clients use different keybinds. Here are the most common ones:

| Keybind | Clients |
|---------|---------|
| `RSHIFT` | Cosmos, GameSense, Temple Client, Gate Client, Spark Client, Kami Blue |
| `LSHIFT` (Left Arrow equivalent) | SalHack, Creepy SalHack |
| `P` | 3arthh4ck (original), Lynx, ThunderHack+ |
| `Y` | Lambda Legacy, KAMI |
| `O` | GameSense+ (forks) |
| `BACKSLASH` (`\`) | FamilyFunPack |
| `GRAVE` (`` ` ``) | Temple Client (HUD toggle) |
| `J` | Claudius |
| `Right GUI` settings button | TutorialClient |

> :mag: Can't find the keybind? Check the client's source code for `ClickGui` module or look in the `ModuleManager` class.

### Command Prefixes
Most clients use a chat-based command system:

| Prefix | Clients |
|--------|---------|
| `.` (period) | 3arthh4ck, ThunderHack+, Temple Client, Gate Client, Sushi Client |
| `+` (plus) | 3arthh4ck (commands), Lambda Legacy |
| `*` (asterisk) | Cosmos |
| `!` (exclamation) | Claudius |
| `-` (hyphen) | Seppuku |
| `#` (hash) | ForgeHax |

**Common commands:**
- `.bind <module> <key>` — Bind a module to a key
- `.toggle <module>` — Toggle a module on/off
- `.set <module> <setting> <value>` — Change a setting
- `.help` or `.commands` — List all available commands

### Module Categories :card_index_dividers:
Most clients organize modules into these categories:
- :crossed_swords: **Combat** — KillAura, AutoCrystal, Surround, AutoTrap, HoleFill
- :runner: **Movement** — Speed, Flight, Step, NoSlow, Velocity
- :art: **Render** — ESP, Tracers, Nametags, Chams, Fullbright
- :jigsaw: **Misc** — AntiAFK, AutoTool, ChatSuffix, Spammer
- :boom: **Exploits** — Timer, TickShift, PacketCanceller, Blink
- :eyes: **Client** — ClickGUI, HUD Editor, Colors

### Building Tips :construction:
- Some clients require **JDK 8**, others need **JDK 17** (e.g., 3arthh4ck-client, Ares). Check the `build.gradle` for `sourceCompatibility` / `targetCompatibility`.
- If you get `OutOfMemoryError`, add to `gradle.properties`: `org.gradle.jvmargs=-Xmx2g`
- For Windows users, use `gradlew.bat` instead of `./gradlew`

---

## How to Use in HvH :crossed_swords:

### Crystal PvP Setup :crystal_ball:
Modules commonly used for crystal PvP:
1. **AutoCrystal** — Automatically places and detonates end crystals
2. **Surround** — Places blocks around you to prevent crystal damage
3. **OffHand** — Automatically switches between crystal/totem in offhand
4. **AutoTrap** / **CrystalTrap** — Traps enemies in crystals
5. **Velocity** — Reduces/removes knockback
6. **NoSlow** — Prevents slowdown from eating/holding items

### Sword PvP Setup :dagger:
1. **KillAura** — Automatically attacks nearby enemies
2. **Criticals** — Ensures every hit is a critical hit
3. **AutoArmor** — Automatically equips best armor
4. **Speed** — Movement speed boost
5. **WTap** / **STap** — Sprint-reset for combo advantage

### Anarchy Server Essentials :skull:
1. **AutoLog** — Automatically disconnect on low health
2. **AntiBot** — Filters out bot entities
3. **PortalChat** — Chat while in nether portals
4. **XCarry** — Carry items in crafting grid
5. **EntityDesync** — Dupe-related exploits
6. **Timer** — Speed up game ticks

---

## Full Client List :books:

### :first_quarter_moon: Tier 1 — Most Popular
| # | Client | Directory | License | Stars | Default GUI |
|---|--------|-----------|---------|-------|-------------|
| 1 | **3arthh4ck** (original) | `3arthh4ck-original/` | MIT | 220+ | `P` |
| 2 | **3arthh4ck** (continued) | `3arthh4ck-client/` | MIT | 40+ | `P` |
| 3 | **LiquidBounce** (legacy) | `liquidbounce-legacy/` | GPL-3.0 | 2200+ | — |
| 4 | **Lambda Legacy** | `lambda-legacy/` | LGPL-3.0 | 616+ | `Y` |
| 5 | **ForgeHax** | `forgehax/` | MIT | 494+ | — |
| 6 | **KAMI Blue** | `kami-blue/` | LGPL-3.0 | 378+ | `RSHIFT` |
| 7 | **Seppuku** | `seppuku/` | Custom | 276+ | `RSHIFT` |
| 8 | **KAMI** (original) | `kami/` | LGPL-3.0 | 245+ | `Y` |
| 9 | **GameSense** | `gamesense-client/` | GPL-3.0 | 208+ | `RSHIFT` |
| 10 | **Wurst+3** | `wurst-plus-three/` | AGPL-3.0 | 198+ | `RSHIFT` |
| 11 | **TrollHack** | `trollhack/` | GPL-3.0 | 198+ | — |
| 12 | **Postman** | `postman-legacy/` | MIT | 176+ | — |
| 13 | **Cosmos** | `cosmos/` | GPL-3.0 | 145+ | `RSHIFT` |

### :waxing_gibbous_moon: Tier 2 — Well Known
| # | Client | Directory | License | Stars | Default GUI |
|---|--------|-----------|---------|-------|-------------|
| 14 | **FamilyFunPack** | `familyfunpack/` | Custom | 104+ | `\` |
| 15 | **Gish Code 1.12.2** | `gish-code/` | Custom | 98+ | — |
| 16 | **CookieClient** | `cookieclient/` | — | 90+ | — |
| 17 | **PepsiMod** | `pepsimod/` | Custom | 171+ | — |
| 18 | **Momentum** | `momentum/` | GPL-3.0 | 83+ | — |
| 19 | **SalHack** | `SalHack-original/`, `SalHack-alt/` | Custom | — | `LSHIFT` |
| 20 | **Creepy SalHack** | `creepy-salhack/` | Custom | 75+ | `LSHIFT` |
| 21 | **Konas** (archive) | `konas/` | Custom | 82+ | — |
| 22 | **Ferox** | `ferox/` | GPL-3.0 | 60+ | — |
| 23 | **MoneyMod** | `moneymod/` | Custom | 57+ | — |
| 24 | **ForgeWurst** | `forgewurst/` | GPL-3.0 | 46+ | — |
| 25 | **Gate Client** | `gate-client/` | Custom | 34+ | `RSHIFT` |

### :full_moon: Tier 3 — Notable
| # | Client | Directory | License | Stars | Default GUI |
|---|--------|-----------|---------|-------|-------------|
| 26 | **Spark Client** | `spark-client/` | MIT | 38+ | `RSHIFT` |
| 27 | **Temple Client Legacy** | `temple-client/` | GPL-3.0 | 37+ | `RSHIFT` |
| 28 | **Havook** | `havook/` | MIT | 32+ | — |
| 29 | **Vox Client** | `vox-client/` | MIT | 29+ | — |
| 30 | **Sushi Client** | `sushi-client/` | — | 25+ | `RSHIFT` |
| 31 | **Lynx** | `lynx/` | MIT | 23+ | `P` |
| 32 | **ThunderHack+** | `ThunderHackPlus/` | GPL-3.0 | — | `P` |
| 33 | **SpiderSense** | `spidersense/` | GPL-3.0 | 21+ | `RSHIFT` |
| 34 | **Method Client** | `method-client/` | WTFPL | 19+ | — |
| 35 | **Impact 3.0** (port) | `impact-3.0/` | Custom | 18+ | — |
| 36 | **Noteless** | `noteless/` | GPL-3.0 | — | — |
| 37 | **LavaHack-Forge** | `lavahack-forge/` | Custom | — | — |
| 38 | **LiquidBounce++** | `liquidbounce-plusplus/` | GPL-3.0 | — | — |
| 39 | **SpectClient** | `spectclient/` | MIT | 11+ | — |
| 40 | **BreadClient** | `breadclient/` | Custom | — | — |
| 41 | **Misericordia** | `misericordia/` | MIT | — | — |
| 42 | **Hes0y4m** | `hes0y4m/` | Custom | — | `P` |
| 43 | **Exeter** (fork) | `exeter/` | GPL-3.0 | — | — |
| 44 | **Phobos** (archive) | `phobos-archive/` | GPL-3.0 | — | — |
| 45 | **Claudius** | `claudius/` | — | 14+ | `J` |
| 46 | **OnigiriClient** | `onigiriclient/` | — | 7+ | — |
| 47 | **FencingFPlusTwo** | `fencingfplustwo/` | Custom | — | — |
| 48 | **Postman Reborn** | `postman-reborn/` | MIT | — | — |
| 49 | **TutorialClient** | `tutorialclient/` | Custom | — | — |
| 50 | **Ananta** | `ananta/` | Custom | — | — |
| 51 | **Cranberry** | `cranberry/` | Custom | 8+ | — |
| 52 | **Paragon** | `paragon/` | Custom | — | `RSHIFT` |
| 53 | **FrogWare** | `frogware/` | Custom | — | — |
| 54 | **Past** | `past/` | MIT | — | — |
| 55 | **Mud** | `mud/` | Custom | — | — |
| 56 | **OpenSkyrim** | `openskyrim/` | GPL-3.0 | — | — |
| 57 | **Lambda (5cmc fork)** | `lambda-5cmc/` | LGPL-3.0 | — | `Y` |
| 58 | **GameSense++** | `gamesenseplusplus/` | GPL-3.0 | — | `RSHIFT` |
| 59 | **RussianWare** | `russianware/` | Custom | — | — |
| 60 | **AllahClient** | `allahclient/` | Custom | 7+ | — |
| 61 | **Ares** | `ares/` | LGPL-3.0 | 188+ | `;` |
| 62 | **GrassWare.win** | `grassware/` | Custom | — | — |
| 63 | **FrogHack** | `froghack/` | Custom | — | — |
| 64 | **Project Dupermen** | `project-dupermen/` | Custom | — | — |
| 65 | **Qubit** | `qubit/` | Custom | — | — |

## Quick Reference :memo:

### ClickGUI Keybinds by Client
| Key | Clients |
|-----|---------|
| `RSHIFT` | Cosmos, GameSense, Temple Client, Gate Client, Spark Client, Kami Blue, Seppuku, Sushi Client |
| `P` | 3arthh4ck, ThunderHack+, Lynx, Hes0y4m |
| `Y` | Lambda Legacy, KAMI |
| `LSHIFT` | SalHack, Creepy SalHack |
| `J` | Claudius |
| `\` | FamilyFunPack |
| `Right GUI` | TutorialClient |

### Common Issues & Fixes :bug:
| Issue | Fix |
|-------|-----|
| `java.lang.OutOfMemoryError` | Allocate more RAM in launcher (JVM args: `-Xmx2G -Xms1G`) |
| `NoSuchMethodError` or `ClassNotFoundException` | Wrong Forge version — use **14.23.5.2855** |
| `Gradle sync failed` | Run `./gradlew clean` then `./gradlew build` again |
| `Could not find method compile()` | Client uses old Gradle — replace `compile` with `implementation` in `build.gradle` |
| Crash on startup | Delete `.minecraft/config/<client-name>` folder |
| Mixin errors | Make sure no other Forge mods conflict; try a clean mods folder |

---

## License & Credits :scroll:

Each client retains its original license and authorship. See individual source directories for detailed license information and credits.

This is an educational collection for reference and research purposes only. Use at your own risk on servers where such modifications are permitted.

---

## Stats :bar_chart:
- **Total clients:** 65
- **Total size:** ~300 MB
- **Licenses:** MIT, GPL-3.0, LGPL-3.0, AGPL-3.0, Apache-2.0, WTFPL, Custom
- **Languages:** Java, Kotlin, GLSL (shaders)
