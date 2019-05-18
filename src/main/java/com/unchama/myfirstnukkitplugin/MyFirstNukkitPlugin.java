package com.unchama.myfirstnukkitplugin;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class MyFirstNukkitPlugin extends PluginBase {
    @Override
    public void onLoad() {
        this.getLogger().info(TextFormat.WHITE + "I've been loaded!");
    }

    @Override
    public void onEnable() {
        this.getLogger().info(TextFormat.DARK_GREEN + "I've been enabled!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info(TextFormat.DARK_RED + "I've been disabled!");
    }
}
