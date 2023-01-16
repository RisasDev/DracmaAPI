package dev.risas.dracma;

import dev.risas.dracma.user.UserManager;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

/**
 * Created by Risas
 * Project: Dracma
 * Date: 10-01-2023
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public class DracmaAPI {

    private final UserManager userManager;

    public DracmaAPI() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCoins(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCoins(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCoins(String name, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCoins(UUID uuid, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCoins(String name, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCoins(UUID uuid, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCoins(String name, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCoins(UUID uuid, int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean isGlobalDiscount() {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setGlobalDiscount(int globalDiscount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getGlobalDiscount() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
