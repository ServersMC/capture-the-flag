package me.dennis.ctf.interfaces;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class MC_Command implements CommandExecutor {

	public abstract void execute(CommandSender sender, String[] args);
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		execute(sender, args);
		return true;
	}

}
