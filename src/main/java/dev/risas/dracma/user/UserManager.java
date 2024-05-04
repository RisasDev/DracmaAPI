package dev.risas.dracma.user;

import dev.risas.dracma.DracmaPlugin;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class UserManager {

    public UserManager(DracmaPlugin plugin) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User getUser(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User getUserFromDatabase(String name, boolean load) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public boolean userExistsInCache(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User getUserFromCache(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User createUser(UUID uuid, String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void setCurrency(User user, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void addCurrency(User user, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void removeCurrency(User user, String currencyName, int currencyAmount) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void saveUser(User user) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void loadUser(User user) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void destroyUser(User user) {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
