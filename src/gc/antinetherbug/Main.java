package gc.antinetherbug;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import gc.antinetherbug.eventos.EventoTeleportar;

public class Main extends JavaPlugin{
	
	
	@Override
	public void onEnable() {
		sendMessages();
		setupEventos();
	}
	
	private void sendMessages(){
		ConsoleCommandSender console = getServer().getConsoleSender();
		console.sendMessage(ChatColor.GREEN + "##############################################");
		console.sendMessage(ChatColor.GREEN + "# GcAntiNetherBug desenvolvido por @GCunhaBR #");
		console.sendMessage(ChatColor.GREEN + "##############################################");
	}
	
	private void setupEventos(){
		getServer().getPluginManager().registerEvents(new EventoTeleportar(), this);
	}
	
	
}
