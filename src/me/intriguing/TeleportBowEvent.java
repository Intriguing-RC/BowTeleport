package me.intriguing;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TeleportBowEvent implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        if (!(event.getEntity().getShooter() instanceof Player)) return;
        Player player = (Player) event.getEntity().getShooter();
        if (!player.getInventory().getItemInMainHand().getType().equals(Material.BOW)) return;
        if (event.getHitBlock() != null) {
            Location teleportLoc = event.getHitBlock().getLocation().add(0d, 1d, 0d);
            teleportLoc.setYaw(player.getLocation().getYaw());
            teleportLoc.setPitch(player.getLocation().getPitch());
            player.teleport(teleportLoc);
        } else {
            player.teleport(event.getHitEntity());
        }


    }


}
