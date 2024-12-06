package me.mchiappinam.pdghgladiador;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;

public class ListenerLegendchat implements Listener {
	private Main plugin;
	public ListenerLegendchat(Main main) {
		plugin=main;
	}

	@EventHandler(priority=EventPriority.HIGHEST)
	private void onChat(ChatMessageEvent e) {
		if(plugin.getConfig().getStringList("Vencedores").contains(e.getSender().getName().toLowerCase())) {
			e.setTagValue("gladiador", plugin.getConfig().getString("Premios.Tag"));
		}
	}
}
