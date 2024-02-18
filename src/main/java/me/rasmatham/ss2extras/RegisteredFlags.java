package me.rasmatham.ss2extras;

import com.bgsoftware.superiorskyblock.api.events.PluginInitializeEvent;
import com.bgsoftware.superiorskyblock.api.island.IslandFlag;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class RegisteredFlags implements Listener {
    public static IslandFlag FIREBALL;
    public static IslandFlag PHANTOM_SPAWN;
    public static IslandFlag PILLAGER_PATROL;
    public static IslandFlag PORTAL_SPAWN;
    public static IslandFlag VILLAGE_INVASION;
    public static IslandFlag VILLAGE_RAID;

    @EventHandler
    public void onPluginInit(PluginInitializeEvent e) {
        IslandFlag.register("FIREBALL");
        IslandFlag.register("PHANTOM_SPAWN");
        IslandFlag.register("PILLAGER_PATROL");
        IslandFlag.register("PORTAL_SPAWN");
        IslandFlag.register("VILLAGE_INVASION");
        IslandFlag.register("VILLAGE_RAID");
        FIREBALL = IslandFlag.getByName("FIREBALL");
        PHANTOM_SPAWN = IslandFlag.getByName("PHANTOM_SPAWN");
        PILLAGER_PATROL = IslandFlag.getByName("PILLAGER_PATROL");
        PORTAL_SPAWN = IslandFlag.getByName("PORTAL_SPAWN");
        VILLAGE_INVASION = IslandFlag.getByName("VILLAGE_INVASION");
        VILLAGE_RAID = IslandFlag.getByName("VILLAGE_RAID");
    }
}
