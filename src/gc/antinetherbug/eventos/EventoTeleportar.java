package gc.antinetherbug.eventos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

import gc.antinetherbug.Main;

public class EventoTeleportar implements Listener{

	@EventHandler
	public void aoTeleportar(PlayerTeleportEvent e){
		if(e.getTo().getWorld().getName().equalsIgnoreCase(Main.plugin.getConfig().getString("Nome_mundo_nether"))){
			if(e.getTo().getY() > 126){
				e.setCancelled(true);
				e.getPlayer().teleport(e.getTo().getWorld().getSpawnLocation());
			}
		}
	}
	
}
