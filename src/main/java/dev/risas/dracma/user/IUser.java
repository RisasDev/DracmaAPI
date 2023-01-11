package dev.risas.dracma.user;

/**
 * Created by Risas
 * Project: Dracma
 * Date: 24-08-2022
 * Twitter: @RisasDev
 * GitHub: https://github.com/RisasDev
 */

public interface IUser {

    User getUser(String name);
    void saveUser(User user);
    void loadUser(User user, boolean byName);
    boolean isConnected();
    void disconnect();
    void reset();
}
