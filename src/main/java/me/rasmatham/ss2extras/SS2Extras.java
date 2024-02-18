package me.rasmatham.ss2extras;

import me.rasmatham.ss2extras.flags.*;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SS2Extras extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        Server server = getServer();
        PluginManager pluginManager = server.getPluginManager();
        pluginManager.registerEvents(new RegisteredFlags(), this);
        pluginManager.registerEvents(new Fireball(), this);
        pluginManager.registerEvents(new PhantomSpawn(), this);
        pluginManager.registerEvents(new PillagerPatrol(), this);
        pluginManager.registerEvents(new PortalSpawn(), this);
        pluginManager.registerEvents(new VillageInvasion(), this);
        pluginManager.registerEvents(new VillageRaid(), this);
    }
}
