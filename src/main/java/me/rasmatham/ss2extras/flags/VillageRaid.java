package me.rasmatham.ss2extras.flags;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblockAPI;
import com.bgsoftware.superiorskyblock.api.island.Island;
import me.rasmatham.ss2extras.RegisteredFlags;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidTriggerEvent;

public class VillageRaid implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onRaidStart(RaidTriggerEvent e) {
        Island island = SuperiorSkyblockAPI.getIslandAt(e.getRaid().getLocation());
        if (island == null)
            return;
        e.setCancelled(!island.hasSettingsEnabled(RegisteredFlags.VILLAGE_RAID));
    }
}
