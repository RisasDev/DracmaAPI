package dev.risas.dracma;

import org.bukkit.plugin.IllegalPluginAccessException;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Risas
 * Project: Dracma
 * Date: 10-01-2023
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public class DracmaPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    @Override
    public void onDisable() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void onReload() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public static DracmaPlugin getPlugin() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
