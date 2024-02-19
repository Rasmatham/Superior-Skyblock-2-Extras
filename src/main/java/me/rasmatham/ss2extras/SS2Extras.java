package me.rasmatham.ss2extras;

import me.rasmatham.ss2extras.flags.*;
import org.bukkit.Server;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;

public final class SS2Extras extends JavaPlugin {
    private Set<String> availableIslandSettings;

    private static SS2Extras instance = null;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        File configFile = new File(SS2Extras.getInstance().getDataFolder(), "../SuperiorSkyblock2/menus/settings.yml");

        FileConfiguration config = new YamlConfiguration();

        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

        availableIslandSettings = Objects.requireNonNull(config.getConfigurationSection("settings")).getKeys(false);

        Server server = getServer();
        PluginManager pluginManager = server.getPluginManager();
        pluginManager.registerEvents(new RegisteredFlags(), this);
        if (availableIslandSettings.contains("fireball")) {
            pluginManager.registerEvents(new Fireball(), this);
            }
        if (availableIslandSettings.contains("phantom_spawn")) {
            pluginManager.registerEvents(new PhantomSpawn(), this);
        }
        if (availableIslandSettings.contains("pillager_patrol")) {
            pluginManager.registerEvents(new PillagerPatrol(), this);
        }
        if (availableIslandSettings.contains("portal_spawn")) {
            pluginManager.registerEvents(new PortalSpawn(), this);
        }
        if (availableIslandSettings.contains("village_invasion")) {
            pluginManager.registerEvents(new VillageInvasion(), this);
        }
        if (availableIslandSettings.contains("village_raid")) {
            pluginManager.registerEvents(new VillageRaid(), this);
        }
    }
    public static SS2Extras getInstance() {
        return instance;
    }
    public Set<String> getAvailableIslandSettings() {
        return this.availableIslandSettings;
    }
}
