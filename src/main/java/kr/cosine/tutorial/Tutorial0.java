package kr.cosine.tutorial;

import org.bukkit.plugin.java.JavaPlugin;

public class Tutorial0 extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Tutorial Plugin Enabled!!!!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Tutorial Plugin Disabled!!!!");
    }
}
