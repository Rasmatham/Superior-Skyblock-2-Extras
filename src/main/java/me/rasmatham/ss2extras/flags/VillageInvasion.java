package me.rasmatham.ss2extras.flags;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblockAPI;
import com.bgsoftware.superiorskyblock.api.island.Island;
import me.rasmatham.ss2extras.RegisteredFlags;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class VillageInvasion implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onPhantomSpawn(CreatureSpawnEvent e) {
        Island island = SuperiorSkyblockAPI.getIslandAt(e.getLocation());
        if (island == null)
            return;
        if (e.getSpawnReason() != CreatureSpawnEvent.SpawnReason.VILLAGE_INVASION)
            return;
        e.setCancelled(!island.hasSettingsEnabled(RegisteredFlags.VILLAGE_INVASION));
    }
}
