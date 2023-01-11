package dev.risas.dracma.user;

import dev.risas.dracma.DracmaPlugin;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;
import java.util.UUID;

public class UserManager {

    private final DracmaPlugin plugin;

    private IUser user;
    private final Map<UUID, User> users;

    public UserManager(DracmaPlugin plugin) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User getUser(UUID uuid) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User getUser(String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public User createUser(UUID uuid, String name) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void saveUser(User user, boolean async) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void loadUser(User user, boolean byName) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void destroyUser(User user) {
        throw new IllegalPluginAccessException("API is not registered");
    }

    public void onDisable() {
        throw new IllegalPluginAccessException("API is not registered");
    }
}
