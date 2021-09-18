package prefixsystemmain;



import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Scoreboard;

import prefix.prefix;






public class Main extends JavaPlugin implements Listener{
	public static Main instance;
	
	
	public static Main getInstance() {
		return instance;
	}

	Scoreboard sb;


	public void onEnable() {
		getServer().getConsoleSender().sendMessage("v0.1");
		getServer().getConsoleSender().sendMessage( ChatColor.GREEN + "\n  _____________________________ \n |                             | \n | Plugin By RookDash          |\n | Das Plugin ist Gestartet!   |\n |                             |\n |_____________________________| \n ");
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new prefix(), this);

		Bukkit.getPluginManager().registerEvents(this, this);
		
		sb = Bukkit.getScoreboardManager().getNewScoreboard();
		
		
		sb.registerNewTeam("00001Owner");
		sb.registerNewTeam("00002Admin");
		sb.registerNewTeam("00003Mod");
		sb.registerNewTeam("00004Supporter");
		sb.registerNewTeam("00005Developer");
		sb.registerNewTeam("00006Builder");
		sb.registerNewTeam("00007YouTuber");
		sb.registerNewTeam("00008Twitch");
		sb.registerNewTeam("00009Premium");
		sb.registerNewTeam("00010Spieler");
		
		
		sb.getTeam("00001Owner").setPrefix("§4Owner |§4 ");
		sb.getTeam("00002Admin").setPrefix("§cAdmin |§c ");
		sb.getTeam("00003Mod").setPrefix("§aMod |§a ");
		sb.getTeam("00004Supporter").setPrefix("§eSupporter |§e ");
		sb.getTeam("00005Developer").setPrefix("§bDeveloper |§b ");
		sb.getTeam("00006Builder").setPrefix("§2Builder |§l ");
		sb.getTeam("00007YouTuber").setPrefix("§dYouTuber |§5 ");
		sb.getTeam("00008Twitch").setPrefix("§5Twitch |§5 ");
		sb.getTeam("00009Premium").setPrefix("§6Premium |§l ");
		sb.getTeam("00010Spieler").setPrefix("§7Spieler |§7 ");

		
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		setPrefix(e.getPlayer());
	}

		
	
	
	private void setPrefix(Player p) {
		String team = "";
		
		
		if(p.hasPermission("rang.Owner") || p.isOp()) {
			team  = "00001Owner";
		 }else if (p.hasPermission("rang.Admin")) {
			 team  = "00002Admin";
		 }else if (p.hasPermission("rang.Moderator")) {
			 team  = "00003Mod";
		 }else if (p.hasPermission("rang.Supporter")) {
			 team  = "00004Supporter";
		 }else if (p.hasPermission("rang.Developer")) {
			 team  = "00005Developer";
		 }else if (p.hasPermission("rang.Builder")) {
			 team  = "00006Builder";
		 }else if (p.hasPermission("rang.YouTuber")) {
			 team  = "00007YouTuber";
		 }else if (p.hasPermission("rang.Twitch")) {
			 team  = "00008Twitch";
		 }else if (p.hasPermission("rang.Premium")) {
			 team  = "00009Premium";
		 }else {
			 team  = "00010Spieler";
		 }
		
		sb.getTeam(team).addPlayer(p);
		
		for(Player all : Bukkit.getOnlinePlayers()) {
			all.setScoreboard(sb);
		}
		
	}
	
	
		
	

	public void onDisable() {

		getServer().getConsoleSender().sendMessage( ChatColor.RED + "\n  _____________________________ \n |                             | \n | Plugin By RookDash          |\n | Das Plugin ist Deaktiviert! |\n |                             |\n |_____________________________| \n ");

	}
	



}
