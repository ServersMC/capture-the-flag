package me.dennis.ctf.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import me.dennis.ctf.interfaces.MC_Command;

public class CmdCTF extends MC_Command {

	@Override
	public void execute(CommandSender sender, String[] args) {
		if (sender instanceof ConsoleCommandSender) {
			return;
		}
		
	}

}
