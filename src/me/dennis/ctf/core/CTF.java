package me.dennis.ctf.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.dennis.ctf.commands.CmdCTF;
import me.dennis.ctf.events.PlayerInteract;
import me.dennis.ctf.utils.Console;

public class CTF extends JavaPlugin {
	
	public static CTF PLUGIN;
	
	@Override
	public void onEnable() {
		// Plugin Initializer
		PLUGIN = this;
		
		// Command Handler
		getCommand("ctf").setExecutor(new CmdCTF());
		
		// Event Handler
		Bukkit.getPluginManager().registerEvents(new PlayerInteract(), this);
		
		// Done
		Console.info("Done!");
	}

}
