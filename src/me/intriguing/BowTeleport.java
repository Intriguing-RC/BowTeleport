package me.intriguing;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BowTeleport extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TeleportBowEvent(), this);
    }

}
