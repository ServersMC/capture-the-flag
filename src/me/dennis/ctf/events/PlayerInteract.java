package me.dennis.ctf.events;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Wool;

public class PlayerInteract implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		//Player player = event.getPlayer();
		Action action = event.getAction();
		Block clickedBlock = event.getClickedBlock();

		if (!action.equals(Action.LEFT_CLICK_BLOCK)) {
			return;
		}
		
		if (!clickedBlock.getType().equals(Material.WOOL)) {
			return;
		}
		
		Wool wool = (Wool) clickedBlock;
		
		if (wool.getColor().equals(DyeColor.WHITE)) {
			wool.setColor(DyeColor.RED);
		}
		else {
			wool.setColor(DyeColor.WHITE);
		}
	}
	
}
