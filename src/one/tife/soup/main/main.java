package one.tife.soup.main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
        System.out.println("Enabled Tife's Simple Soup.");
    }
    
    @EventHandler
    public void PlayerSoupInteractEvent (PlayerInteractEvent event) {
        Player player = event.getPlayer;
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            //Checks if item is a mushroom soup (MUSHROOM_STEW for later versions) and checks if the item is not null or vice versa
            if (player.getInventory().getItemInMainHand() != null && player.getInventory.getItemInMainHand.equals(Material.MUSHROOM_SOUP)) {
                Player p = event.getPlayer();
                if (p.getHealth() > 11.0) {
                    p.setHealth(20.0);
                    event.getItem().setType(Material.BOWL);
                }
                else {
                    p.setHealth(p.getHealth() + 8.0);
                    event.getItem().setType(Material.BOWL);
                }
            }
        }
    }
}
