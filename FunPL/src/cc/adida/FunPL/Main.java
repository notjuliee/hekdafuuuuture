package cc.adida.FunPL;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("Hi World");
		
	}
	@Override
	public void onDisable() {
		
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("ehlo") && sender instanceof Player){
			
			Player player = (Player) sender;
			
			player.sendMessage("HI, " + player.getName() + "!");
			
			return true;
			
		}
		
		return false;
	}

}
