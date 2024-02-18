package me.rasmatham.ss2extras.flags;

import com.bgsoftware.superiorskyblock.api.SuperiorSkyblockAPI;
import com.bgsoftware.superiorskyblock.api.island.Island;
import me.rasmatham.ss2extras.RegisteredFlags;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class Fireball implements Listener {

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        Island island = SuperiorSkyblockAPI.getIslandAt(e.getLocation());
        if (island == null)
            return;
        if (e.getEntityType() != EntityType.FIREBALL)
            return;
        e.setCancelled(!island.hasSettingsEnabled(RegisteredFlags.FIREBALL));
    }
}
