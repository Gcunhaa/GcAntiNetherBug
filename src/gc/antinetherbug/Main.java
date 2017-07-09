package gc.antinetherbug;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import gc.antinetherbug.eventos.EventoTeleportar;

public class Main extends JavaPlugin{
	
	public static Main plugin;
	
	@Override
	public void onEnable() {
		sendMessages();
		setupConfig();
		setupEventos();
		plugin = this;
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
	
	private void setupConfig(){
		if(!new File(getDataFolder(), "config.yml").exists()){
			saveDefaultConfig();
			ConsoleCommandSender console = getServer().getConsoleSender();
			console.sendMessage(ChatColor.BLUE + "[GcAntiNetherBug] Config.yml gerada com sucesso!");
		}
	}
	
}
