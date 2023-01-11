package dev.risas.dracma.user;

import org.bukkit.entity.Player;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class User {

    private UUID uuid;
    private String name;
    private int coins;

    public User(UUID uuid, String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCoins(int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCoins(int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCoins(int coins) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public Player getPlayer() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
