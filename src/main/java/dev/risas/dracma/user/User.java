package dev.risas.dracma.user;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class User {

    public User(UUID uuid, String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public int getCurrency(String currency) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCurrency(String currency, int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCurrency(String currency, int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCurrency(String currency, int amount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
