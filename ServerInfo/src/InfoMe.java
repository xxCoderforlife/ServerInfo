package me.Coderforlife.InfoMe;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class InfoMe
  extends JavaPlugin
{
	  String BukkitVersion = "ServerInfo.BukkitVersion";
	  String ServerIP = "ServerInfo.ServerIP";
	  String ServerPort = "ServerInfo.ServerPort";
	  String BannedPlayers = "ServerInfo.BannedPlayers";
	  String MaxPlayers = "ServerInfo.MaxPlayers";
	  String SpawnRadius = "ServerInfo.SpawnRadius";
	  String OPS = "ServerInfo.OPS";
	  String ShutdownMessage = "ServerInfo.ShutDownMessage";
	  String ConnectionThrottle = "ServerInfo.ConnectionThrottle";
	  String ServerMessagener = "ServerInfo.ServerMessagener";
	  String ServerMOTD = "ServerInfo.ServerMOTD";
	  String ViewDistance = "ServerInfo.ViewDisance";
	  String WorldType = "ServerInfo.WorldType";
	  String AllowEnd = "ServerInfo.AllowEnd";
	  String AllowNether = "ServerInfo.AllowNether";
	  String AllowFlight = "ServerInfo.AllowFlight";
	  String GenerateStructures = "ServerInfo.GenerateStructures";
	  String HelpMap = "ServerInfo.HelpMap";
	final String prefix = ChatColor.DARK_AQUA + "[" + ChatColor.BLUE + "Server Info"
+  ChatColor.DARK_AQUA + "] " + ChatColor.RESET;  
	final String perm = ChatColor.DARK_RED + "You can not use this command.";
  public void onEnable()
  {
	  loadConfig();
  }
  
  public void onDisable(){}
  
  public void loadConfig(){
	  getConfig().options().header("Server Info Config");
	  getConfig().options().copyDefaults(true);
	  getConfig().addDefault(BukkitVersion, true);
	  getConfig().addDefault(ServerIP, true);
	  getConfig().addDefault(ServerPort, true);
	  getConfig().addDefault(BannedPlayers, true);
	  getConfig().addDefault(MaxPlayers, true);
	  getConfig().addDefault(SpawnRadius, true);
	  getConfig().addDefault(OPS, true);
	  getConfig().addDefault(ShutdownMessage, true);
	  getConfig().addDefault(ConnectionThrottle, true);
	  getConfig().addDefault(ServerMessagener, true);
	  getConfig().addDefault(ServerMOTD, true);
	  getConfig().addDefault(ViewDistance, true);
	  getConfig().addDefault(WorldType, true);
	  getConfig().addDefault(AllowEnd, true);
	  getConfig().addDefault(AllowNether, true);
	  getConfig().addDefault(AllowFlight, true);
	  getConfig().addDefault(GenerateStructures, true);
	  getConfig().addDefault(HelpMap, true);
	  saveConfig();
	  
  }

public boolean onCommand(CommandSender sender, Command command, String Commandlabel, String[] args){
	if(command.getName().equalsIgnoreCase("info")){
		if(args.length == 0){
			if(sender instanceof Player){
				Player p = (Player) sender;
				p.sendMessage(prefix + ChatColor.DARK_RED + "Use Command " + ChatColor.WHITE + "/info server");
				p.sendMessage(prefix + ChatColor.DARK_RED + "Use Command " + ChatColor.WHITE + "/info ram");

			}
		}else if(args[0].equalsIgnoreCase("server")){
			if(sender instanceof Player){
				Player p = (Player) sender;
				if(p.hasPermission("ServerInfo.server")){
			          p.sendMessage(ChatColor.RED + "----------" + ChatColor.BLUE + "Server Info" + ChatColor.RED + "----------");
			          if(getConfig().getBoolean(BukkitVersion) == true){
				          p.sendMessage(ChatColor.GREEN + " [Spigot/BukkitVersion] " + ChatColor.RED + p.getServer().getBukkitVersion());
			        	  
			          }
			          if(getConfig().getBoolean(ServerIP) == true){
			        	  if(p.getServer().getIp().isEmpty()){
			        		  //NOT SENDING ANY MESSAGES
			        	  }else{
					          p.sendMessage(ChatColor.GREEN + " [ServerIP] " + ChatColor.RED + p.getServer().getIp());

			        	  }

			          }
			          if(getConfig().getBoolean(ServerPort) == true){
				          p.sendMessage(ChatColor.GREEN + " [ServerPort] " + ChatColor.RED + p.getServer().getPort());

			          }
			          if(getConfig().getBoolean(BannedPlayers) == true){
				          p.sendMessage(ChatColor.GREEN + " [Banned Players] " + ChatColor.RED + p.getServer().getBannedPlayers().size());

			          }
			          if(getConfig().getBoolean(MaxPlayers) ==  true){
				          p.sendMessage(ChatColor.GREEN + " [Max Players] " + ChatColor.RED + p.getServer().getMaxPlayers());

			          }
			          if(getConfig().getBoolean(SpawnRadius) == true){
				          p.sendMessage(ChatColor.GREEN + " [Spawn Radius] " + ChatColor.RED + p.getServer().getSpawnRadius() + ChatColor.RED + " Blocks");

			          }
			          if(getConfig().getBoolean(OPS) == true){
				          p.sendMessage(ChatColor.GREEN + " [OP's] " + ChatColor.RED + p.getServer().getOperators().size());

			          }
			          if(getConfig().getBoolean(ShutdownMessage) == true){
				          p.sendMessage(ChatColor.GREEN + " [Shutdown Message] " + ChatColor.RED + p.getServer().getShutdownMessage());

			          }
			          if(getConfig().getBoolean(ConnectionThrottle) == true){
				          p.sendMessage(ChatColor.GREEN + " [Connection Throttle] " + ChatColor.RED + p.getServer().getConnectionThrottle());

			          }
			          if(getConfig().getBoolean(ServerMessagener) == true){
				          p.sendMessage(ChatColor.GREEN + " [Server Messagener] " + ChatColor.RED + p.getServer().getMessenger());
  
			          }
			          if(getConfig().getBoolean(ServerMOTD) == true){
				          p.sendMessage(ChatColor.GREEN + " [Server MOTD] " + ChatColor.RED + p.getServer().getMotd());
  
			          }
			          if(getConfig().getBoolean(ViewDistance) == true){
				          p.sendMessage(ChatColor.GREEN + " [View Distance] " + ChatColor.RED + p.getServer().getViewDistance());

			          }
			          if(getConfig().getBoolean(WorldType) == true){
				          p.sendMessage(ChatColor.GREEN + " [World Type] " + ChatColor.RED + p.getServer().getWorldType());

			          }
			          if(getConfig().getBoolean(AllowEnd) == true){
				          p.sendMessage(ChatColor.GREEN + " [Allow End] " + ChatColor.RED + p.getServer().getAllowEnd());

			          }
			          if(getConfig().getBoolean(AllowNether) == true){
				          p.sendMessage(ChatColor.GREEN + " [Allow Nether] " + ChatColor.RED + p.getServer().getAllowNether());

			          }
			          if(getConfig().getBoolean(AllowFlight) == true){
				          p.sendMessage(ChatColor.GREEN + " [Allow Flight] " + ChatColor.RED + p.getServer().getAllowFlight());

			          }
			          if(getConfig().getBoolean(GenerateStructures) == true){
				          p.sendMessage(ChatColor.GREEN + " [Generate Structures] " + ChatColor.RED + p.getServer().getGenerateStructures());

			          }
			          if(getConfig().getBoolean(HelpMap) == true){
				          p.sendMessage(ChatColor.GREEN + " [Help Map] " + ChatColor.RED + p.getServer().getHelpMap().toString());

			          }
				}else{
					p.sendMessage(perm);
				}
			}else{
		          sender.sendMessage(ChatColor.RED + "----------" + ChatColor.BLUE + "Server Info" + ChatColor.RED + "----------");
		          if(getConfig().getBoolean(BukkitVersion) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Bukkit.Version] " + ChatColor.RED + Bukkit.getServer().getBukkitVersion().toString());

		          }
		          if(getConfig().getBoolean(ServerIP) == true){
		        	  if(Bukkit.getServer().getIp().isEmpty()){
		        		  //NOT SENDING ANY MESSAGES
		        	  }else{
				          sender.sendMessage(ChatColor.GREEN + " [ServerIP] " + ChatColor.RED + Bukkit.getServer().getIp());

		        	  }

		          }
		          if(getConfig().getBoolean(ServerPort) == true){
			          sender.sendMessage(ChatColor.GREEN + " [ServerPort] " + ChatColor.RED + Bukkit.getServer().getPort());

		          }
		          if(getConfig().getBoolean(BannedPlayers) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Banned Players] " + ChatColor.RED + Bukkit.getServer().getBannedPlayers().size());

		          }
		          if(getConfig().getBoolean(MaxPlayers) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Max Players] " + ChatColor.RED + Bukkit.getServer().getMaxPlayers());

		          }
		          if(getConfig().getBoolean(SpawnRadius) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Spawn Radius] " + ChatColor.RED + Bukkit.getServer().getSpawnRadius() + ChatColor.RED + " Blocks");

		          }
		          if(getConfig().getBoolean(OPS) == true){
			          sender.sendMessage(ChatColor.GREEN + " [OP's] " + ChatColor.RED + Bukkit.getServer().getOperators().size());

		          }
		          if(getConfig().getBoolean(ShutdownMessage) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Shutdown Message] " + ChatColor.RED + Bukkit.getServer().getShutdownMessage());

		          }
		          if(getConfig().getBoolean(ConnectionThrottle) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Connection Throttle] " + ChatColor.RED + Bukkit.getServer().getConnectionThrottle());
 
		          }
		          if(getConfig().getBoolean(ServerMessagener) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Server Messagener] " + ChatColor.RED + Bukkit.getServer().getMessenger().toString());

		          }
		          if(getConfig().getBoolean(ServerMOTD) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Server MOTD] " + ChatColor.RED + Bukkit.getServer().getMotd());

		          }
		          if(getConfig().getBoolean(ViewDistance) == true){
			          sender.sendMessage(ChatColor.GREEN + " [View Distance] " + ChatColor.RED + Bukkit.getServer().getViewDistance());

		          }
		          if(getConfig().getBoolean(WorldType) == true){
			          sender.sendMessage(ChatColor.GREEN + " [World Type] " + ChatColor.RED + Bukkit.getServer().getWorldType());

		          }
		          if(getConfig().getBoolean(AllowEnd) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Allow End] " + ChatColor.RED + Bukkit.getServer().getAllowEnd());

		          }
		          if(getConfig().getBoolean(AllowNether) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Allow Nether] " + ChatColor.RED + Bukkit.getServer().getAllowNether());

		          }
		          if(getConfig().getBoolean(AllowFlight) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Allow Flight] " + ChatColor.RED + Bukkit.getServer().getAllowFlight());

		          }
		          if(getConfig().getBoolean(GenerateStructures) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Generate Structures] " + ChatColor.RED + Bukkit.getServer().getGenerateStructures());

		          }
		          if(getConfig().getBoolean(HelpMap) == true){
			          sender.sendMessage(ChatColor.GREEN + " [Help Map] " + ChatColor.RED + Bukkit.getServer().getHelpMap());

		          }
			}
		}else if(args[0].equalsIgnoreCase("ram")){
			if(sender instanceof Player){
				Player p = (Player) sender;
				if(p.hasPermission("ServerInfo.ram")){
			          double freeram = Math.floor(Runtime.getRuntime().freeMemory() / 1024L / 1024L);
			          double maxram = Math.floor(Runtime.getRuntime().maxMemory() / 1024L / 1024L);
			          int usedram = (int)(maxram - freeram);
			          p.sendMessage(ChatColor.RED + "----------" + ChatColor.BLUE + "Ram Info" + ChatColor.RED + "----------");
			          p.sendMessage(ChatColor.GREEN + "Max RAM - " + maxram + ChatColor.RED + " MB");
			          p.sendMessage(ChatColor.GREEN + "Used RAM - " + usedram + ChatColor.RED + " MB");
			          p.sendMessage(ChatColor.GREEN + "Free RAM - " + freeram + ChatColor.RED + " MB");
				}else{
					p.sendMessage(perm);
				}
			}else{
		          double freeram = Math.floor(Runtime.getRuntime().freeMemory() / 1024L / 1024L);
		          double maxram = Math.floor(Runtime.getRuntime().maxMemory() / 1024L / 1024L);
		          int usedram = (int)(maxram - freeram);
		          sender.sendMessage(ChatColor.RED + "----------" + ChatColor.BLUE + "Ram Info" + ChatColor.RED + "----------");
		          sender.sendMessage(ChatColor.GREEN + "Max RAM - " + maxram + ChatColor.RED + " MB");
		          sender.sendMessage(ChatColor.GREEN + "Used RAM - " + usedram + ChatColor.RED + " MB");
		          sender.sendMessage(ChatColor.GREEN + "Free RAM - " + freeram + ChatColor.RED + " MB");
			}
		}else if(args[0].equalsIgnoreCase("reload")){
			if(sender instanceof Player){
				Player p = (Player) sender;
				if(p.hasPermission("ServerInfo.reload")){
					try{
						p.sendMessage(prefix + ChatColor.GREEN + "Reloading config...");
						reloadConfig();
						p.sendMessage(prefix + ChatColor.GREEN + "Reloaded Config");
					}catch (Exception e){
						p.sendMessage(ChatColor.DARK_RED + "Error:" + ChatColor.WHITE + "Check console for error.");
						p.sendMessage(ChatColor.DARK_PURPLE + "Let xxCoderforlife know as well, on Spigot.");
						e.printStackTrace();
					}
				}else{
					p.sendMessage(perm);
				}
			}
		}
		
	}
	return true;
  }
}
