package me.dennis.ctf.events;

import org.bukkit.DyeColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.material.Wool;

public class PlayerInteract implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();

		if (!player.getGameMode().equals(GameMode.SURVIVAL)) {
			return;
		}
		
		if (!action.equals(Action.LEFT_CLICK_BLOCK)) {
			return;
		}

		BlockState clickedBlock = event.getClickedBlock().getState();
		
		if (!clickedBlock.getType().equals(Material.WOOL)) {
			return;
		}
		
		Wool wool = (Wool) clickedBlock.getData();
		
		if (wool.getColor().equals(DyeColor.WHITE)) {
			wool.setColor(DyeColor.RED);
			player.sendMessage(wool.getColor().name());
		}
		else {
			wool.setColor(DyeColor.WHITE);
		}

		clickedBlock.setData(wool);
		clickedBlock.update();
	}
	
}
