package prefix;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;




public class prefix implements Listener{
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if(e.getPlayer().hasPermission("rang.Owner")) {
			e.setFormat("§4Owner §4§l| §4§L" + e.getPlayer().getDisplayName() + "§f§7 ▷ §c" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.Admin")){
			e.setFormat("§cAdmin §7§l| §c§L" + e.getPlayer().getDisplayName() + "§f ▷ §c" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.Moderator")){
			e.setFormat("§aModerator §7§l| §a§L" + e.getPlayer().getDisplayName() + "§f ▷ §a" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.Supporter")) {
			e.setFormat("§eSupporter §7§l| §e§L" + e.getPlayer().getDisplayName() + "§f ▷ §e" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.Developer")) {
			e.setFormat("§bDeveloper §7§l| §b§L" + e.getPlayer().getDisplayName() + "§f ▷ §b" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.YouTuber")) {
			e.setFormat("§5§lYou§c§lTuber §7§l| §d§L" + e.getPlayer().getDisplayName() + "§f ▷ §d" + e.getMessage());
			
		} else if (e.getPlayer().hasPermission("rang.Twitch")) {
			e.setFormat("§5§lTwitch §7§l| §5§L" + e.getPlayer().getDisplayName() + "§f ▷ §5" + e.getMessage());
			
	    }else if (e.getPlayer().hasPermission("rang.Builder")){
	    		e.setFormat("§2§lBuilder §2§l| §2§L" + e.getPlayer().getDisplayName() + "§f ▷ §2" + e.getMessage());
	    		
	    } else if (e.getPlayer().hasPermission("rang.Premium")){
	    		e.setFormat("§l§6Premium §6§l| §6§L" + e.getPlayer().getDisplayName() + "§f ▷ §6" + e.getMessage());
	    		
	    }else {
    		e.setFormat("§7§lSpieler §7§l| §7§L" + e.getPlayer().getDisplayName() + "§f ▷ §7" + e.getMessage());
	    }
	  }




}
