package me.rasmatham.ss2extras;

import com.bgsoftware.superiorskyblock.api.events.PluginInitializeEvent;
import com.bgsoftware.superiorskyblock.api.island.IslandFlag;
import me.rasmatham.ss2extras.SS2Extras;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Set;
import java.util.logging.Level;

public class RegisteredFlags implements Listener {
    public static IslandFlag FIREBALL;
    public static IslandFlag PHANTOM_SPAWN;
    public static IslandFlag PILLAGER_PATROL;
    public static IslandFlag PORTAL_SPAWN;
    public static IslandFlag VILLAGE_INVASION;
    public static IslandFlag VILLAGE_RAID;

    @EventHandler(ignoreCancelled = true)
    public void onPluginInit(PluginInitializeEvent e) {
        SS2Extras SS2E = SS2Extras.getInstance();
        Set<String> availableIslandSettings = SS2E.getAvailableIslandSettings();
        if (availableIslandSettings.contains("fireball")) {
            IslandFlag.register("FIREBALL");
            FIREBALL = IslandFlag.getByName("FIREBALL");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: FIREBALL");
        }
        if (availableIslandSettings.contains("phantom_spawn")) {
            IslandFlag.register("PHANTOM_SPAWN");
            PHANTOM_SPAWN = IslandFlag.getByName("PHANTOM_SPAWN");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: PHANTOM_SPAWN");
        }
        if (availableIslandSettings.contains("pillager_patrol")) {
            IslandFlag.register("PILLAGER_PATROL");
            PILLAGER_PATROL = IslandFlag.getByName("PILLAGER_PATROL");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: PILLAGER_PATROL");
        }
        if (availableIslandSettings.contains("portal_spawn")) {
            IslandFlag.register("PORTAL_SPAWN");
            PORTAL_SPAWN = IslandFlag.getByName("PORTAL_SPAWN");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: PORTAL_SPAWN");
        }
        if (availableIslandSettings.contains("village_invasion")) {
            IslandFlag.register("VILLAGE_INVASION");
            VILLAGE_INVASION = IslandFlag.getByName("VILLAGE_INVASION");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: VILLAGE_INVASION");
        }
        if (availableIslandSettings.contains("village_raid")) {
            IslandFlag.register("VILLAGE_RAID");
            VILLAGE_RAID = IslandFlag.getByName("VILLAGE_RAID");
            SS2E.getLogger().log(Level.INFO, "Flag enabled: VILLAGE_RAID");
        }
    }
}
