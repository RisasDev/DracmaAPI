package dev.risas.dracma.user;

import org.bukkit.OfflinePlayer;

/**
 * Created by Risas
 * Project: Dracma
 * Date: 24-08-2022
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public interface IUser {

    User getUser(OfflinePlayer offlinePlayer, boolean load);
    void saveUser(User user);
    void loadUser(User user);
    void reset();
}
