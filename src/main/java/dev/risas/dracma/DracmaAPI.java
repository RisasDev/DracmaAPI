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

    public int getCurrency(String userName, String currency) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCurrency(UUID uuid, String currency) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCurrency(String userName, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCurrency(UUID uuid, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCurrency(String name, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCurrency(UUID uuid, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCurrency(String name, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCurrency(UUID uuid, String currencyName, int currencyAmount) {
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
