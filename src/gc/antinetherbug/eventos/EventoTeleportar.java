package gc.antinetherbug.eventos;

import org.bukkit.World.Environment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent;

public class EventoTeleportar implements Listener{

	@EventHandler
	public void aoTeleportar(PlayerTeleportEvent e){
		if(e.getTo().getWorld().getEnvironment() == Environment.NETHER){
			if(e.getTo().getY() > 126){
				e.setCancelled(true);
				e.getPlayer().teleport(e.getTo().getWorld().getSpawnLocation());
			}
		}
	}
	
}
